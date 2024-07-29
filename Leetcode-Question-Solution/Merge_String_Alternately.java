// 1768 : Merge String Alternately

public class Merge_String_Alternately {

    //  I Way to solve

    // public static String mergeAlternately(String s1, String s2) {

    //     StringBuilder sb = new StringBuilder();
    //     int i = 0;
    //     while (i < s1.length() && i < s2.length()) {
    //         sb.append(s1.charAt(i));
    //         sb.append(s2.charAt(i));
    //         i++;
    //     }
    //     sb.append(s1.substring(i));
    //     sb.append(s2.substring(i));

    //     return sb.toString();
    // }

    //  II Way to solve
    public static String mergeAlternately(String s1, String s2) {

        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s1.length() || i < s2.length() ; i++) {
            if(i < s1.length())
                sb.append(s1.charAt(i));
            if(i < s2.length())
                sb.append(s2.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "pq";

        System.out.println(mergeAlternately(s1,s2));
    }
    
}