public class minimumCostToMoveTheCheapFromThePosition {
    public static int logic(int[] position){

        int odd = 0;
        int even = 0;
        for(int coin:position){
            if(coin%2==1)odd++;
            else even++;
        }

        return Math.min(odd,even);
    }
    public static void main(String[] args){

        int[] position = {2,2,2,3,3};
        System.out.println(logic(position));
    }
}
