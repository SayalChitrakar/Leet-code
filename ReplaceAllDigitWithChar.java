public class ReplaceAllDigitWithChar {

    public static String replaceDigitToString(String s) {

        int i;

        StringBuilder sb= new StringBuilder();
        for(i=1;i<s.length();i=i+2){
            sb.append(s.charAt(i-1));
            char newChar = (char)(s.charAt(i-1)+s.charAt(i)-'0');
            sb.append(newChar);
        }
        if(s.length()%2!=0){
            sb.append(s.charAt(s.length()-1));
        }

        return sb.toString();
    }

    public static char shift(char c, int x){

        return (char)(c+x);
    }
    public static void main(String[] args){

        String s ="a1b2c3d4e";
        System.out.println(replaceDigitToString(s));
    }
}
