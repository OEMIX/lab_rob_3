package com.company;

public class BIGBOSS {
    final int age = 36;
    final double weight = 80.4;
    final double height = 187.3;

    final void information(){
        System.out.println("Вік гравця: " + age + ", вага: " + weight + ", зріст: " + height + ", ");
    }

    final void pension(final int a) {
        System.out.println("До пенсії залишилося :"+(a-age));
    }
}
