class Animals
{
    void eat()
    {
        System.out.println("eating");
    }
}
class Dogs extends Animals
{
    void eat()
    {
        System.out.println("eating bread");
    }
    void bark()
    {
        System.out.println("barking");
    }
    void work()
    {
        super.eat();
        bark();
    }
}
public class SuperKeyword
{
    public static void main(String args[])
    {
        Dog d=new Dog();
        d.bark();
        d.eat();
        d.work();
    }
}
