import java.util.Scanner;
public class SpringSeason {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter month between 3-6");
        int month = scan.nextInt();
        System.out.println("Enter day");
        int day = scan.nextInt();
        if((month == 3 && day >= 16 && day <= 31) || (month == 4 && day >=1 && day <= 30) || (month == 5 && day >= 1 && day <= 31) || (month == 6 && day >=1 && day <=20))
        {
            System.out.println("Spring");
        }
        else
        {
            System.out.println("Invalid entry");
        }
    }
}
