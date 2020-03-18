package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
    Scanner scanner = new Scanner(System.in);
    ArrayList<User> users = new ArrayList<>();


    String name;
    String surname;
    private double balance;
    static int idCounter = 0;
    int id = 0;

    public User(){

    }
    public User(String name, String surname, double balance){
        this.name = name;
        this.surname = surname;
        this.balance = balance;

    }

    public void addUser(){
        users.add(new User());
        users.get(User.getIdCounter()).createUser();
    }


    public User createUser(){
        this.name = scanner.nextLine();
        this.surname = scanner.nextLine();
        balance = 0;
        id = idCounter;
        ++ idCounter ;
        return new User(name,surname,balance);

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNameSurname() {
        return "Name: "+name+"\nSurname: "+surname;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void disburse (double balance) {
        if (balance <0){
            System.out.println("Invalid form, pay must be positive");
        }
        else if (balance > this.balance) {
            System.out.println("Not enough funds in the account");
        } else {
            this.balance -= balance;
        }
    }

    public void deposit (double balance) {
        if ( balance < 0){
            System.out.println("Payments can not be negative");
        }
        else {
            this.balance += balance;
        }
    }

    public static int getIdCounter() {
        return idCounter;
    }
}
