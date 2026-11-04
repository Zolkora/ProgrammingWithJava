package labs.lab06;

import java.util.Scanner;

public class Lab6 {

    public void part1() {
    
        grades();

    }   

        public static int getInt(String prompt) {
        System.out.println(prompt);
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }
        public static String getString(String prompt) {
        System.out.println(prompt);
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

    public void grades() {
        String[] names = new String[5];
        int[] marks = new int[5];
    
        for (int i = 0; i < 5; i++){
          names[i] = getString("Enter name for student " + (i + 1) + ":");
          marks[i] = getInt("Enter mark (1-100) for student " + (i + 1) + ":");
        }
        for (int i = 0; i < 5; i++){
            System.out.println("Student: " + names[i] + ", Mark: " + marks[i]);
        
            if (marks[i] < 1 || marks[i] > 100) {
                System.out.print("Error: marks but must be between 1 and 100");
                continue;
            }
            if (marks[i] < 50) {
                System.out.print("Fail");
            } else if (marks[i] <= 60) {
                System.out.print("Pass");
            } else if (marks[i] <= 70) {
                System.out.print("Merit");
            } else {
                System.out.print("Distinction");
            }
        }
        
        
    }       

    public void account(){

        double startingBalance = 100;
        double currentBalance = startingBalance;
        float interestRate = 0.05f;
        int years = 0;

        while (currentBalance < 200) {
            currentBalance += currentBalance * interestRate;
            years++;
        }
        System.out.println("It takes " + years + " years to reach a balance of " + currentBalance);

    }

    public void multiplicationTable(){

        for (int row = 1; row <= 10; row++) {
            for (int col = 1; col <= 10; col++) {
                System.out.printf("%5d", col * row);
            }
            System.out.println();
        }




    }














}