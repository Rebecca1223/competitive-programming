class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int area = 0;
        
        while (left < right) {
            int temp = (right - left) * Math.min(height[left], height[right]);
            area = Math.max(area, temp);
            
            if (height[left] < height[right]) {
                left++;
            } else if (height[right] < height[left]) {
                right--;
            } else {
                left++;
                right--;
            }
                
        }
        
        return area;
    }
}