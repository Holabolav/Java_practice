import java.util.*;
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Your Marks: ");
        int G= sc.nextInt();
        if (G<=30){
            System.out.println("D");
        }else if (G>30 && G<=60){
            System.out.println("C");
        }else if (G>60 && G<=70){
            System.out.println("B");
        }else if (G>70 && G<=90){
            System.out.println("A");
        }else if(G>90 && G<=100){
            System.out.println("A+");
        }else{
            System.out.println("invalid marks");
        }
            
        //SUM
        System.out.println("SUM");
        System.out.print("Enter first number: ");
        int a= sc.nextInt();
        System.out.print("Enter second number: ");
        int b= sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
        
        //EVEN ODD
        System.out.println("EVEN OR ODD");
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.print("EVEN");
        }else{
            System.out.println ("ODD");
        }
        //greatest number
        System.out.print("a1:");
        int a1= sc.nextInt();
        System.out.print("a2:");
        int a2= sc.nextInt();
        System.out.print("a3:");
        int a3= sc.nextInt();
        if(a1>a2 &&a1>a3){
            System.out.println("a1 is greater "+a1);
        }else if(a2>a1 && a2>a3){
            System.out.println("a2 is greater "+a2);
        }else{
            System.out.println("a3 is greater "+a3);
        }
        
        //10 to 1
        for(int i=10; i>=1; i--){
            System.out.println(i);
        }
        
        //even from 1 to 100
        System.out.println("EVEN: ");
        for(int j=0; j<=100; j++){
            if(j%2==0){
                System.out.print(" " +j);
            }
        }
        
        //odd from 1 to 100
        System.out.println("\nODD: ");
        for(int k=0; k<=100; k++){
            if(k%2!=0){
                System.out.print(" " +k);
            }
        }
            
            Integer y = 90;
            Integer x = 90;

            if (y==x){
                System.out.println("yes");
            }else{
                System.out.println("No");
            }

        
    }
}