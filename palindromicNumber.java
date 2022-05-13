public class palindromicNumber {
    public static boolean isPlaindrome (int x){

        String numString = Integer.toString(x);
        int beg = 0;
        int end = numString.length()-1;
        while(beg<end){
            if(numString.charAt(beg)!= numString.charAt(end)){
                return false;
            }
            beg++;
            end--;
        }

        return true;
    }
    public static void main(String[] args){

        int x = 121;
        System.out.println(isPlaindrome(x));
    }
}
