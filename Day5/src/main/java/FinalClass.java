// final class not inherited
class FinalClass{
}
class ABC extends FinalClass {
    void demo(){
        System.out.println("My Method");
    }
    public static void main(String args[]){
        ABC obj= new ABC();
        obj.demo();
    }
}