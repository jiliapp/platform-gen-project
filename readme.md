#### JOOQ 3.15.4  DAO代码生成

````
1. JOOQ 3.15.4 编译需要JDK11,请设置IDEA编译环境
2. 更多生成库，更新profiles中profile即可
3. 生成目录暂时为workspace同级项目路径
4. 执行命令

mvn -P jooq-codegen-meeting  org.jooq:jooq-codegen-maven:3.15.4:generate 

xml文件拆分
mvn org.jooq:jooq-codegen-maven:3.15.4:generate -f oauth2.xml  

mvn org.jooq:jooq-codegen-maven:3.16.6:generate -f user.xml  
mvn org.jooq:jooq-codegen-maven:3.16.6:generate -f common.xml
mvn org.jooq:jooq-codegen-maven:3.16.6:generate -f product.xml
mvn org.jooq:jooq-codegen-maven:3.16.6:generate -f payment.xml
mvn org.jooq:jooq-codegen-maven:3.16.6:generate -f park.xml
````
