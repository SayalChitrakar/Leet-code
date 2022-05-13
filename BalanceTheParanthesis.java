public class BalanceTheParanthesis {

    public static int logic(String input){

        int curlCount = 0;
        int  smallCount = 0;
        boolean curlFlag = false;
        boolean smallFlag = false;


        for(int i=0;i<input.length();i++){

            if(input.charAt(i)=='{'){
                curlFlag = true;
                curlCount +=1;
            }

            else if(input.charAt(i)=='}'){
                if(!curlFlag){
                    curlCount +=1;
                }
                else{
                    curlCount -=1;
                }
                if(curlCount==0){
                    curlFlag = false;
                }

            }

            else if(input.charAt(i)=='('){
                smallCount +=1;
                smallFlag = true;
            }

            else if(input.charAt(i)==')'){
                if(!smallFlag){
                    smallCount+=1;
                }
                else{
                    smallCount-=1;
                }
                if(smallCount==0){
                    smallFlag=false;
                }

            }
        }
        return curlCount + smallCount;
    }

    public static void main(String[] args){

        String symbol = ")}";
        System.out.println(logic(symbol));

    }

}
