public class LongPressedName {
    public static boolean logic(String name, String typed){
        int namePointer=0;
        int typedPointer=0;
        if(name.equals(typed)){return true;}
        else{
            if(name.charAt(0)!=typed.charAt(0)){return false;}


            while(typedPointer<typed.length()){
                if( namePointer<name.length() && name.charAt(namePointer)==typed.charAt(typedPointer) ){
                    namePointer++;
                    typedPointer++;

                }
                else if(typed.charAt(typedPointer)== typed.charAt(typedPointer-1)){
                    typedPointer++;
                }
                else{
                    return false;
                }

            }
        }
        return namePointer==name.length();
    }
    public static void main(String[] args){

        String name = "alexd";
        String typed = "ale";
        System.out.println(logic(name,typed));
    }
}
