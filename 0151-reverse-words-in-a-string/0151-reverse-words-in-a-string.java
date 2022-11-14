class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split(" +");
        int mid = arr.length / 2;
        String temp;
        for (int i = 0; i < mid; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        
        String str = String.join(" ", arr);
        
        return str;
    }
}