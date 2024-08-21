import java.util.ArrayList;
import java.util.List;

public class FindAllFactorialNumbersLessThanOrEqualToN {

    public static ArrayList<Long> factorialNumbers(long n) {
        List<Long> FactorialAns = new ArrayList<>();
        long factorial = 1;
        int a = 2;

        while (factorial <= n) {
            FactorialAns.add(factorial);
            factorial *= a;
            a++;
        }

        return (ArrayList<Long>) FactorialAns;
            
    }

    public static void main(String[] args) {
        long N = 6;
        System.out.println(factorialNumbers(N));
    }
}
