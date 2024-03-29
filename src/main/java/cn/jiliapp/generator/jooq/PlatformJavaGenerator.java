package cn.jiliapp.generator.jooq;

import org.jooq.codegen.GeneratorStrategy;
import org.jooq.codegen.JavaGenerator;
import org.jooq.codegen.JavaWriter;
import org.jooq.meta.TableDefinition;
import org.jooq.tools.JooqLogger;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.IOException;

public class PlatformJavaGenerator  extends JavaGenerator {
    private static final JooqLogger log = JooqLogger.getLogger(PlatformJavaGenerator.class);


    /**
     * 重写了 generateDao， 具体的生成逻辑还是调用父级的方法，只是在生成完成后，获取文件内容，
     * 然后对文件指定的内容进行替换操作
     *
     * @param table
     */
    @Override
    protected void generateDao(TableDefinition table) {
        super.generateDao(table);
        File file = getFile(table, GeneratorStrategy.Mode.DAO);
        if (file.exists()) {
            try {
                //此处更新编码格式，防止中文编码错误
                String fileContent = new String(FileCopyUtils.copyToByteArray(file),"utf-8");
                String oldExtends = " extends DAOImpl";
                String newExtends = " extends AbstractDAOExtendImpl";
                fileContent = fileContent.replace("import org.jooq.impl.DAOImpl;\n", "");
                fileContent = fileContent.replace(oldExtends, newExtends);
                FileCopyUtils.copy(fileContent.getBytes("utf-8"), file);
            } catch (IOException e) {
                log.error("generateDao error: {}", file.getAbsolutePath(), e);
            }
        }
    }

    @Override
    protected void generateDao(TableDefinition table, JavaWriter out) {
        log.debug("generateDao ----------out--------------------");
        out.ref("cn.jiliapp.parent.jooq.extend.AbstractDAOExtendImpl");
        super.generateDao(table, out);
    }





}
