class Solution {
public:
    int minDistance(string word1, string word2) {
        vector<vector<int>> dp(word1.length()+1, vector<int>(word2.length()+1));
        
        for (int i = 0; i < word1.length() + 1; i++) dp[i][word2.length()] = word1.length()-i;
        for (int i = 0; i < word2.length() + 1; i++) dp[word1.length()][i] = word2.length()-i;
        
        for (int i = word1.length()-1; i >= 0; i--) {
            for (int j = word2.length()-1; j >= 0; j--) {
                if (word1[i] == word2[j]) {
                    dp[i][j] = dp[i+1][j+1];
                } else {
                    dp[i][j] = 1 + min(dp[i+1][j+1], min(dp[i][j+1], dp[i+1][j]));
                }
            }
        }
        
        return dp[0][0];
    }
};