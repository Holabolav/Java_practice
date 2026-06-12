package Dsa;
// create a linkedList 5->3->4->1 then update 4 with 6 
import java.util.LinkedList;

public class Linkedlis {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>(); //1--> Creation.
        ll.add(5); //2--> Addition.
        ll.add(3);
        ll.add(4);
        ll.add(1);

        System.out.println(ll);
        ll.set(2, 6); //3--> Updation.
        System.out.println(ll);

        for(int i =0; i<ll.size(); i++){
            System.out.println(ll.get(i)); //excess each element 
        }
//Q--> check wether there is a loop present in a LL i.e. if 2 points at 3 and 3 points back at 2 ..it is a loop 

    }
}
