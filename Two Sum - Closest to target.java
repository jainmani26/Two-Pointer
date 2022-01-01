public int twoSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length-1;
        int ans = Integer.MAX_VALUE;
        
        while(low < high)
        {
            int sum = nums[low] + nums[high];
            if(sum == target)
            {
                return 0;
            }
            else if (sum > target)
            {
                ans = Math.min(ans, sum - target);
                high --;
            }
            else
            {
                ans = Math.min(ans, target - sum);
                low ++;
            }
        }
        return ans;
    }
