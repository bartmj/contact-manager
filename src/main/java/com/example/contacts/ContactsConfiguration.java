package com.example.contacts;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
public class ContactsConfiguration implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("index.html").setViewName("index");
        registry.addViewController("contacts/contact-form").setViewName("contacts/contact-form");
        registry.addViewController("contacts/contact-added").setViewName("contacts/contact-added");
        registry.addViewController("contacts/contact-list").setViewName("contacts/contact-list");
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")
                .allowedHeaders("*")
                .allowedMethods("*")
                .allowedOrigins("http://localhost:4200");
    }
}
