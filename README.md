# sleuth-with-zpkn
This project explains `how to intergrated w/ spring boot project and zipkin`  
Before, boot up project run zpkn via docker `docker run -d -p 9411:9411 openzipkin/zipkin` or `curl -sSL https://zipkin.io/quickstart.sh | bash -s && java -jar zipkin.jar`

## Dependency
```
compile 'org.springframework.cloud:spring-cloud-starter-zipkin'
compile 'org.springframework.cloud:spring-cloud-starter-sleuth'
```

![image](https://user-images.githubusercontent.com/15953163/86604422-518d0f80-bfe0-11ea-8def-f2d56f698522.png)

## Caution
`RestTemplte` always enrolled in application context as a bean
    
refer : spring-cloud-sleuth-core-2.1.4.RELEASE-sources.jar!/org/springframework/cloud/sleuth/instrument/web/client/TraceWebClientAutoConfiguration.java:73
## Reference  
- https://spring.io/projects/spring-cloud-sleuth
