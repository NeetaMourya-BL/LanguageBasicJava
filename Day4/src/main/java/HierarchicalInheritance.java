class Animalh
{
    void eat()
    {
        System.out.println("eating");
    }
}
class Dogh extends Animalh
{
    void bark()
    {
        System.out.println("barking");
    }
}
class Cat extends Animalh
{
    void meow()
    {
        System.out.println("meowing");
    }
}
public class HierarchicalInheritance {
    public static void main(String args[]){
        Cat c=new Cat();
        c.meow();
        c.eat();
    }
}
