class Solution {
public:
    int bestClosingTime(string customers) {
        int minHour = 0;
        int minPen = 0;
        int pen = 0;
        
        for (int i = 0; i < customers.length(); i++) {
            if (customers[i] == 'Y') {
                pen++;
            } else {
                pen--;
            }
            
            if (pen > minPen) {
                minPen = pen;
                minHour = i+1;
            }
        }
        
        return minHour;
    }
};