class Solution {
public:
    int trap(vector<int>& height) {
        int left = 0, right = 0;
        int area = 0;
        
        while(left < height.size()-1 && right < height.size()-1) {
            while (left+1 < height.size() && height[left+1] >= height[left]) left++;
            
            if (left > height.size()-3) break;
            right = left+2;
            int prev = height[right];
            int prevI = right;
            
            while (right+1 < height.size() && height[right] < height[left]) {
                if (height[right+1] <= height[right] && height[right] >= prev) {
                    prev = height[right];
                    prevI = right;
                }
                right++;
            }
            
            // cout << "prev: " << prev << endl;
            if (right == height.size()-1 && height[right] < prev && prevI != left+1) right = prevI;
            
            int low = min(height[left], height[right]);
            // cout << left << " " << right << " | ";
            for (int i = left+1; i < right; i++) {
                int diff = low - height[i];
                if (diff > 0) area += low - height[i];
                // cout << diff << " ";
            }
            // cout << endl;
            
            left = right;
        }
        
        return area;
    }
};