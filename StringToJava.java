import java.util.HashMap;

public class StringToJava {

    public static int romanToInt(String s){

        HashMap<Character,Integer> roman = new HashMap<Character,Integer>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);

        int i;
        int sum =0;

        for(i=0;i<s.length();i++){
            if(i+1<s.length() && roman.get(s.charAt(i+1))>roman.get(s.charAt(i))){

                sum-=roman.get(s.charAt(i));

            }
            else{
                sum+=roman.get(s.charAt(i));
            }
        }


        return sum;

    }
    public static void main(String[] args){
        String s = "IV";

        System.out.println(romanToInt(s));

    }
}
