class Animalhy
{
   public void eat()
    {
        System.out.println("eating");
    }
}
class Doghy extends Animalhy
{
   public void bark()
    {
        System.out.println("barking");
    }
}
class Cathy extends Animalhy
{
    public void meow() {
        System.out.println("meowing");
    }
}
class BabyDoghy extends Doghy
{

    public void weep () {
        System.out.println("weeping");
    }
}
public class HybridInheritance
{
    public static void main(String args[]){
        Cat c=new Cat();
        c.meow();
        c.eat();
    }
}