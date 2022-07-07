class Solution {
    public int searchInsert(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(target == arr[mid])
            {
                // System.out.print("Ceiling value is");
                return mid;
            }
            else if(target > arr[mid])
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
        System.out.print("Ceiling value: ");
        return start;
    }
}
