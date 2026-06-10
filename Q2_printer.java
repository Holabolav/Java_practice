class Printer{
    void printDocument(int numberofCopies){
        System.out.println("Printing.. "+numberofCopies);
    }


    //overload method.
    void printDocument(String secretMessage){
        System.out.println("Secret message: " +secretMessage);
    }
}
//Task 2 method overriding.
class Appliance{
    void turnOn(){
        System.out.println("Appliance is turning on..");
    }
}
class Toaster extends Appliance{
    @Override
    void turnOn(){//redefines turnOn method 

    }
}
public class Q2_printer {
    public static void main(String[] args) {
        System.out.println("Testing task 1(overloading)");
        Printer myPrinter = new Printer();//creating a new object
        myPrinter.printDocument(5);
        myPrinter.printDocument("Heyyyy");
        Toaster myToaster = new Toaster();
        myToaster.turnOn(); 

    }
}
