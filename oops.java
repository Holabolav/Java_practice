class Car1 {
    String colour;
    int speed;

    void display() {
        System.out.println("Current speed: "+speed);
        System.out.println("Speed is 100 and the colour is red");
    }
}

class Students {
    String name;
    int id;

    Students(int roll, String yname){
        id = roll;
        name = yname;
        //System.out.println("Constructer created ");
    }

    void display() {
        System.out.println("Shivendra id is 069");
    }
}

public class oops {
    public static void main(String[] args) {

        Car1 obj = new Car1(); // object creation
        obj.speed = 200;

        Students obj1 = new Students(1113, "shiv");
        // Students obj2 = new Students(1234);

        obj.display();
        obj1.display();
        // obj2.display();
        System.out.println(obj1.id);
        System.out.println(obj1.name);
    }
}