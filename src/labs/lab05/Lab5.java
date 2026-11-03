package labs.lab05;

import java.util.Scanner;

public class Lab5 {


    public static int getInt(String prompt) {
        System.out.println(prompt);
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    public void grades() {
        int grade = getInt("Enter a grade:");
        if (grade < 1 || grade > 100) {
            System.out.println("Error: marks but must be between 1 and 100");
        return;
        }
        if (grade < 50) {
            System.out.println("Fail");
        }
        if (grade >= 50 && grade <= 60) {
            System.out.println("Pass");
        }
        if (grade >= 61 && grade <= 70) {
            System.out.println("Merit");
        }
        if (grade >= 71 && grade <= 100) {
            System.out.println("Distinction");
        }
        
        
    }

    public void Part2(){
        String answer = getString("Is it Summer?");
        Boolean isSummer = answer.equalsIgnoreCase("yes");
        String eveningAnswer = getString("Is it earlyevening?");
        Boolean isEvening = eveningAnswer.equalsIgnoreCase("yes");
        System.out.println("Take a shower: ");
        if(isSummer && isEvening) {
            System.out.println("Eat outside");
        } else {
            System.out.println("Eat inside");
        }
    }

        

    public static String getString(String prompt) {
        System.out.println(prompt);
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }
}
