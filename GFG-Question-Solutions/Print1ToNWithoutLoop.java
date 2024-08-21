public class Print1ToNWithoutLoop {

    public static void rec(int n) {
        if(n < 1) return;
        rec(n-1);
    }

    public static void printNos(int N) {
        rec(N);
        for(int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
    }
    
    public static void main(String[] args) {
        int N = 10;
        printNos(N);
    }
}