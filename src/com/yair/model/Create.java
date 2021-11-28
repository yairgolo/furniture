package com.yair.model;

import java.util.Random;

public class Create {
    public Properties creatFur(){
        Random random = new Random();
        int num = random.nextInt(3);
        if (num == 0){
            return new Chair(random.nextInt(50),random.nextInt(30),random.nextInt(30),random.);
        } else if (num == 1){
            return new Table();
        } else {
            return new Bed();
        }
    }
}



