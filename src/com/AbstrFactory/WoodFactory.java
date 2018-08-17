package com.AbstrFactory;

public class WoodFactory implements Factory{


    public Toy createToy(String type){
        switch (type){
            case "Bear" : return new WoodBear();
            case "Cat" : return new WoodCat();
            default:return null;

        }


    }
}
