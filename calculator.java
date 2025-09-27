
import java.util.Scanner;

public class calculator {
        public static double add(double a, double b){
            return a+b;
        }

        public static double subtract(double a, double b ){
            return a-b;
        }
        public static double multiply(double a, double b){
            return a*b;
        }

        public static double divide(double a, double b){
            if(b == 0){
                System.out.println("Error...Division by Zero is not allowed");
                return 0;
            } else {
                return a/b;
            }
        }

        public static void main (String[] args){
            Scanner scanner = new Scanner(System.in);

            while (true){
                System.out.println("\n====SIMPLE CALCULATOR====");
                System.out.println("1- Addition");
                System.out.println("2- Subtraction");
                System.out.println("3- Multiplication");
                System.out.println("4- Division");
                System.out.println("5- Exit");
                System.out.println("Choose an option:1");

                int choice = scanner.nextInt();
                if(choice == 5){
                    System.out.println("Exiting the program");
                    break;
                }
                System.out.println("Enter the first Number: ");
                double num1 = scanner.nextDouble();

                System.out.println("Enter the second number");
                double num2 = scanner.nextDouble();

                double result = 0;
                switch (choice){
                    case 1:
                        result = add(num1,num2);
                        break;
                    case 2:
                        result=subtract(num1, num2);
                        break;
                    case 3:
                        result=multiply(num1,num2);
                        break;
                    case 4:
                        result = divide(num1,num2);
                        break;
                    default:
                        System.out.println("Invalid choice, Try Again!");
                        continue;
                }

                System.out.println("Result: " + result);
            }

            scanner.close();
        }
    }

