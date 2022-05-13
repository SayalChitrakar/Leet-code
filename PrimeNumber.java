public class PrimeNumber {

    public static void isIt(int num){
        int i=0;
        Boolean isNotPrime = false;
        for(i=2;i<num;i++){
            if(num%i ==0){
                isNotPrime = true;
                break;
            }
        }
        if(isNotPrime){
            System.out.println("it is not a prime number");
        }
        else{
            System.out.println("it is prime number");
        }
    }
    public static void main(String[] args){

        isIt(11);
    }
}
