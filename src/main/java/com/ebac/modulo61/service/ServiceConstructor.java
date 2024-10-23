package com.ebac.modulo61.service;

import com.ebac.modulo61.model.Model;

public class ServiceConstructor {

    private Model model;

    public ServiceConstructor(Model model){
        this.model = model;
    }

    public String connect(){
        return model.connect();
    }
}
