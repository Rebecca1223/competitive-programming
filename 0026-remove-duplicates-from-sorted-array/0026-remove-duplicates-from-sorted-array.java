class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (nums[i] != nums[i+1]){  
                temp[j++] = nums[i];  //increase the index counter after storing
            }  
         }  
        temp[j++] = nums[n-1]; //store the last element of the array (can not be repeated)
        for (int i=0; i<j; i++){  
            nums[i] = temp[i];  
        }  
        return j;   
    }
}