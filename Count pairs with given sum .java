int getPairsCount(int[] arr, int n, int target) {
        // code here
        HashMap<Integer,Integer> hm = new HashMap<>();
        int count = 0;
        
        for(int i = 0; i < n; i++)
        {
            int comp = target - arr[i];
            int freq = hm.getOrDefault(comp, 0);
            
            count += freq;
            
            hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
        }
        
        return count;
    }
