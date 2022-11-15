package com.company;

public class Parking {
    static double width;//Ширина
    static double length;//Довжина
    static int parkplaces = 35;//Паркові місця
    static {
        width = 53.7;
        length = 110.1;
    }

    static void area() {
        double area = width * length;
        System.out.println("Площа парковки : "+ area);
    }

    static void information(){
        System.out.println("Ширина парковки: " +width+", Довжина : "+length+", кількість мість : "+parkplaces+",");
        area();
    }

}
