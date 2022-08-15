public class Main {

    public static void main(String[] args) {
        int []nums = {3,2,4};
        int target = 6;
        Solution solution = new Solution();
        nums = solution.twoSum(nums,target);
        System.out.println(nums[0] + " " + nums[1]);
    }
}
