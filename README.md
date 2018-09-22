# dubbo-example
[![Build Status](https://travis-ci.org/gregwhitaker/dubbo-example.svg?branch=master)](https://travis-ci.org/gregwhitaker/dubbo-example)

An example of using [Apache Dubbo](https://dubbo.incubator.apache.org/) for microservice RPC.

This example starts both a Dubbo service and a restful web service. The Dubbo service returns `Hello World!` and `Goodbye!` 
messages. The Dubbo service is accessed by making an HTTP call to the restful web service, which in turn calls the Dubbo service
and returns the message created by the Dubbo service.

## Projects
The following projects make up this example:

* [dubbo-example-api](dubbo-example-api) - Dubbo service API exposed by the provider
* [dubbo-example-consumer](dubbo-example-consumer) - Rest service that calls API exposed by the provider
* [dubbo-example-provider](dubbo-example-provider) - Dubbo service that implements the API

## Building the Example
Run the following Gradle command to build this example:

    ./gradlew clean build
    
## Running the Example
Follow the steps below to run the Dubbo example:

### Starting the Provider

1. In a new terminal, run the following command to start the provider:

        ./gradlew :dubbo-example-provider:run
        
    If the provider starts successfully, you will see the following in the terminal:
    
        2018-09-21 18:45:32.298  INFO 78749 --- [           main] dubbo.example.provider.Application       : Started Application in 1.433 seconds (JVM running for 1.8)
        2018-09-21 18:45:32.300  INFO 78749 --- [pool-1-thread-1] .d.c.e.AwaitingNonWebApplicationListener :  [Dubbo] Current Spring Boot Application is await...

### Starting the Consumer

1. In a new terminal, run the following command to start the consumer:

        ./gradlew :dubbo-example-consumer:run

### Calling the Consumer

1. In a new terminal, run the following command to invoke the `hello` endpoint:

2. Run the following command to invoke the `goodbye` endpoint:

## Bugs and Feedback

For bugs, questions, and discussions please use the [Github Issues](https://github.com/gregwhitaker/dubbo-example/issues).

## License
Copyright 2018 Greg Whitaker

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.