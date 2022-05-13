public class winLossToday {
    public static void logic(String s){

        String newString = "";
        for(int i =1;i<s.length();i=i+2){
            if(s.charAt(i)>s.charAt(i-1)){
                newString+=s.charAt(i);
            }
            else if(s.charAt(i)==s.charAt(i-1)){
                newString+="";
            }
            else{
                newString+=s.charAt(i-1);
            }
        }
        if(s.charAt(s.length()-1)%10!= 0){

            newString+=s.charAt(s.length()-1);
        }
        System.out.println(newString);

    }
    public static void main(String[] args){

        String s = "578921445";
        logic(s);

    }
}
