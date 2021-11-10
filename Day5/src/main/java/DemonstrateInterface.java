public class DemonstrateInterface {
    interface Polygon_Shape {
        void calculateArea(int length, int breadth);
    }
    static class Rectangle implements Polygon_Shape {
        //implement the interface method
        public void calculateArea(int length, int breadth) {
            System.out.println("The area of the rectangle is " + (length * breadth));
        }
    }
    static class Main {
        public static void main(String[] args) {
            Rectangle rect = new Rectangle();
            rect.calculateArea(20, 40);
        }
    }
}
