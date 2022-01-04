package cn.jiliapp.generator.jooq;

import org.jooq.codegen.DefaultGeneratorStrategy;
import org.jooq.meta.Definition;
import org.jooq.tools.StringUtils;

/**
 * 自定义策略-增加PO后缀
 */
public class PlatformStrategy extends DefaultGeneratorStrategy {
    private String tablePrefix = null;

    public String getTablePrefix() {
        return tablePrefix;
    }

    public void setTablePrefix(String tablePrefix) {
        this.tablePrefix = tablePrefix;
    }

    @Override
    public String getJavaClassName(Definition definition, Mode mode) {
        StringBuilder result = new StringBuilder();

        String outputName = definition.getOutputName();
        if (!StringUtils.isBlank(tablePrefix) && outputName.startsWith(tablePrefix)) {
            outputName = outputName.substring(tablePrefix.length());
        }
        result.append(StringUtils.toCamelCase(outputName));

        if (mode == Mode.RECORD) {
            result.append("Record");
        } else if (mode == Mode.DAO) {
            result.append("Dao");
        } else if (mode == Mode.INTERFACE) {
            result.insert(0, "I");
        }else if (mode == Mode.POJO) {
            result.append("PO");
        }else if (mode == Mode.DOMAIN) {
            result.append("DO");
        }
        return result.toString();
    }
}
