import java.util.*;
public class SubsequenceOfString {
    public static void SubseqOfString(String str,int ind,String substr){
       
        int n=str.length();
        if(ind==n){
            System.out.println(substr);
            return;

        }
        
       
        SubseqOfString(str,ind+1,substr+str.charAt(ind));
        
        SubseqOfString(str,ind+1,substr);



    }

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string :");
        String str=sc.nextLine();
       

        SubseqOfString(str,0," ");
    
    }

}
