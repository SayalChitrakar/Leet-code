public class secondTry {

    public static void checker(String input){

        int i,j,k;
        String newStrin = "";
        String temp = "" ;
        String temp1 ="";

        for(j=0;j<2;j++){
            for(i=j+2;i<j+4;i++){
              temp+=input.charAt(i);
            }
            newStrin+=temp;
            newStrin+=input.substring(j*4,j*4+2);

        }




        System.out.println(newStrin);




    }
    public static void main(String[] args){

        String value ="ABCDEFGH";

        checker(value);
    }
}
