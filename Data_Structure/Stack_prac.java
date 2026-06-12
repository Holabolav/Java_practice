// Implement stack using array or LinkedList

import java.util.*;

public class Stack_prac {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        
        // Stack<String> st = new Stack<>();
        // st.push("Shiv");
        // st.push("Haggu");
        // st.push("damu");
        // st.push("chau");
        
        // System.out.println(st);
        // System.out.println(st.peek());        
        
        //st.insertElementAt("singh", 0); //pops all element then push the desired element at right place and then push all back.

        // System.out.println(st.pop());
        // st.set(2, "hing"); // same pops elements till the index add push new elent then add all back.
        // st.add(0, "null"); 

        for(int i = st.size()-1; i>=0; i--){
            System.out.println(st.get(i));
        }

        
    }
}
