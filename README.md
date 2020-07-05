# sleuth-with-zpkn
This project explains `how to intergrated w/ spring boot project and zipkin`  
Before, boot up project run zpkn via docker `docker run -d -p 9411:9411 openzipkin/zipkin`
## dependecy
```
compile 'org.springframework.cloud:spring-cloud-starter-zipkin'
compile 'org.springframework.cloud:spring-cloud-starter-sleuth'
```

## Reference  
- https://spring.io/projects/spring-cloud-sleuth