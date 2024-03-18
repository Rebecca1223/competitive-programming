class Solution {
public:
    vector<vector<int>> insert(vector<vector<int>>& intervals, vector<int>& newInterval) {
        if (intervals.size() == 0) return {newInterval};
        vector<vector<int>> result;
        int startVal, endVal;
        int start = 0;
        
        if (newInterval[0] < intervals[0][0]) { // starts before first interval
            startVal = newInterval[0];
        } else {
            while (start < intervals.size()) {
                if (newInterval[0] >= intervals[start][0] && newInterval[0] <= intervals[start][1]) { // in between current interval
                    startVal = intervals[start][0];
                    break;
                }
                if (start < intervals.size()-1 && newInterval[0] > intervals[start][1] && newInterval[0] < intervals[start+1][0]) { // between 2 existing intervals
                    startVal = newInterval[0];
                    result.push_back(intervals[start]);
                    break;
                }
                result.push_back(intervals[start]);
                start++;
            }

            if (start == intervals.size()) { // added to end
                result.push_back(newInterval);
                return result;
            }
        }
        
        if (newInterval[1] < intervals[start][0]) {
            result.push_back({startVal, newInterval[1]});
            start -= 1;
        } else {
            while (start < intervals.size()) {
                if (newInterval[1] >= intervals[start][0] && newInterval[1] <= intervals[start][1]) {
                    endVal = intervals[start][1];
                    break;
                }
                if (start < intervals.size()-1 && newInterval[1] > intervals[start][1] && newInterval[1] < intervals[start+1][0]) { // between 2 existing intervals
                    endVal = newInterval[1];
                    break;
                }
                start++;
            }

            if (start == intervals.size()) { // ending is bigger than everything
                result.push_back({startVal, newInterval[1]});
                return result;
            }
            result.push_back({startVal, endVal});
        }
        
        for (int i = start+1; i < intervals.size(); i++) {
            result.push_back(intervals[i]);
        }
        
        return result;
    }
};