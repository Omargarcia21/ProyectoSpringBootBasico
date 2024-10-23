package com.ebac.modulo61.service;

import com.ebac.modulo61.model.Model;

public class ServiceSetter {
    private Model model;

    public void setModel(Model model) {
        this.model = model;
    }

    public String connect(){
        return model.connect();
    }

}
