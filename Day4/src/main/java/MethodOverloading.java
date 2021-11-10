public class MethodOverloading {
    public static int func(int a) {
        return 100;
    }
    public static String func(int a, int b) {
        return "Method overloading";
    }
    public static void main(String args[])
    {
        System.out.println(func(1));
        System.out.println(func(1,3));
    }
}