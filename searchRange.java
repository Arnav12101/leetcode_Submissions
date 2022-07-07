class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstindex = 0;
        int lastindex = nums.length-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                firstindex = i;
                    for(int j=nums.length - 1;j>=0;j--)
                        {
                            if(nums[j]==target)
                            {
                                lastindex = j;
                                return new int[] {i,j};
                            }
                        }
            }
        }
        return new int[] {-1,-1};
    }
}
