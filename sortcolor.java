class Solution {
    public void sortColors(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            boolean tobreak=false;
            for(int j=1;j<nums.length - i;j++)
            {
                if(nums[j]<nums[j-1])
                {
                    int temp = nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                    tobreak = true;
                }
            }
            if(!tobreak)
                {
                    break;
                }
        }
    }
}