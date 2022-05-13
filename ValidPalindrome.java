import java.util.Locale;

public class ValidPalindrome {
    public static boolean isPalindrome (String s){

        String str = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        String str1 = "";
        int startPointer = 0;
        int endPointer = str.length()-1;
        while(startPointer<=endPointer){

            if(str.charAt(startPointer)!= str.charAt(endPointer)){
                return false;
            }
            startPointer++;
            endPointer--;
        }

        return true;
    }
    public static void main(String[] args){

        String s = " A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(s));
    }
}
