package com.AbstrFactory;

public class AbstrFactory {

    public Factory createFactory(String type){
        switch (type){
            case "Wood" : return  new WoodFactory();
            case "Teddy" : return  new TeddyFactory();
            default: return  null;

        }


    }
}
