public class PrintGFGNTimes {

    static void rec(int n) {
        if(n < 1) return;       // This is condition to determinate the recursion
        System.out.print("GFG" + " ");
        rec(n - 1);     // Recursion calling again and again
    }

    static void printGfg(int N) {
        // code here
        rec(N);  // Calling recursion function
    }
    public static void main(String[] args) {
        int N = 5;
        printGfg(N);    // Function calling
    }
}
