public class fact {
    public static void main(String[] args) {
        int num = 5;
        int fact=1;
        while(num>0){
            
            fact= fact*num;
            num--;
        }
        System.out.println(fact);

        for(int i=1; i<=5; i++){
            fact= fact*i;
            
        }
        System.out.println(fact);
    }

}
