class Solution
{
    public List<List<Integer>> twoSum(int[] nums, int left, int target)
    {
        List<List<Integer>>ans = new ArrayList<>();
        
        int start = left;
        int right = nums.length - 1;
        
        while(left < right)
        {
            if(left > start && nums[left - 1] == nums[left])
            {
                left++;
                continue;
            }
            
            int sum =nums[left] + nums[right];
            
            if(sum == target)
            {
                List<Integer> pair = new ArrayList<>();
                pair.add(nums[left]);
                pair.add(nums[right]);
                ans.add(pair);
                
                left++;
                right--;
            }
            else if (sum < target)
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return ans;
    }
     
    public List<List<Integer>> kSum(int[] nums, int start, int target, int k) 
    {
        if(k == 2)
        {
            return twoSum(nums,start,target);
        }
        
        List<List<Integer>> res = new ArrayList<>();
        for(int i = start; i <= nums.length - k; i++)
        {
            if(i > start && nums[i] == nums[i-1])
            {
                continue;
            }
            List<List<Integer>> subRes = kSum(nums, i+1, target - nums[i], k-1);
            
            for(List<Integer> sub : subRes)
            {
                sub.add(0, nums[i]);
                res.add(sub);
            }
        }
        return res;
    }
    
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        return kSum(nums, 0, target, 4);
    }
}
