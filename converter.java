import java.util.Arrays;

public class converter {

    public static String convert(String input){
      int i;
      StringBuilder newString = new StringBuilder(input);
      String newStr ="";

      if(input.length()==1){
            if(input.charAt(0)=='x'){
                newStr="ecks";
            }
            else{
              newStr = input;
          }

      }
      else{
            if(input.charAt(0)=='x' && input.charAt(1)!=' '){
                newStr = "z";
            }
            else if(input.charAt(1)==' ' && input.charAt(0)=='x' ){
                newStr = "eks";
            }
            else{
                newStr+=input.charAt(0);
            }
            for(i=1;i<newString.length();i++){

                if(input.charAt(i)=='x'){
                    newStr+="cks";
                    if(i!=newString.length()-1){
                        i++;
                    }
                    else{
                        break;
                    }

                }

                newStr+=input.charAt(i);
            }
        }


      return newStr;

    }
    public static void main(String[] args){
        String a= "x ray";
       System.out.println(convert(a));
    }
}
