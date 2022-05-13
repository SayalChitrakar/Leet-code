import java.beans.IndexedPropertyDescriptor;
import java.util.Arrays;

public class ImplementstrStr {

    public static int trying(String haystack,String needle){

        return haystack.indexOf(needle);
    }
    public static void main(String[] args){

        String haystack = "aaaaa";
        String needle ="bba";

        System.out.println(trying(haystack,needle));


    }
}
