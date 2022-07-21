package com.huhu.springbootdemo.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class SpringSecurityConfig {

    @Bean
    SecurityFilterChain filterChain(HttpSecurity httpSecurity)throws Exception{
        return httpSecurity.antMatcher("/**").i.authorizeRequests(authorize->authorize
                .anyRequest().authenticated()).build();
    }

}