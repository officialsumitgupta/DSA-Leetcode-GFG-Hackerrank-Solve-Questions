import java.io.*;
import java.util.*;

class SumOfAllDivisorsFrom1ToN
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
            Solution ob = new Solution();
            long ans  = ob.sumOfDivisors(N);
            System.out.println(ans);
        }
    }
}

class Solution{
    
    static int divisor(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if (n % i == 0){
                sum += i;
            }
        }
        return sum;
    }
    
    long sumOfDivisors(int N){
        long sum = 0;
        for(int i = 1; i <= N; i++) {
           sum += divisor(i);
        }
        return sum;
    }
}