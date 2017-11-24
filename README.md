# MongoDB Error Hanling
This repository contains sample code for different mongoDb operations.

# Running
* .jar is included in the bin directory, or build the jar using `mvn package`
* To run:
    `java -cp ExceptionHandling.jar org.mongodb.errorHandling.InsertWithErrorHandling -c mongodb://localhost:27017,localhost:27018,localhost:27019`
    `java -cp ExceptionHandling.jar org.mongodb.errorHandling.InsertWithNoErrorHandling -c mongodb://localhost:27017,localhost:27018,localhost:27019`
    `java -cp ExceptionHandling.jar org.mongodb.errorHandling.UpdateWithErrorHandling -c mongodb://localhost:27017,localhost:27018,localhost:27019`
    `java -cp ExceptionHandling.jar org.mongodb.errorHandling.UpdateWithNoErrorHandling -c mongodb://localhost:27017,localhost:27018,localhost:27019`
    `java -cp ExceptionHandling.jar org.mongodb.errorHandling.DeleteWithErrorHandling -c mongodb://localhost:27017,localhost:27018,localhost:27019`
    `java -cp ExceptionHandling.jar org.mongodb.errorHandling.DeleteWithNoErrorHandling -c mongodb://localhost:27017,localhost:27018,localhost:27019`


# Build
mvn package

