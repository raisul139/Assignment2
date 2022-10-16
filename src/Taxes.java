import java.util.Scanner;

public class Taxes {
    public static void main(String[] args) {
        double taxes = 0;

        System.out.println("press 1 if single and press 2 if married");
        Scanner input = new Scanner(System.in);
        int status = input.nextInt();

        System.out.println("enter the income");
        double income = input.nextDouble();


        if (status == 1) {

            if (income < 8000) {
                System.out.println("tax is not given");
            } else if (income > 8000 && income < 32000) {
                taxes = 800 + (income - 8000) * 15 / 100;
                System.out.println("taxes is " + taxes);
            } else {
                taxes = 4400 + (income - 32000) * 25 / 100;
                System.out.println("taxes is " + taxes);
            }
            //System.out.println("taxes is "+taxes);
        }
        else {

            if (income < 16000) {
                System.out.println("tax is not given");
            }
            else if (income > 16000 && income < 64000) {
                taxes = 1600 + (income - 16000) * 15 / 100;
                System.out.println("taxes is " + taxes);
            }
            else {
                taxes = 8800 + (income - 32000) * 25 / 100;
                System.out.println("taxes is " + taxes);
            }
        }
    }
}
