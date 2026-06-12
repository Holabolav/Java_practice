package Dsa;
import java.util.*;

public class recursionn {

        static void p(int n) {
            if(n==0){ //Base Case
                return;
            }
            System.out.println(n);//5 to 1
            p(n-1); //recursive call first

            //System.out.println(n);//1 to 5
        }
        //Sum of first n natural numbers.
        static int sum(int n){
            if(n==0){
                return 0;
            }
            return n+ sum(n-1);
        }
        //Factorial.
        static int fact(int n){
            if(n==0){
                return 1;
            }
            return n* fact(n-1);
        }
        static int fibo(int n){  //T.C. = 2^n...
            if(n<=1){
                return n;
            }
            return fibo(n-1) + fibo(n-2);
        }
        
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter numbers: ");
            int k = sc.nextInt();
            p(k);
            System.out.println("Factorial: " +fact(k));
            System.out.println("Sum: "+sum(k));
            System.out.println("Fibbonachi series: " + fibo(k));

        }
}
