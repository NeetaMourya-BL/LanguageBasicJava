interface Inter {
    void methodOne();
}
abstract class Abstr implements Inter {
    void methodTwo()
    {
        System.out.println("MethodTwo Called");
    }
}
class Test extends Abstr {

    public void methodOne()
    {
        System.out.println("MethodOne Called");
    }
    void methodThree() {
        System.out.println("MethodThree Called");
    }
}
public class InterfaceUsingAbstractClass {
    public static void main(String[] args) {
        Test t = new Test();
        t.methodOne();
        t.methodTwo();
        t.methodThree();
    }
}