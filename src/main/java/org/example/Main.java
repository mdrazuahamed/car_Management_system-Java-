package org.example;

import serviceUtil.Service;
import util.Util;

import java.util.LinkedList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to Unique Car application\n\tYour Ride and Your Choice");
        String nationality = Util.enterString("Please tell us, are you a foreign or native");
        String services = "\t1: Find Ride\n"+
                "\t2: Offer Ride\n"+
                "\t3: About Us\n"+
                "\t0: Quit";
        while (true) {
            String information = " ";

            if (nationality.equalsIgnoreCase("foreign")){
                information = Util.enterString("Enter your passport id");
                System.out.println("Checking passport id for :" + information + "\n ");
                Thread.sleep(5000);
                System.out.println(" Process complete successfully");
            }
            else if(nationality.equalsIgnoreCase("native")){

            }
            else {
                System.out.println("Invalid operation");
                break;
            }

            System.out.println(services);
            System.out.println("Please choose a option");
            int menu = userInput.nextInt();

            if (menu == 1) {
                Service.menu1();
                break;
            } else if (menu == 2) {
                Service.menu2();
                break;
            } else if (menu == 3) {
                Service.menu3();
                break;
            } else if (menu == 0) {
                System.out.println("Existing from the system");
                break;
            } else {
                System.out.println("Invalid operation");
                break;
            }
        }
    }
}