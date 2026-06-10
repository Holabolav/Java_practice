import java.util.*;
public class Petya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
 
        s1 = s1.toUpperCase();
        s2 = s2.toUpperCase();

        // if(s1.equals(s2)){
        //     System.out.println("0");
        // }else if(s1.compareTo(s2)>0){
        //     System.out.println("1");
        // }else{
        //     System.out.println("-1");
        // }
        for(int i = 0; i<s1.length(); i++){
            int c1=s1.charAt(i);
            int c2=s2.charAt(i);
            if(c1==c2){
                System.out.println("0");
            }else if(c1<c2){
                System.out.println("-1");
            }else{
                System.out.println("1");
            }

        }
    }
}