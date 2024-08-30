public class ValidPalindrome {
    // Using Simple Function
    // public static boolean isPalindrome(String s) {
    //     s = s.toLowerCase();
    //     StringBuilder cleaned = new StringBuilder();

    //     for(char c : s.toCharArray()) {
    //         if(Character.isLetterOrDigit(c)){
    //             cleaned.append(c);
    //         }
    //     }
    //     String cleanedStr = cleaned.toString();
    //     String reversedStr = cleaned.reverse().toString();

    //     return cleanedStr.equals(reversedStr);
    // }

    // Using Recursion Function
    public static boolean isPalindrome(String s) {
        s = cleanString(s.toLowerCase());

        return isPalindromeRecursive(s, 0, s.length() - 1); 
    }

    public static String cleanString(String s) {
        StringBuilder cleaned = new StringBuilder();
        
        for(char c : s.toCharArray()) {
            if(Character.isLetterOrDigit(c)) {
                cleaned.append(c);
            }
        }

        return cleaned.toString();
    }

    public static boolean isPalindromeRecursive(String s, int l,int r) {
        if ( l >= r) return true;

        if(s.charAt(l) != s.charAt(r)){
            return false;
        }

        return isPalindromeRecursive(s,l+1,r-1);
    } 


    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    
}