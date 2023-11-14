
Link for URLs of Codegen: https://github.com/networknt/light-codegen/releases
Link for Model-Config: https://github.com/networknt/model-config
Link for Open API Generator: https://www.networknt.com/tool/light-codegen/openapi-generator/


>git clone to local directory

git clone https://github.com/networknt/light-codegen/releases.git  (1.16.44)

>git clone to the same local directory

git clone https://github.com/networknt/model-config.git

>open light-codegen in intelliJ

>open light-codegen folder

>run "mvn clean install" in terminal

mvn clean install

>to generate a project run below command 

java -jar .\codegen-cli\target\codegen-cli.jar -f openapi 
	-o C:\Users\name\OneDrive\Desktop\demo\Light4j-demo 
	-m C:\Users\name\OneDrive\Desktop\demo\model-config\rest\openapi\petstore\1.0.0\openapi.json 
	-c C:\Users\name\OneDrive\Desktop\demo\model-config\rest\openapi\petstore\1.0.0\config.json 

>close IDE and open newly created project


