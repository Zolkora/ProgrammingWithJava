package lessons.Cconditionals;
public class Main {

    public static void main(String[] args) {
    
        // int x = 10;
        // if (x > 0) {
        //     System.out.println("x is positive");
        // }
        // else {
        //     System.out.println("x is not positive");    
        // }

        
        //int day = 5;

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter a day number (1-7): ");
        // int day = scanner.nextInt();

        // switch (day) {
        //     case 1 -> System.out.println("Monday");
        //     case 2 -> System.out.println("Tuesday");
        //     case 3 -> System.out.println("Wednesday");
        //     case 4 -> System.out.println("Thursday");
        //     case 5 -> System.out.println("Friday");
        //     case 6 -> System.out.println("Saturday");
        //     case 7 -> System.out.println("Sunday");
        //     default -> System.out.println("Not a valid day number");
        // }
        // scanner.close();
    
        String grade = "B";

        String result = switch (grade) {
            case "A", "B", "C" -> {
                yield "Pass";
            }
            case "D", "F" -> {
                yield "Fail";
            }
            default -> {
                yield "Invalid grade";
            }
        };

System.out.println(result);
}
}
