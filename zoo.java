//abstraction
abstract class animal{    //abstract shows that this class is incomlete and its object cant be just created.
    abstract void sound();

    public void sleep(){
        System.out.println("the animal sleeps");
    }
}

class Dog extends animal{
    @Override
    void sound(){
        System.out.println("The Dog BARKS!!!");
    }

}
class Cat extends animal{
    void sound(){
        System.out.println("Meooooooowwwwwww..");
    }
}


public class zoo {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        d.sound();
        c.sound();

    }
}

