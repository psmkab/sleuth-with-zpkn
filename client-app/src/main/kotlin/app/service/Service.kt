package tx.service

import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class Service {
    companion object {
        private val restTemplate = RestTemplate()
    }

    /**
     * call external service syncronously
     */
    fun externalServices() {
        restTemplate.getForObject("http://localhost:8081/api/short/transactions", String::class.java)!!
        restTemplate.getForObject("http://localhost:8082/api/long/transactions", String::class.java)!!
    }
}