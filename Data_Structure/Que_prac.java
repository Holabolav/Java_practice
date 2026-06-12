import java.util.*;

public class Que_prac {
    public static void main(String[] args) {
        Queue<Integer> Q = new LinkedList<>(); //Creation.
        Q.add(10);
        Q.add(20);
        Q.add(30); //Insertion.
        Q.add(40);
        Q.add(50);

        System.out.println("Queue: " + Q);

        System.out.println("FIFO: "+Q.poll()); //Delition.

        System.out.println("Front Element: " + Q.peek()); //Front Element.

            
        
    }
}
