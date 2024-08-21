// Q. Given an integer n, calculate the sum of series 13 + 23 + 33 + 43 + … till n-th term.
public class SumOfFirstNTerms {

    static long sumOfSeries(long n) {
        if(n == 1){
            return 1;
        }else {
            return n * n * n + sumOfSeries(n-1);
        }
    }

    public static void main(String[] args) {
        int N = 5;
        System.out.println(sumOfSeries(N));
    }
}
