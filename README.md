# sleuth-with-zpkn
This project explains `how to intergrated w/ spring boot project and zipkin`  
Before, boot up project run zpkn via docker `docker run -d -p 9411:9411 openzipkin/zipkin`

## Dependency
```
compile 'org.springframework.cloud:spring-cloud-starter-zipkin'
compile 'org.springframework.cloud:spring-cloud-starter-sleuth'
```

## Caution
`RestTemplte` always enrolled in application context as a bean
    
refer : spring-cloud-sleuth-core-2.1.4.RELEASE-sources.jar!/org/springframework/cloud/sleuth/instrument/web/client/TraceWebClientAutoConfiguration.java:73
## Reference  
- https://spring.io/projects/spring-cloud-sleuth