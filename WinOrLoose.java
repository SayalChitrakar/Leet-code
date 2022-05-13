public class WinOrLoose {

    public static String checker(String input){
        int i;
        char max ;
        String newString = "";

        for(i=1;i<input.length();i=i+2){
            max = input.charAt(i-1);
            if(input.charAt(i)>max){
                max = input.charAt(i);
                newString+= max;
            }
            if(input.charAt(i)==max){
                max = ' ';
            }
            newString+= max;
        }
        if(input.length()%2!=0){
           newString+=input.charAt(input.length()-1);
        }

        if(newString.replace(" ","").length() == 0){
            return "Total carnage";
        }
        else{
            return newString.replace(" ","");
        }
    }
    public static void main(String[] args){
        String value ="578921445";
        System.out.println(checker(value));
    }
}
