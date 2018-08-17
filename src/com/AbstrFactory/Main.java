package com.AbstrFactory;

public class Main {
    public static void main(String[] args) {

        AbstrFactory abstrFactory = new AbstrFactory();
        Toy toyCat = abstrFactory.createFactory("Wood").createToy("Cat");

        toyCat.speak();

        Toy toyBear = abstrFactory.createFactory("Teddy").createToy("Bear");
        toyBear.speak();

        


    }
}
