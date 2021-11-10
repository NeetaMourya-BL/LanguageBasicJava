public class FinalMethod {
    final void demo(){
        System.out.println("XYZ Class Method");
    }
}
class ABC1 extends FinalMethod {
    public static void main(String args[]){
        ABC1 obj= new ABC1();
        obj.demo();
    }
}

