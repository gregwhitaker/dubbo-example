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

### Get Goodbye Message
Get a generic goodbye message.