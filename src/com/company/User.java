package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
    Scanner scanner = new Scanner(System.in);
    ArrayList<User> users = new ArrayList<>();

    String name;
    String surname;
    private double balance;
    private static int idCounter = 0;
    private int id = 0;
    private int idUsers;

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
        System.out.println("Proszę podać imię:");
        this.name = scanner.nextLine();
        System.out.println("Proszę podać nazwisko:");
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
        return "Name: "+name+
                "\nSurname: "+surname;
    }

    public String getId() {
        return "Id użytkownika: "+id;
    }

    public double getBalance(){
        return balance;
    }

    public String userBalance() {
        System.out.println("Wprowadź id użytkownika: ");

        while (!scanner.hasNextInt()) scanner.next();
        idUsers = scanner.nextInt();

        if (idUsers <=(getIdCounter()-1)){
            return users.get(idUsers).getNameSurname()+
                    "\nstak konta: "+
                    users.get(idUsers).getBalance();
        }else {
                return "Nie ma użytkownika o takim id, sprawdź listę użytkowników";
        }
    }

    public void getUsersList() {
        if (getIdCounter()==0){
            System.out.println("Brak użytkowników w bazie danych");
        } else {
            for (int i=0; i<getIdCounter();i++){
                System.out.println(users.get(i).getId());
                System.out.println(users.get(i).getNameSurname());
            }
        }

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
