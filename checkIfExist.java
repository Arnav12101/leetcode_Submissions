// Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).

// More formally check if there exists two indices i and j such that :

//     i != j
//     0 <= i, j < arr.length
//     arr[i] == 2 * arr[j]




class Solution {
    public boolean checkIfExist(int[] arr) {
        // n = 2 * m;
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(i!=j && arr[i]==2 * arr[j])
                {
                    return true;
                }
            }
        }
        return false;
    }
}
