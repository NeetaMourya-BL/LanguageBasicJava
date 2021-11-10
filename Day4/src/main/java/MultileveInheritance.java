class Animalm {
    void eat()
    {
        System.out.println("eating...");
    }
}
class Dogm extends Animalh
{
    void bark()
    {
        System.out.println("barking...");
    }
}
class BabyDogm extends Dogm {
    void weep()
    {
        System.out.println("weeping");
    }
}
public class MultileveInheritance {
    public static void main(String args[]){
        BabyDogm d=new BabyDogm();
        d.weep();
        d.bark();
        d.eat();
    }
}
