# dubbo-example-consumer
Restful web service that calls the [dubbo-example-provider](../dubbo-example-provider) to create messages.

## Building the Consumer
From the root project, run the following command to build the consumer:

    ./gradlew build

## Running the Consumer
From the root project, run the following command to start the consumer:

    ./gradlew :dubbo-example-consumer:run
    
## API
The following restful API is exposed by the consumer:

### Get Hello Message
Get a hello message for the specified name.

#### Request
* HTTP Method: GET
* URL: http://localhost:8080/hello
* Query Parameters:

    | Name | Value           | Required  |
    |------|-----------------|-----------|
    | name | hello recipient | true      |
    
#### Success
* Status: 200 OK
* Body:

        Hello, World!

<hr>

### Get Goodbye Message
Get a generic goodbye message.

#### Request
* HTTP Method: GET
* URL: http://localhost:8080/goodbye
    
#### Success
* Status: 200 OK
* Body:

        Goodbye!
