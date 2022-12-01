import java.util.*;
public class problem231A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        int count = 0;
        while(t --> 0){
            int v = scn.nextInt();
            int p = scn.nextInt();
            int m = scn.nextInt();
            int res = v + p + m;
            if(res >= 2) count++;
        }
        System.out.println(count);
    }
}