package com.sda.paul.advanced.recap;

public class Director extends Professor {

    public Director() {
    }



    public Director(double salary, String subject) {
        super(salary, subject);
    }

    public void pay(double amount){

        super.setSalary(amount*2);
    }

}
