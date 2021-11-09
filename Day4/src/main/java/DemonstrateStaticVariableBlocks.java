public class DemonstrateStaticVariableBlocks {
    public static void main(String args[]){
        Employee e1 = new Employee();
        e1.showData();
        Employee e2 = new Employee();
        e2.showData();
        Employee.b++;
        e1.showData();
    }
}
class Employee {
    int a;
    static int b;
    Employee(){
        b++;
    }
    public void showData(){
        System.out.println("Value of a = "+a);
        System.out.println("Value of b = "+b);
    }
    public static void increment(){
//a++;
    }
}