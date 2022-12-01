import java.util.*;
public class problem158A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++) a[i] = scn.nextInt();

        int count = 0;
        for(int i = 0; i < n; i++){
            if(a[i] >= a[k - 1] && a[i] != 0) count++;
        }
        System.out.println(count);
    }
}
