f:
cd f:\git\cxf\jaxws
wsimport -d .//target/classes -s ./src/main/java -p com.wjh.client http://localhost:8080/jaxws/Hello?wsdl
pause