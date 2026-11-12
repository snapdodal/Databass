import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Info[] customers = new Info[10];

        for (int i = 0; i < 10; i++) {

            System.out.println("Customer number: " + (i+1));
            System.out.println("");

            System.out.println("Enter your email:");
            String email = input.nextLine();

            System.out.println("Enter your Phone number:");
            int Phone_num = input.nextInt();
            input.nextLine();

            customers[i] = new Info(Phone_num, email);
        }
    }






    }

