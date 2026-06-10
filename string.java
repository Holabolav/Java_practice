import java.util.*;
public class string {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println(name);
        String s1 = "Hello"; //A string gets stored in the string pool in the heap strorage in the memory
                              // (and str in the stack from where it points towards the heap)
        String s2 = "Hello"; //str2 will got to stack and will points towards the already existing hello in the heap.
                                // string pool dont store duplicates. 
        String s3 = new String("Hello");// will be stroed outside string pool ... a new object has been stored. 
        String s4 = new String("heLLo");

        System.out.println(s1 == s2);// true (same memory address).
        System.out.println(s1 == s3);// == tells if they exist on same position/ same address. false
        System.out.println(s1.equals(s3));//check character by character.
        System.out.println(s1.equalsIgnoreCase(s4));
        
        System.out.println(s1.length());
        System.out.println(s1.charAt(1));
        // s1 = s1.setCharAt(1,'o');
        // System.out.println(s1);
        System.out.println(s1.substring(1, 4));
        
        String Name = "OM";
        Name = "OD";
        System.out.println(Name);
        
        s1 = s1 + " World";
        s1 =  s1.concat(" Boom");
        
        System.out.println(s1);
        String s = " ";
        System.out.println(s.length());
        
        
        // str.charAt();
        // str.setCharAt( , );
        // str.length();
        // str.toUpperCase();
        // str.toLowerCase();
        // str.equals(str1);
        // str.Append("World");
        // str.insert(0,"s");
        // str.reverse();
        


    }
}
