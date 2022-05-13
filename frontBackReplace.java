public class frontBackReplace {
    public static String replacer(String value){
        int i,j;
        String inString =value;
        String remain ="";
        if(value.length()%4!=0){
             inString = value.substring(0,value.length()-value.length()%4);
             remain = value.substring(value.length()-value.length()%4,value.length());
        }
        String temp="";
        for(i=0;i<inString.length();i=i+4){
            for(j=i+2;j<i+4;j++){

                temp+=inString.charAt(j);
            }
            temp+= inString.substring(i,i+2);

        }
        temp+=remain;
        return temp;
    }
    public static void main(String[] args){
       System.out.println(replacer("AABBCCDDEEFF"));
    }
}
