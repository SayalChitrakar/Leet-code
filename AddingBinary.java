public class AddingBinary {

    public static String addBinary(String a, String b){

        int carry=0;
        int i = a.length()-1;
        int j = b.length()-1;
        String ans ="";
        int sum;
        while(i>=0 || j>=0){

            sum = carry;
            if(i>=0){
                sum+=a.charAt(i)-'0';
            }
            if(j>=0){
                sum+=b.charAt(j)-'0';
            }
            ans = sum%2 +ans;

            carry = sum/2;


            i--;
            j--;
        }
        if(carry!=0){
            ans = carry + ans;
        }


        return ans;
    }
    public static void main(String[] args){

        System.out.println(addBinary("11","1"));
    }

}
