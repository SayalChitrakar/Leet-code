public class truncate {

    public static String logic(String s, int k){

        String[] arrString =s.split(" ");
        StringBuilder sb = new StringBuilder("");

        for(int i=0;i<k;i++){
            sb.append(arrString[i]+" ");
        }
        return sb.toString().trim();
    }
    public static void main(String[] args){

        String s = "What is the solution to this problem";
        int k= 4;
        System.out.println(logic(s,k));
    }
}
