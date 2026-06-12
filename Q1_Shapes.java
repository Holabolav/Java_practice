// crete a paret class "shape" with a string variable colour .. set to "Red"  then create a circle class that extends shape. in circle create its own colour variable set to blue.
//  write a method in circle that prints both colours using super keyword.
class Shape{
    String colour = "Red";

    void colour(){
        // System.out.println("Colour of this shape is: "+colour);
    }
}
class Circle extends Shape{
    String colour = "Blue";

    void colour(){
        System.out.println("colour of shape: "+ super.colour); //to get colour from one class into another class.
        System.out.println("Colour of the circle is: "+colour); 

    }
}



public class Q1_Shapes {

    public static void main(String[] args) {
        

        Circle c1 = new Circle();
        c1.colour();

    }
}