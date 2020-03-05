package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        User a = new User();
        a.createUser();
        User b = new User();
        b.createUser();

        System.out.println(a.getNameSurname());
        System.out.println(a.getBalance());
        System.out.println(a.getId());

        System.out.println(b.getNameSurname());
        System.out.println(b.getBalance());
        System.out.println(b.getId());


    }
}






//TODO User ( Name, Surname, account )
//    action
//    deposit
//    disburse
//    account balance
//
