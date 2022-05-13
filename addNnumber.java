import java.util.*;
public class addNnumber {

    public static int sum = 0;
    public static int add(int value){

        sum += value;
        return sum;

    }

    public static void main(String[] args){


        while(true){
            Scanner scan = new Scanner(System.in);

            int value = scan.nextInt();

            if(value == 'e'){
                System.out.println(".............exit........");
                break;
            }
            System.out.println(add(value));
        }

    }
}
