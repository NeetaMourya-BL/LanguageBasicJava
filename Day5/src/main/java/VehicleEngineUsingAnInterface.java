public class VehicleEngineUsingAnInterface {
    interface changeGear {
        void Gear();
    }
    interface chnageSpeed{
        void Speed();
    }
    static class Engine implements changeGear, chnageSpeed {
        @Override
        public void Gear() {
            System.out.println("engine gear");
        }
        @Override
        public void Speed() {
            System.out.println("engine speed");
        }
    }
    public static class main {
        public static void main(String args[]) {
            Engine e = new Engine();
            e.Gear();
            e.Speed();
        }
    }
    }
