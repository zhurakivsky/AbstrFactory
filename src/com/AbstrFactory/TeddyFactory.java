package com.AbstrFactory;

public class TeddyFactory implements Factory{

    public Toy createToy(String type){
        switch (type){
            case "Bear" : return new TeddyBear();
            case "Cat" : return new TeddyCat();
            default:return null;

        }



    }
}
