# MongoDB Error Handling
This repository contains sample code for different MongoDB operations with exception handling.

# Running
* .jar is included in the bin directory, or build the jar using `mvn package`
* To run:
    `java -cp ExceptionHandling.jar org.mongodb.errorHandling.InsertWithErrorHandling -c mongodb://localhost:27017,localhost:27018,localhost:27019`

    `java -cp ExceptionHandling.jar org.mongodb.errorHandling.InsertWithNoErrorHandling -c mongodb://localhost:27017,localhost:27018,localhost:27019`

    `java -cp ExceptionHandling.jar org.mongodb.errorHandling.UpdateWithErrorHandling -c mongodb://localhost:27017,localhost:27018,localhost:27019`

    `java -cp ExceptionHandling.jar org.mongodb.errorHandling.UpdateWithNoErrorHandling -c mongodb://localhost:27017,localhost:27018,localhost:27019`

    `java -cp ExceptionHandling.jar org.mongodb.errorHandling.DeleteWithErrorHandling -c mongodb://localhost:27017,localhost:27018,localhost:27019`

    `java -cp ExceptionHandling.jar org.mongodb.errorHandling.DeleteWithNoErrorHandling -c mongodb://localhost:27017,localhost:27018,localhost:27019`

    Following code is hard coded to connect to localhost at ports 27017, 27018 and 27019 with user admin and password admin. For testing chnage the apssword to admin1 while the code is executing.

    `java -cp ExceptionHandling.jar org.mongodb.errorHandling.InsertWithPasswordChangeHandling.java 


# Build
mvn package

