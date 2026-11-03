package labs.lab04;

import java.util.Scanner;

public class Lab4 {

    public static int getInt(String prompt) {
        System.out.println(prompt);
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    public void part1() {
        int price = getInt("Price of a bag please?");
            if (price <= 0) {
            System.out.println("Price must be greater than 0");
            return;
            }

        int money = getInt("How much money do you have?");
            if (money < 0) {
                System.out.println("Money must be greater than 0");
                return;
            }
            else if (money == 0) {
                System.out.println("Come back with your pocket money");
            return;
            }

        int numbag = (money / price);
        System.out.println("If the price of a bag is " + price + "p and you have " + money + "p, you can buy " + numbag + " bags");
    }  
}