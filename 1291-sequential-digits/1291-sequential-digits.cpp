class Solution {
public:
    vector<int> sequentialDigits(int low, int high) {
        int lowDigits = int(log10(low) + 1);
        int highDigits = int(log10(high) + 1);
        vector<int> output;
        
        string digits = "123456789";
        
        while (lowDigits <= highDigits) {
            for (int i = 0; i < 9 - lowDigits + 1; i++) {
                int temp = stoi(digits.substr(i, lowDigits));
                if (temp >= low && temp <= high) {
                    output.push_back(temp);
                }
            }
            lowDigits++;
        }
        
        return output;
    }
};