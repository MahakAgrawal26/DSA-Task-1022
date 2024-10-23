public class moveZeroes {
    public static void main(String[] args) {
        int nums[]={0,1,0,3,12};
        moveZeroes(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }

        
    }
    public static  void moveZeroes(int[] nums) {
        int a=0;
        for(int i=0;i<nums.length;i++){
           if(nums[i]!=0){
               nums[a]=nums[i];
               a++;
           }
        }
        for(int i=a;i<nums.length;i++){
           nums[i]=0;
        }
        }
    

    
}
    

