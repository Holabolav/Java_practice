class animal{
    int age;
    String specie;

    void eat(){
        System.out.println("Eating...");
    }

}
class dog extends animal{     // single level inheritance.(parent - child)
    void bark(){
        System.out.println("Dog is barking...");
    }
}

class puppy extends dog{      // Multi level inheritance (Grand parent - parent - child)
    void pet(){
        System.out.println("petting the puppy");
    }
}
class cat extends animal{    // Hirarchial level inheritence (1 parent - multiple child) animal-> dog,cat.
    void meow(){
        System.out.println("Meooooowwww..");
    }
}

public class Animals {
    public static void main(String[] args) {
        animal lion = new animal();
        lion.eat();
        System.out.println("\n");

        dog d1 = new dog();
        d1.eat();
        d1.bark();
        System.out.println("\n");

        puppy p1 = new puppy();
        p1.eat();
        p1.bark();
        p1.pet();
        System.out.println("\n");

        cat c1 = new cat();
        c1.eat();
        c1.meow();
    }
}
