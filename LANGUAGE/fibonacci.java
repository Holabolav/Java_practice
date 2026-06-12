import java.util.*;
public class fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] fib= new int[size];
        fib[0]=0;
        fib[1]=1;

        for(int i=2; i<size; i++){
            fib[i]= fib[i-1] + fib[i-2];
        }

        for(int i=0; i<size; i++){
            System.out.print(fib[i]+" ");

        }




    }
}