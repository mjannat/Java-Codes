package com.selenium.express;

public class Heart {
    private String nameOfAnimal;
    private int noOfHeart;

    public String getNameOfAnimal() {
        return nameOfAnimal;
    }

    public void setNameOfAnimal(String nameOfAnimal) {
        this.nameOfAnimal = nameOfAnimal;
    }

    public int getNoOfHeart() {
        return noOfHeart;
    }

    public void setNoOfHeart(int noOfHeart) {
        this.noOfHeart = noOfHeart;
    }

    public void pumping()
    {
        System.out.println("My heart is pumping");
        System.out.println("I am Alive Alhamdullillah");
        System.out.println("Name of the Animal is " + nameOfAnimal + " and number Of Heart is " + noOfHeart);
    }
}
