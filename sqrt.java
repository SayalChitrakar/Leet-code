public class sqrt {

    public static int mySqrt(int x){

        int i=1;
        int sum=0;
        while(x>=i){

            x=x-i;
            sum ++;
            i+=2;

        }
        return sum;
    }

    public static void main(String[] args){

        System.out.println(mySqrt(25));
    }

}
