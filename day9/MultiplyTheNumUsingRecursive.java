import java.util.Scanner;
public class MultiplyTheNumUsingRecursive {
public static int multiplyNum(int a,int b){
    int res=0;
    if(a==0|| b==0){
        return 0;
    }
   if(a>0 && b>0){
    return multiplyNum(a-1,b)+b;
   }
   return -multiplyNum(a,-b);


}
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int res=multiplyNum(a,b);
        System.out.println(res);



    }


}
