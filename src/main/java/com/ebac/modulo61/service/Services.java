package com.ebac.modulo61.service;

import com.ebac.modulo61.demo.DataBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Services {

    private final DataBase dataBase;

    @Autowired
    public Services(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public void performOperation(){
        dataBase.connect();
        System.out.println("Realizando operación en la base de datos....");
    }
}
