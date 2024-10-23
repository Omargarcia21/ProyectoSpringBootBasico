package com.ebac.modulo61;

import com.ebac.modulo61.service.ServiceAnnotation;
import com.ebac.modulo61.service.ServiceConstructor;
import com.ebac.modulo61.service.ServiceSetter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Contexto implements CommandLineRunner {
    @Autowired
    private ServiceSetter serviceSetter;

    @Autowired
    private ServiceConstructor serviceConstructor;

    @Autowired
    private ServiceAnnotation serviceAnnotation;


    @Override
    public void run(String... args) throws Exception {
        System.out.println("Conexion con Service Setter");
        System.out.println(serviceSetter.connect());
        System.out.println("---------------------------------------------");
        System.out.println("Conexion con Service Constructor");
        System.out.println(serviceConstructor.connect());
        System.out.println("----------------------------------------------");
        System.out.println("Conexion con Service Annotation");
        System.out.println(serviceAnnotation.connect());

    }
}
