public class SmallestElementOfArray {
    public static void main(String[] args) {
        int[] myList = {10, 1, 3, 8, 5, 11};
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }
        int min = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] < min) min = myList[i];
        }
        System.out.println("Min is " + min);
    }
}