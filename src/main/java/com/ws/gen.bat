d:
cd D:\workspace-op\cxf\jaxws
wsimport -d ./target/classes -s ./src/main/java -p com.ws.client http://localhost:8080/jaxws/service/sayHi?wsdl
pause