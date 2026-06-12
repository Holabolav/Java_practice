import java.util.*;
interface MyCalculator {
    double operate(int a, int b);
}

public class Interfaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();


        MyCalculator addition = (a, b) -> (a + b);
        System.out.println("Addition is: "+addition.operate(x,y));

        MyCalculator sub = (a,b) -> (a - b);
        System.out.println("Subtration is:  "+sub.operate(x, y));

        MyCalculator mul = (a,b) -> (a*b);
        System.out.println("Multiplication is: "+mul.operate(x, y));

        MyCalculator div = (a,b) -> (a/b);
        System.out.println("Division is: "+div.operate(x, y));
    }
}