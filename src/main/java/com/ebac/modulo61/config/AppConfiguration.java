package com.ebac.modulo61.config;


import com.ebac.modulo61.model.Model;
import com.ebac.modulo61.service.ServiceConstructor;
import com.ebac.modulo61.service.ServiceSetter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public Model model(){
        return new Model();
    }

    @Bean
    public ServiceSetter serviceSetter(){
        ServiceSetter serviceSetter = new ServiceSetter();
        serviceSetter.setModel(model());
        return serviceSetter;
    }

    @Bean
    public ServiceConstructor serviceConstructor(){
        return new ServiceConstructor(model());
    }
}
