public int maxOperations(int[] nums, int target) 
    {
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length-1;
        int count = 0;
        
        while(low <= high)
        {
            int sum = nums[low] + nums[high];
            if(sum == target)
            {
                count++;
                low++;
                high--;
            }
            else if (sum > target)
            {
                high --;
            }
            else
            {
                low ++;
            }
        }
        return count;
    }
