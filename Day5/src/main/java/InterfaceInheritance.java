public class InterfaceInheritance {
    interface printable{
        void print();
    }
    static class A6 implements printable{
        public void print(){System.out.println("Hello");}

        public static void main(String args[]){
            A6 obj = new A6();
            obj.print();
        }
    }
}
