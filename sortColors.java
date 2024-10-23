public class sortColors {
    public static void main(String[] args) {
        int[] nums={2,0,2,1,1,0};
        sort(nums);
    }
    public static void sort(int[] nums){
        int[] count=new int[3];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        int idx=0;
        for(int i=0;i<count.length;i++){
            if(i==0){
                while(count[i]>0){
                    nums[idx++]=i;
                    count[i]--;
                }
            }
            if(i==1){
                while(count[i]>0){
                    nums[idx++]=i;
                    count[i]--;
                }
            }
            if(i==2){
                while(count[i]>0){
                    nums[idx++]=i;
                    count[i]--;
                }
            }
        } 

    }
    
}
