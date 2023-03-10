package Array2;

public class HaveThree {
    public static void main(String[] args) {
        int [] array={};
        System.out.println(haveThree(array));


    }
    public static boolean haveThree(int[] nums) {
        if(nums.length==0)
            return false;
        int sum=0;
        for(int i=0; i<nums.length-1;i++) {
            if(nums[i]==3 && nums[i+1]==3) {
                return false;
            }
            if(nums[i]==3) {
                sum++;
            }
        }
        if(nums[nums.length-1]==3)
            sum++;
        return sum==3;
    }
}

