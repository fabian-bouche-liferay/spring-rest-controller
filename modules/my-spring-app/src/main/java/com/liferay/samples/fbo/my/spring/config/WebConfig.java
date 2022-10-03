package com.liferay.samples.fbo.my.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.liferay.samples.fbo.my.spring")
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer.favorPathExtension(false)
        .parameterName("mediaType")
        .favorParameter(true)
        .ignoreAcceptHeader(true)
        .useRegisteredExtensionsOnly(true)
        .defaultContentType(MediaType.APPLICATION_JSON)
        .mediaType("json", MediaType.APPLICATION_JSON)
        .mediaType("xml", MediaType.APPLICATION_XML);
    }
    
    @Bean
    public RequestMappingHandlerMapping handlerMapping() {
        RequestMappingHandlerMapping handlerMapping = new RequestMappingHandlerMapping();
        handlerMapping.setAlwaysUseFullPath(true);
        return handlerMapping;
    }
    
}

