public class Solution {
    public int twoSumSmaller(int[] nums, int left, int target) 
    {
        int right = nums.length - 1;
        int count = 0;

        while(left < right)
        {
            int sum = nums[left] + nums[right];

            if(sum < target)
            {
                count += right - left;
                left++;
            }
            else
            {
                right --;
            }
        }
        return count;
    }
    public int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = 0;
        for(int i = 0; i< nums.length; i++)
        {
            ans += twoSumSmaller(nums, i + 1, target - nums[i]);
        }
        return ans;
    }
}
