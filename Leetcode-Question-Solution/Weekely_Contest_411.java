public class Weekely_Contest_411 {

    public static int countKConstraintSubstrings(String s, int k) {
        int n = s.length();
        int count = 0;

        for(int i = 0;i < n; i++) {
            int zeroCount = 0;
            int oneCount = 0;

            for(int j = i; j < n; j++) {
                if(s.charAt(j) == '0') {
                    zeroCount++;
                }else{
                    oneCount++;
                }

                if (zeroCount <= k || oneCount <= k) {
                    count++;
                }else{
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "10101";
        int k = 1;
        System.out.println(countKConstraintSubstrings(s,k));
    }
}
