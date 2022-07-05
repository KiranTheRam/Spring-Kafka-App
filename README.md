# Spring-Kafka-App
Using Spring MVC to take data from a post request and send it to Kafka topic. Also has a Kafka Listener that consumes data and prints it to console.
Follows the AmigosCode Example

# Usage
1. Run application
2. Head over to localhost:8080/message and send a post request with "messageContent" as a json value.

Example:
{
"messageContent" : "Hello Kafka!"
}

3. The application will lake the message and have a producer send it to a Kafka topic. There is also a consumer (named KafkaListener) running that will print the messages to the console as they are received.

*Optional*
You can use localhost:8080/message/newMsg/{message} without the json to have the message included right in the url.

Example:
localhost:8080/message/newMsg/Hello Kafka
