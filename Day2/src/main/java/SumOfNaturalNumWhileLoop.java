public class SumOfNaturalNumWhileLoop {
    public static void main (String args []){
        int N = 1;
        int sum =0;
        while( N < 6){
            System.out.println("value of N:" + N );
            sum = sum + N;
            N++;
        }
        System.out.print("sum of naturals no:" + sum );
    }

}
