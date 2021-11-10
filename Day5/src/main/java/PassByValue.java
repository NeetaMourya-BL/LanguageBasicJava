public class PassByValue {
    int a = 10;
    void add (int a) {
        a = a+10;
    }
    public static void main(String[] args) {
        PassByValue pv = new PassByValue();
        System.out.println("Before call-by-value: " + pv.a);
        pv.add(10);
        System.out.println("After call-by-value: " + pv.a);
    }
}
