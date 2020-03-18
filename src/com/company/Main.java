package com.company;

import java.util.*;

public class Main {
    private static User user = new User();
    private static Menu menu = new Menu();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int id;
        boolean exit = false;

while (!exit){
    menu.menu();


    while (!scanner.hasNextByte()) scanner.next();
    byte action = scanner.nextByte();
        switch (action) {
            case 1: {
                user.addUser();
                System.out.println("Create user");
                break;
            }
            case 2:{
                user.getUsersList();
                break;
            }
            case 3: {
                System.out.println(user.userBalance());
                break;

            }

            case 4: {
                System.out.println("Add money");
                break;

            }

            case 5: {
                System.out.println("Subtract money");
                break;

            }

            case 6: {
                System.out.println("Pour money");
                break;

            }
            default:
                exit = true;
        }
        }
System.out.println("\nYou leave MiniBank\n");
    }
}
