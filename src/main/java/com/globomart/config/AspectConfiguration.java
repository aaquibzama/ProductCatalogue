package com.globomart.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.globomart.aspect.ExceptionHandlerAspect;

@Configuration
@EnableAspectJAutoProxy
public class AspectConfiguration {
    @Bean
    public ExceptionHandlerAspect exceptionAspect() {
        return new ExceptionHandlerAspect();
    }
}
