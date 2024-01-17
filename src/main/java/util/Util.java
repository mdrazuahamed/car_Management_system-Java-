package util;

import java.util.Scanner;

public class Util {
    public static String enterString(String title){
        System.out.println(title);
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        return answer;
    }

    public static int enterInteger(String  title){
        System.out.println(title);
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        return answer;
    }

    public static String  fillUserInfo(){
        String nameSurname = Util.enterString("Enter your Name and Surname");
        String email = Util.enterString("Enter your Email");
        String phone = Util.enterString("Enter your Phone Number");

        return "Name: " + nameSurname + ", Email: " + email + ", Phone: " + phone;
    }

    public static String fillTripInfo(){
        String location = enterString("Your current location");
        int passenger = enterInteger("How many passenger will travel");
        String time = enterString("Enter tiime: ");
        String requires = enterString("Enter Requires: For example: (SMOKING-NO,"+"PET-Yes, Luggage-NO)");
        return "Your destination from" + location + " With " + passenger + " passengers with these requires:" +
                " " + requires + " in " + time;

    }
}
