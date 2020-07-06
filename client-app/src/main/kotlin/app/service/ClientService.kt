package app.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class ClientService @Autowired constructor(
    val restTemplate: RestTemplate
){
    /**
     * call external service syncronously
     */
    fun externalServices() {
        restTemplate.getForObject("http://localhost:8081/api/long/transactions", String::class.java)!!
    }
}