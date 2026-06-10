class Calculator{
    int add(int a,int b){
        return a+b;
    }
    double add(double a, double b){
        return a + b;
    }
    int add(int a, int b, int c){
        return a + b +c;
    }
}
class Advancecalc extends Calculator{
    @Override
    int add(int a, int b){
        System.out.println("overwritten");
        return a + b + 10;
    }
}

public class Calc {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(10, 20));
        System.out.println(c.add(10.1, 20.2));
        System.out.println(c.add(2, 3, 1)+ "\n ");

        Advancecalc cal1 = new Advancecalc();
        System.out.println(cal1.add(10,20));
    }
}
