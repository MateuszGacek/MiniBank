package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        byte action = Byte.parseByte(scanner.nextLine());

        if (action == 1){
            System.out.println("Create user");
        }
        else if (action ==2){
            System.out.println("Account balance");
        }
        else if (action ==3){
          System.out.println("Add money");
        }
        else if (action ==4){
            System.out.println("Subtract money");

        }
        else if (action ==5){
            System.out.println("");
        }

    }
}


//TODO User ( Name, Surname, account )
//    action
//    deposit
//    disburse
//    account balance
//
