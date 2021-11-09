import java.util.Scanner;
public class ArithmaticOperations {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter vale of a:");
        int a = sc.nextInt();
        System.out.println("Enter vale of b:");
        int b = sc.nextInt();
        System.out.println("Enter vale of c:");
        int c = sc.nextInt();
        int N1=(a + b * c);
        int N2=(c + a / b);
        int N3=(a % b + c);
        int N4=(a * b + c);
        System.out.println("N1=" + N1);
        System.out.println("N2=" + N2);
        System.out.println("N3=" + N3);
        System.out.println("N4=" + N4);
        if (N1 > N2)
        {
            System.out.printf("Between %d and %d, maximum is %d %n", N1, N2, N1);
        }
        else
        {
            System.out.printf("Between %d and %d, maximum number is %d %n", N1, N2, N2);
        }
        int max = Math.max(a, b);
        if (N1 < N2)
        {
            System.out.printf("Between %d and %d, Minimum Number is %d %n", N1, N2, N1);
        }
        else
        {
            System.out.printf("Between %d and %d, Minimum is %d %n", N1, N2, N2);
        }
        int min = Math.min(N1, N2);
    }
}
