import java.util.*;
public class problem71A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while ( t --> 0){
            String str = scn.next();
            int n = str.length();
            if(n <= 10){
                System.out.println(str);
            }
            else{
                StringBuilder sb = new StringBuilder();
                sb.append(str.charAt(0));
                sb.append(n - 2);
                sb.append(str.charAt(n - 1));
                System.out.println(sb.toString());
            }
        }
    }
}