import java.util.Arrays;

public class Running_Sum_Of_Array {

    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++){
            nums[i] += nums[i - 1];
        }
        return nums;

        // time complexity = O(n)
        // space complexity = O(1)
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    
}