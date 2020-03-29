



# How-to test it:

	* curl -X POST -H 'Content-Type: application/json' -i http://localhost:9090/kafka/publish --data '{"name":"HOLA MAJO", "age":2}'



if you retrive this result, don't panic please you are in crrect wAy


onsumer_1   | Caused by: java.lang.IllegalStateException: Topic(s) [users] is/are not present and missingTopicsFatal is true
