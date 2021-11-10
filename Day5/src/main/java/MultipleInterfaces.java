public class MultipleInterfaces {
    interface AnimalEat {
        void eat();
    }
    interface AnimalTravel {
        void travel();
    }
    static class Animal implements AnimalEat, AnimalTravel {
        public void eat() {
            System.out.println("Animal is eating");
        }
        public void travel() {
            System.out.println("Animal is travelling");
        }
    }
    public static class main {
        public static void main(String args[]) {
            Animal a = new Animal();
            a.eat();
            a.travel();
        }
    }
}
