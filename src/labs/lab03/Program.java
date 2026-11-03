package labs.lab03;
import java.util.Scanner;
public class Program {

     public static void main(String[] args) {

    //     String name = getString("What is your name?");
    //     int age = getInt("How old are you?");

    //     System.out.println("Hello " + name + ", you are " + age + " years old.");

    // }

    // public static int getInt(String prompt) {

    //     System.out.println(prompt);
    //     Scanner s = new Scanner(System.in);
    //     return s.nextInt();

    // }

    // public static String getString(String prompt) {

    //     System.out.println(prompt);
    //     Scanner s = new Scanner(System.in);
    //     return s.nextLine();

    // }

        // public static void main(String[] args) {

        //     theLunchQueue();
        // }

        // public static void theLunchQueue() {
        // String mainCourse = getString("What main dish would you like (fish, burgers, or veg)?");
        // int potatoes = getInt("How many roast potatoes would you like?");
        // int brussels = getInt("How many brussels sprouts would you like?");

        // System.out.println("You have chosen " + mainCourse + " with " + potatoes + " roast potatoes and " + brussels + " brussels sprouts.");

        // }

        // public static int getInt(String prompt) {

        //     System.out.println(prompt);
        //     Scanner s = new Scanner(System.in);
        //     return s.nextInt();

        // }

        // public static String getString(String prompt) {

        //     System.out.println(prompt);
        //     Scanner s = new Scanner(System.in);
        //     return s.nextLine();

        // }

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter pounds: ");
            convertInputToStonesPounds(sc.nextInt());
        }
    }

        static void convertInputToStonesPounds(int pounds){
            int stones = pounds / 14;
            int remainingPounds = pounds % 14;
            
            System.out.println(pounds + " pounds is " + stones + " stones and " + remainingPounds + " pounds.");
        }

}