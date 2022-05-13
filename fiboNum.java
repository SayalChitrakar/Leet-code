public class fiboNum {
    public static int logic(int n){
        if(n ==0)return 0;
        if(n==1)return 1;

        int a =0;
        int b = 1;
        int sum = 0;
        while(n>1){
            sum  = a+b;
            a=b;
            b=sum;
            n--;
        }
        return sum;
    }

    public static void main(String[] args){

        int n =3;
        System.out.println(logic(n));

    }
}
