jaxws 入门  运行环境 jdk7

1 执行ServerMain服务端
2.生成服务端java code
wsgen -cp ./target/classes -r ./src/main/resources/wsdl -s ./src/main/java -d ./target/classes -wsdl com.wjh.service.Hello

3 生成客户端java code
wsimport -d .//target/classes -s ./src/main/java -p com.wjh.client http://localhost:8080/jaxws/Hello?wsdl

4.web配置 sun-jaxws.xml，web.xml

5 启动tomcat
http://localhost:8080/jaxws/service/sayHi