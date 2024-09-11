import java.util.*;
public class FindTheSafePerson {
    public static int josePhus(int n,int k){
        if(n==1){
            return 0;
        }
        return  (josePhus(n-1,k)+k)%n;

         

    }


    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit ");
        int n=sc.nextInt();
        System.out.println("Enter the limit ");
        int k=sc.nextInt();
        int res=josePhus(n,k)+1;
        System.out.println("The safe position is "+res);


}
}
