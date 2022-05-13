import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithGreatesNumberOfCandies {
    public static List<Boolean> logic(int[] candies, int extraCandies){

        List<Boolean> myList = new ArrayList<>();

        int max = Arrays.stream(candies).max().getAsInt();

        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                myList.add(true);
            } else {
                myList.add(false);
            }
        }

        return myList;
    }
    public static void main(String[] args){
        int[]  candies = {12,1,12};
        int extraCandies = 10;
        System.out.println(logic(candies,extraCandies));
    }

}
