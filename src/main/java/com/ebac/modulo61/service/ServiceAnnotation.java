package com.ebac.modulo61.service;

import com.ebac.modulo61.model.Model;
import org.springframework.beans.factory.annotation.Autowired;

public class ServiceAnnotation {

    private final Model model;

    @Autowired
    public ServiceAnnotation(Model model) {
        this.model = model;
    }

    public String connect(){
        return model.connect();
    }
}
