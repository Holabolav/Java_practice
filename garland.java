import java.util.*;
public class garland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
    while(t>0){
        int R = sc.nextInt();
        int G = sc.nextInt();
        int B = sc.nextInt();

        t--;
        //  if(R>=G && R>=B){
        //     max=R;
        //  }else if(G>=R && G>=B){
        //     max=G;
        //  }else{
        //     max=B;
        //  }
        int maxi = Math.max(R, Math.max(G,B));

        int n = R+G+B-maxi;

        if(maxi-1<=n){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    

    }
}
