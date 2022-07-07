class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums)
            {
                if(findeven(num)==true)
                {
                    count++;
                }
        }
        return count;        
    }
    
    public boolean findeven(int num)
    {
        int count=0;
        while(num>0)
        {
            count++;
            num = num/10;
        }
        
        if(count%2==0)
        {
            return true;
        }
        return false;
    }
    
}
