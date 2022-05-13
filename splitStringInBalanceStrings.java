public class splitStringInBalanceStrings {

    public static int balanaceStringSplit(String s){

        int stringCounter =0;
        int rCount = 0;
        int lCount =0;

        for(int i =0;i<s.length();i++){

            if(s.charAt(i)=='R'){
                rCount++;
            }
            else if(s.charAt(i)=='L'){
                lCount++;
            }
            if(rCount-lCount==0){
                stringCounter++;
            }
        }

        return stringCounter;
    }

    public static void main(String[] args){
        String s ="LLLLRRRR";
        System.out.println(balanaceStringSplit(s));
    }
}
