public class singleNum {
    public static void main(String[] args) {
        int []nums={2,2,1};
        System.out.println(singleNumber(nums));

    }
    public  static int singleNumber(int[] nums) {
        int c=0;
        for (int i = 0; i < nums.length; i++) {
            c=0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i]==nums[j]) {
                    c++;
                }
            }
            if (c==1) {
                return(nums[i]);
            }
        }
return 0;
    
}
}
