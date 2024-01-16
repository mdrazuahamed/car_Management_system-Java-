package serviceUtil;

import org.example.Cities;
import util.Util;

import java.util.LinkedList;

public class Service {
    public static void menu1(){
        String info = Util.fillUserInfo();
        System.out.println(info);
        System.out.println("Welcome ...");
        String city = Util.enterString("Where do you want to go?");
        String toUbberCity = city.toUpperCase();
        System.out.println("Checking destination for " + toUbberCity);
        Cities cities = new Cities();
        LinkedList<String> list = cities.getList();
        if (list.contains(toUbberCity)){
            System.out.println("There are available trips for " + toUbberCity + "...");
            String tripInfo = Util.fillTripInfo();
            System.out.println(tripInfo);
        }
        else {
            System.out.println("There are no available trips \t Here are the active trips");
            LinkedList<String> list1 = cities.getList();
            for(String s : list){
                System.out.println(s);
            }
        }
    }

    public static void menu2(){
        String info = Util.fillUserInfo();
        System.out.println(info);
        String carType = Util.enterString("Please enter your car type");
        String placeTo = Util.enterString("Where do you ride");
        String placeFrom = Util.enterString("your current location");
        int capacity = Util.enterInteger("How many passengers you can carry");
        String requires = Util.enterString("Enter Requires: For example: (SMOKING-NO,"+"PET-Yes, Luggage-NO)");
        System.out.println( " Car type " + carType + " Place from " + placeFrom + " Place to " + placeTo +
                " With " + capacity + " passengers with these requires:" +
                " " + requires);


    }
}
