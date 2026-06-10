import java.util.*;

public class List {
    public static void main(String[] args) { 

        // ArrayList<Integer> list1 = new ArrayList<>(); //Making a list
        // ArrayList<Integer> list2 = new ArrayList<>();
        // list1.add(10);
        // list1.add(20);
        // list1.add(30);
        // list1.add(45);

        
        // list2.add(10);
        // list2.add(20);
        // list2.add(45);

        // //Contsins all. 
        // System.out.println("Does the list 1 contain all the elements of list2: "+list1.containsAll(list2)); // true if list 1 has all the elemsnts prestent in list 2.
       
        // //RetainAll.
        // list1.retainAll(list2);
        // System.out.println("Intersection of list1 and list2: "+list1); //Prints only intersection elements.
        // System.out.println("Check if intersaction is possible: "+list1.retainAll(list2));
       
        // // removeAll
        // System.out.println("Does one contsin Second: " + list1.removeAll(list2));

        // Map<Integer,String> students = new HashMap<>();
        // //put(add)
        // students.put(69, "shiv");
        // students.put(70, "sundar");
        // students.put(71, "hassi");
        // students.put(72, "sanket");
        // students.put(73, "pandu");

        // System.out.println(students+ "\n");
        // students.put(73, "bhura");

        // System.out.println(students);

        // //get(fetch)
        // System.out.println("Student with Roll no. 71 is: "+students.get(71));

        // //Iterating a Map.
        // for(Map.Entry<Integer,String> map : students.entrySet()){
        //     System.out.println("The key is: "+ map.getKey() + " and the value is: "+ map.getValue());
        // }

        //Question
        //1 1 1 1 1 1 5 6 2 4 4 2 3 5 6 7 8 9 1 4 5 
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1, 1, 5, 6, 2, 4, 4, 2, 3, 5, 6, 7, 8, 9, 1, 4, 5)); 

        Map<Integer,Integer> freq = new HashMap<>();

        for(int i : nums){
            if(freq.containsKey(i)==true){
                int freqkey = freq.get(i);
                freq.put(i,freqkey+1);
            }else{
                freq.put(i,1);
            }
        }

        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        


    }
}
