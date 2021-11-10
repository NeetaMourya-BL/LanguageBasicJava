public class MethodOverriding {
    public static class func {
        void func() {
            System.out.println("value of a");
        }
    }
    static class func1 extends func {
        void func() {
            System.out.println("value of a and b");
        }
    }
    public static void main(String[] args) {
        func f1= new func();
        f1.func();
        func f2= new func1();
        f2.func();
    }
}