class Solution {
public:
    int maxArea(vector<int>& height) {
        int max = 0;
        
        int left = 0;
        int right = height.size()-1;
        
        while (left < right && left < height.size()) {
            int vol = (right - left) * min(height[right], height[left]);
            if (vol > max) max = vol;
            
            if (height[right] < height[left]) {
                right--;
            } else {
                left++;
            }
        }
        
        return max;
    }
};