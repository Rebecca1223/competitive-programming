import java.util.*;
class Solution {
    public int value (char c) {
        int val = 0;
        switch(c){
            case 'I':
                val = 1;
                break;
            case 'V':
                val = 5;
                break;
            case 'X':
                val = 10;
                break;
            case 'L':
                val = 50;
                break;
            case 'C':
                val = 100;
                break;
            case 'D':
                val = 500;
                break;
            case 'M':
                val = 1000;
                break;
            default:
                break;
        }
        return val;
    }
    public int romanToInt(String s) {
        int len = s.length();
        int num = 0;
        char c;
        for (int i = 0; i < len; i++) {
            c = s.charAt(i);
            int current = value(c);
            if (i < len - 1 && current < value(s.charAt(i + 1))) {
                num -= current;
            } else {
                num += current;
            }
        }
        return num;
    }
}