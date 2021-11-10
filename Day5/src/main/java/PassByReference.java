public class PassByReference {
    int a = 10;
    void call(PassByReference pr) {
        pr.a = pr.a+10;
    }
    public static void main(String[] args) {
        PassByReference pr = new PassByReference();
        System.out.println("Before call-by-reference: " + pr.a);
        pr.call(pr);
        System.out.println("After call-by-reference: " + pr.a);


    }
}
