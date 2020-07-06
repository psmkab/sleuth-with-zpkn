package app.config

import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate

@Configuration
class ClientConfig {
    /**
     * When using sleuth, always make `restTemplate` as a bean !!
     */
    @Bean
    fun restTemplate(builder: RestTemplateBuilder): RestTemplate = builder.build()
}