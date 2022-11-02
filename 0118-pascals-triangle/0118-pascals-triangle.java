class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        temp.add(1);
        pascal.add(temp);
        
        for (int i = 1; i < numRows; i++) {
             pascal.add(row(pascal.get(i-1)));
        }
        
        return pascal;
    }
    
    List row(List<Integer> prev) {
        List<Integer> temp = new ArrayList<Integer>();
        temp.add(1);
        
        for (int i = 0; i < prev.size()-1; i++) {
            temp.add(prev.get(i) + prev.get(i+1));
        }
        
        temp.add(1);
        return temp;
    }
}