package com.company;

public class Main {

    public static void main(String[] args) {
//        Account jeffAcct = new Account();
//
//        System.out.println(jeffAcct.getCustomerName());
//
//        jeffAcct.deposit(100);
//        jeffAcct.withdrawal(50);
//        jeffAcct.withdrawal(200);
//
//        Account newJeffAcct = new Account("Jeffery", "grahamj78@hotmai.com", "2029069270");
//        System.out.println(newJeffAcct.getBalance());

        VipCustomer jeff = new VipCustomer("Jeff", 11111.11, "jeffery.lemar.graham@gmail.com");
        VipCustomer jeffery = new VipCustomer("Jeffery", 111.11);
        VipCustomer jlg = new VipCustomer();

        System.out.println(jeff.getName());
        System.out.println(jeffery.getName());
        System.out.println(jlg.getName()    );
    }
}
