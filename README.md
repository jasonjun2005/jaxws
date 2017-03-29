Java WebService 入门  运行环境 jdk7

1 执行ServerMain服务端
2.生成服务端java code
wsgen -cp ./target/classes -r ./src/main/resources/wsdl -s ./src/main/java -d ./target/classes -wsdl com.wjh.service.Hello

3 生成客户端java code
wsimport -d .//target/classes -s ./src/main/java -p com.wjh.client http://localhost:8080/jaxws/Hello?wsdl

4.web配置 sun-jaxws.xml，web.xml

5 启动tomcat
http://localhost:8080/jaxws/service/sayHi

http://localhost:8080/jaxws/service/HelloService



wsgen -cp ./target/classes -r ./src/main/resources/wsdl -s ./src/main/java -d ./target/classes -wsdl com.wjh.service.Hello
	-cp 定义classpath 
	-r 生成 bean的wsdl文件的存放目录 
	-s 生成发布WebService的源代码文件的存放目录（如果方法有抛出异常，则会生成该异常的描述类源文件） 
	-d 生成发布WebService的编译过的二进制类文件的存放目录（该异常的描述类的class文件）

wsimport -d .//target/classes -s ./src/main/java -p com.bonc.client http://localhost:8080/jaxws/Hello?wsdl
	-d 生成客户端执行类的class文件的存放目录
	-s 生成客户端执行类的源文件的存放目录
	-p 定义生成类的包名