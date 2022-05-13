public class reduceNumberTillZero {
    public static int logic(int num){
        int count =0;
        while(num!=0){
            if(num%2!=0){
                num =num-1;
            }
            else{
                num = num/2;
            }
            count++;

        }
        return count;
    }

    public static void main(String[] args){
        int num = 8;
        System.out.println(logic(num));
    }
}
