package com.yair;


import com.yair.model.Chair;
import com.yair.model.Create;
import com.yair.model.Properties;

public class Main {

    public static void main(String[] args) {
        Properties[] properties = new Properties[20];
        properties[0] = new Chair();
        Create create = new Create();
        for (int i = 0; i < properties.length; i++) {
            properties[i] = create.creatFur();
        }
    }
}
