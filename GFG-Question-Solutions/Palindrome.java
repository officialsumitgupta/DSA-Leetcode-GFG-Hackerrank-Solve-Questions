public class Palindrome {
    
    public static boolean isPalindrome(int x) {
        int num = x;   // to store the actual value in num
        int rev = 0;

        while (num > 0) {
            int rem = num % 10;     // Extract the last digit
            rev = (rev*10) + rem;
            num /= 10;      // Removed the last digit
        }

        if(rev == x) {  // check if reverse number and x number are equal
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 121;
        System.out.println(isPalindrome(n));
    }
}
