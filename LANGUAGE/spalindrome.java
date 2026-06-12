import java.util.*;
public class spalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        if(s.equals(sb.toString())){ //convert string builder to string because string cant be checked against string builder
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        // sb= sb.append(" World");
        // System.out.println(sb);


    }
}
