package com.example.oauth2try.security

import org.springframework.context.annotation.Bean
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.web.servlet.invoke
import org.springframework.security.web.SecurityFilterChain

@EnableWebSecurity
class SecurityOAuth2Config {

    @Bean
    fun enableOAuth2(http: HttpSecurity): SecurityFilterChain {
        http.invoke {
            authorizeRequests {
                authorize(anyRequest, authenticated)
            }
            oauth2Login {  }
        }
        return http.build()
    }
}