#### JOOQ 3.15.4  DAO代码生成

````
1. JOOQ 3.15.4 编译需要JDK11,请设置IDEA编译环境
2. 更多生成库，更新profiles中profile即可
3. 生成目录暂时为workspace同级项目路径
4. 执行命令
pom_parent.xml
mvn -P jooq-codegen-ask  org.jooq:jooq-codegen-maven:3.15.4:generate 
mvn -P jooq-codegen-bet  org.jooq:jooq-codegen-maven:3.15.4:generate 
mvn -P jooq-codegen-ad org.jooq:jooq-codegen-maven:3.15.4:generate 
mvn -P jooq-codegen-user  org.jooq:jooq-codegen-maven:3.15.4:generate 


mvn -P jooq-codegen-meeting  org.jooq:jooq-codegen-maven:3.15.4:generate 

xml文件拆分
mvn org.jooq:jooq-codegen-maven:3.15.4:generate -f oauth2.xml  
mvn org.jooq:jooq-codegen-maven:3.15.4:generate -f vending.xml  
mvn org.jooq:jooq-codegen-maven:3.15.4:generate -f ad.xml           
mvn org.jooq:jooq-codegen-maven:3.15.4:generate -f ask.xml         
mvn org.jooq:jooq-codegen-maven:3.15.4:generate -f bet.xml         
mvn org.jooq:jooq-codegen-maven:3.15.4:generate -f control.xml    
mvn org.jooq:jooq-codegen-maven:3.15.4:generate -f data.xml        
mvn org.jooq:jooq-codegen-maven:3.15.4:generate -f market.xml       
mvn org.jooq:jooq-codegen-maven:3.15.4:generate -f goal.xml        
mvn org.jooq:jooq-codegen-maven:3.15.4:generate -f meeting.xml      
mvn org.jooq:jooq-codegen-maven:3.15.4:generate -f payment.xml      
mvn org.jooq:jooq-codegen-maven:3.15.4:generate -f system.xml       
mvn org.jooq:jooq-codegen-maven:3.15.4:generate -f user.xml         

````
