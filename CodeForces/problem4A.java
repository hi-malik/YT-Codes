import java.util.*;
public class problem4A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        if(t % 2==0 && t > 2){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}