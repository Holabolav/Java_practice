import java.util.*;
public class s_c_vovels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentance you want to count vovels in: ");
        String v = sc.nextLine();
        int count = 0;
        
        for(int i = 0; i<v.length(); i++){
            v = v.toLowerCase();
            if(v.charAt(i)=='a' || v.charAt(i)=='e' || v.charAt(i)=='i' || v.charAt(i)=='o' || v.charAt(i)=='u'){
                count++;
            }
        }System.out.println(count);
    }
}
