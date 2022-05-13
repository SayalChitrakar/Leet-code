public class finalValueAfterOperations {
    public static int finalValue(String[] operations){
        int x=0;
        int i;
        for(i=0;i<operations.length;i++){
            if(operations[i].contains("+")){
                x++;
            }
            else if(operations[i].contains("-")){
                x--;
            }
        }
        return x;

    }
    public static void main(String[] args){
        String[] operations = {"++X","++X","X++"};
        System.out.println(finalValue(operations));
    }
}
