package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();

        boolean exit = false;

while (!exit){
    while (!scanner.hasNextByte()) scanner.next();
    byte action = scanner.nextByte();
        switch (action) {
            case 1: {
                user.addUser();
                System.out.println("Create user");
                break;

            }

            case 2: {
                System.out.println(User.getIdCounter());
                System.out.println("Account balance");
                break;

            }

            case 3: {
                System.out.println("Add money");
                break;

            }

            case 4: {
                System.out.println("Subtract money");
                break;

            }

            case 5: {
                System.out.println("Pour money");
                break;

            }
            default:
                exit = true;
        }
        }
System.out.println();
System.out.println();
System.out.println("You leave MiniBank");

    }
}
