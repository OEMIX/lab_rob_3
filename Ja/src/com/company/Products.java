package com.company;

public class Products {
    private String fish;//риба
    private String meat;//м'ясо
    private String baking;//випічка


    Products(String fish, String meat, String beking) {
        this.fish = fish;
        this.meat = meat;
        this.baking = beking;
    }

    void typesOFmeat() {
        System.out.println("На прилавку м'ясного відділення є : " + meat);
        System.out.println("На прилавку рибного відділення є : " + fish);
        System.out.println("На прилавку випічки є : " + baking);
    }

    int price(int chicken_price, int veal_price, int lamb_price){
        int s = ( chicken_price + veal_price + lamb_price )/3;
        return s;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //метод з статичним ім’ям та динамічною логікою
    void sleep(double cookies , double pie , double bread){
       System.out.println("Ціна : Печиво-"+cookies+" Торт-"+pie+" хліб-"+bread);
    }

    //методу із класу, екземпляр якого передано в якості параметру
    String produkt(Products products){
        price(79, 180, 170);
        return products.fish;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //згенерувати до кожної із змінних методи get() i set()
    public String getFish() {
        return fish;
    }

    public String getMeat() {
        return meat;
    }

    public String getBaking() {
        return baking;
    }

    public void setFish(String fish) {
        this.fish = fish;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setBaking(String baking) {
        this.baking = baking;
    }


}
