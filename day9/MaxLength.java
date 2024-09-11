import java.util.Scanner;
public class MaxLength {
    public static int maxLength(int[] arr,int n){
        if(n==0){
            return 0;

        }
        int maxLen=1;
        int curLen=1;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                curLen++;
           
            }
            else{
                curLen=1;
            }
            maxLen=Math.max(maxLen,curLen);
        }
        return maxLength(arr,n-1);

        //iteration methon
        /*if(n==0){
            return 0;
        }
        int maxLen=1;
        int curLen=1;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                curLen++;
           
            }
            else{
                curLen=1;
            }
            maxLen=Math.max(maxLen,curLen);
        }
        return maxLen;*/

    }
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res = maxLength(arr,n);
        
        System.out.println(res);

}
}
