public class reverseOnlyVowles {
    public static String reverseVowels(String s){

        char[] myCharArr = s.toCharArray();
        int left = 0;
        int right= s.length()-1;
        char temp =' ';
        while(left<right){

            if(isVowel(myCharArr[left])&& isVowel(myCharArr[right])){
                temp =myCharArr[left];
                myCharArr[left] = myCharArr[right];
                myCharArr[right] =temp;
                left++;
                right--;
            }
            if(!isVowel(myCharArr[left])){
                left++;
            }
            if(!isVowel(myCharArr[right])){
                right--;
            }
        }


        return String.valueOf(myCharArr);
    }
    public static Boolean isVowel (char v){
        if(v =='a'||v=='A'||v =='e'||v=='E'||v =='i'||v=='I'||v =='o'||v=='O'||v =='u'||v=='U'){
            return true;
        }
        else{return false;}
    }

    public static void main(String[] args){

        String s = "hello";

        System.out.println(reverseVowels(s));

    }
}
