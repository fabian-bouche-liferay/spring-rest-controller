package com.liferay.samples.fbo.my.spring.component;

import com.liferay.samples.fbo.my.spring.config.WebConfig;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class SpringRestServletComponent extends org.springframework.web.servlet.DispatcherServlet {

    @Override
    public String getContextConfigLocation() {
        return WebConfig.class.getName();
    }

    @Override
    public Class<?> getContextClass() {
        return AnnotationConfigWebApplicationContext.class;
    }

}