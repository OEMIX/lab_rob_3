package com.company;

public class Shop {
    private String storage;//склад
    private String mainHall;//головний зал
    private String toilet;//вбиральня


    Shop(String storage, String mainHall, String toilet) {
        this.storage = storage;
        this.mainHall = mainHall;
        this.toilet = toilet;

    }

    void main_hall(int height, int width, int length){
        System.out.println("Площа магазину : "+height*width*length);
    }

    int storage(int height, int width,int length ) {
        return height * width * length;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Перевизначити  метод
    void main_hall(double height, double width, double length){
        System.out.println("Площа магазину : "+height*width*length);
    }
        //метод з статичним ім’ям та динамічною логікою
    void sleep(double height, double width, double length){
        System.out.println("Площа вбиральні : "+height*width*length);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //згенерувати до кожної із змінних методи get() i set()
    public String getStorage() {
        return storage;
    }

    public String getMainHall() {
        return mainHall;
    }

    public String getToilet() {
        return toilet;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public void setMainHall(String mainHall) {
        this.mainHall = mainHall;
    }

    public void setToilet(String toilet) {
        this.toilet = toilet;
    }


}
