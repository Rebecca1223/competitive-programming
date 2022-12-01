class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int boat = 0;
        int left = 0;
        int right = people.length-1;
        Arrays.sort(people);
        
        while (left <= right) {
            if (people[right] + people[left] <= limit) left++;
            right--;
            boat++;
        }
        
        return boat;
    }
}