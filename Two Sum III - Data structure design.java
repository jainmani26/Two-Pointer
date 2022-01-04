public class TwoSum {
     ArrayList<Integer> data;
     boolean isSorted;

     public TwoSum()
     {
         data = new ArrayList<>();
         isSorted = true;
     }
    public void add(int number) {
        data.add(number);
        isSorted = false;
    }
    public boolean find(int target)
    {
        if(isSorted == false)
        {
            Collections.sort(data);
            isSorted = true;
        }
        int left = 0, right = data.size() - 1;
        while(left < right)
        {
            int sum = data.get(left) + data.get(right);

            if(sum == target) return true;
            if(sum < target) left ++;
            else right--;
        }
        return false;
    }
}
