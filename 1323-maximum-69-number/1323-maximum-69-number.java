import java.lang.*;

class Solution {
    public int maximum69Number (int num) {
        int temp = num;
        int lastSix = 0;
        int digit = 0;
        int difference = 3;
        while (temp != 0){
            digit++;
            if (temp%10 == 6) {
                lastSix=digit;
            }
            temp /= 10;
        }

        return num + (difference * (int)Math.pow(10, lastSix-1));
    }
}