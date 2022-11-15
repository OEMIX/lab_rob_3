package com.company;

public class People {
    int customers; //клієнти
    int security; //охорона
    int cashier; //касир
    String chief_cashier; //головний касир
    String chief_security; //начальник охорони


    People(int customers,int security, int cashier,String chief_cashier, String chief_security) {
        this.customers = customers;
        this.chief_cashier = chief_cashier;
        this.chief_security = chief_security;
        this.security = security;
        this.cashier = cashier ;
    }

    void average_amount() {
        System.out.println("Середня кількість клієнтів в магазин : "+ customers);
    }

    int cashiers_salary(){
        int monthly = 11000;
        if((customers*30)>250){
            monthly += 2500;
        }
        int yearly = monthly*12;
        return yearly ;
    }

    int security_salary(){
        int monthly = 15200;
        int yearly = monthly*12;
        return yearly;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //метод з статичним ім’ям та динамічною логікою
    void sleep(){
        int Earnings = (500*customers)*30;
        System.out.println("Середній прибуток за місяць : "+Earnings);
    }
        //перевизначити конструктор
    public People() {
    }

    public People(int customers) {

        this.customers = customers;
    }

    public People(int customers, String chief_cashier) {
        this.customers = customers;
        this.chief_cashier = chief_cashier;
    }

    //метод посилкового типу
    People new_price (){
        People people = new People(customers + 10, security * 2, cashier + 4,chief_cashier+" Василівка",chief_security+" Ігорович");
        return people;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //згенерувати до кожної із змінних методи get() i set()
    public int getCustomers() {
        return customers;
    }

    public int getSecurity() {
        return security;
    }

    public int getCashier() {
        return cashier;
    }

    public String getChief_cashier() {
        return chief_cashier;
    }

    public String getChief_security() {
        return chief_security;
    }

    public void setCustomers(int customers) {
        int s = customers*2;
        this.customers = customers;
    }

    public void setSecurity(int security) {
        int s = security*2;
        this.security = security;
    }

    public void setCashier(int cashier) {
        int s = cashier*2;
        this.cashier = cashier;
    }

    public void setChief_cashier(String chief_cashier) {
        this.chief_cashier = chief_cashier;
    }

    public void setChief_security(String chief_security) {
        this.chief_security = chief_security;
    }


}
