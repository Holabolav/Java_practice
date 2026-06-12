import java.util.*;
public class cfs133A {

    public static void main(String[] args) {
        boolean found = false;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)=='H' || str.charAt(i)=='Q' || str.charAt(i)=='9'){
                found = true ;
                break;
            }
        } 
        if(found){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}