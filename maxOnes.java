public class maxOnes {
    public static void main(String[] args) {
        int[]nums={1,1,0,1,1,1};
        int count=0 ,num=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            else
                count=0;
                if(count>num){
                    num=count;
                }
        }
        System.out.println(num);

    }
    
}
