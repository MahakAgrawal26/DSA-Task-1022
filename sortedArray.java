import java.util.Scanner;

public class sortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        isarray(arr,n);
    }
        public static boolean isarray(int[]arr,int n){
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                count++;
            }
        }
      if(arr[0]<arr[n-1]){
        count++;
       }
       return count<=1;
    }
}
