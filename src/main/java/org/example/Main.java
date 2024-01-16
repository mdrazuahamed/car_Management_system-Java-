package org.example;

import serviceUtil.Service;
import util.Util;

import java.util.LinkedList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Unique Car application\n\tYour Ride and Your Choice");
        String services = "\t1: Find Ride\n"+
                "\t2: Offer Ride\n"+
                "\t3: About Us\n"+
                "\t0: Quit";
        System.out.println(services);
        Scanner userInput = new Scanner(System.in);
        int menu = userInput.nextInt();

        if(menu == 1){
            Service.menu1();
        }
        else if (menu == 2){
            Service.menu2();
        }
        else if (menu == 3) {
            System.out.println("This is about us");
        }
        else if (menu == 0) {
            System.out.println("Existing from the system");
        }
        else {
            System.out.println("Invalid operation");
        }
    }
}