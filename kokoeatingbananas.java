class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = 1;
        for(int i=0;i<piles.length;i++)
        {
            end = Math.max(end,piles[i]);
        }
        
        while(start<end)
        {
            int mid = start + (end - start)/2;
            int hours_spent = 0;
            
            for(int nums:piles)
            {
                hours_spent += Math.ceil((double)nums/mid);
            }
            
            if(hours_spent<=h)
            {
                end=mid;
            }
            else
            {
                start = mid+ 1;
            }
        }
        return start;
    }
}
