public class majorityElement{
public static void main(String[] args) {
    int[]nums={3,2,3};
    int count=0;
    int element=0;
    for(int i=0;i<nums.length;i++){
        if(count==0){
            count=1;
            element=nums[i];
        }
        else if(element!=nums[i]){
            count=count-1;
        }
        else if(element==nums[i]){
            count=count+1;
        }

    }
    System.out.println(element);
}
}