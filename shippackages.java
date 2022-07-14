class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start = 0;
        int end = 0;
        
        for(int i=0;i<weights.length;i++)
        {
            start = Math.max(start,weights[i]);
            end += weights[i];
        }
        
        
        while(start<end)
        {
            int mid = start + (end-start)/2;
            int pieces = 1;
            int sum = 0;
            for(int nums:weights)
            {
                if(sum+nums>mid)
                {
                    sum = nums;
                    pieces++;
                }
                else
                {
                    sum+=nums;
                }
            }
            
            if(pieces <= days)
            {
                end = mid;
            }
            else
            {
                start=  mid + 1;
            }
        }
        return start;
    }
}
