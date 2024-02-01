package com.peace.bot;

import java.util.Scanner;

public class Bot {
    public static void main(String[]args){
    bot();
    }
    public static void bot(){
        int userinput;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number (1, 2, or 3): ");
        userinput = input.nextInt();

        switch (userinput){
            case 1:
                System.out.println("confirm");
                break;
            case 2:
                System.out.println("Meenahcodes");
                break;
            case 3:
                System.out.println("try again");
                break;
            default:
                System.out.println("Please Enter a valid input 1, 2 or 3.");
        }
    }
}
