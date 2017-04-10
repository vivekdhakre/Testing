/**
 * Created by vivek on 14/2/17.
 */
public class StairDemo {

    public static void main(String[] args) {

        int n =6;

        for(int i=0 ; i<=n ; i++){
            for(int j= 0 ; j <=n ; j++){
                if(i+j >= n){
                    System.out.print("#");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


