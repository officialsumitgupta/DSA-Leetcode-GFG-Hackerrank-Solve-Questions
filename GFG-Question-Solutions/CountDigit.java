public class CountDigit {

    static int evenlyDivides(int N) {
        int evencount = 0;
        int num = N;

        while (num > 0) {
            int digit = num % 10;  // Extract the last digit

            // Check if the digit is non-zero and divides N evenly
            if(digit != 0 && N % digit == 0) {
                evencount++;
            }

            num /= 10;  // Removing the last digit
        }

        return evencount;
    }

    public static void main(String[] args) {
        int n = 12;
        System.out.println(evenlyDivides(n));
    }
    
}
