public class reverrsalEqual {
    public static boolean isSameAfterReversal(int num){
        if(num/10==0){return true;}
        if(num%10 ==0){
            return false;
        }


        return true;
    }
    public static void main(String[] args){

        int num = 1800;
        //0,1,2,
        System.out.println(isSameAfterReversal(num));
    }

}
