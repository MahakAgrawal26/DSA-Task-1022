public class missingNumber {

    public static void main(String[] args) {
    int []nums={3,0,1};
    int n=nums.length;
    int sum=n*(n+1)/2;
    int sum1=0;
    for(int i=0;i<nums.length;i++){
       sum1=sum1+nums[i];
    }
    System.out.print(sum-sum1+" ");

    
   }
}
