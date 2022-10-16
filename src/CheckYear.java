import java.util.Scanner;

public class CheckYear {
    public static void main(String[] args) {
        int year;
        Year ob=new Year();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the year:");
        year=input.nextInt();
        if(ob.isleapyear(year))
            System.out.println("The year is leapyear "+year);
        else
            System.out.println("The year  is not leapyear "+year);

    }
}
