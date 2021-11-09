public class LargestElementOfArray {
    public static void main(String[] args) {
        int [] myList = {8, 9, 10, 7, 1, 15, 21};
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }
        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) max = myList[i];
        }
        System.out.println("Max is " + max);
    }
}
