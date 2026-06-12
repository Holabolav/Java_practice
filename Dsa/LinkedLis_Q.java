package Dsa;
//Q--> check wether there is a loop present in a LL i.e. if 2 points at 3 and 3 points back at 2 ..it is a loop
//fast and slow method...
import java.util.*;

public class LinkedLis_Q {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(); //Size of LinkedList...
        while(s>=1){  
            int n = sc.nextInt(); //Taking elements of LL from the user...
            ll.add(n);
            s--;
        }
        
        System.out.println(ll);
    }
}
