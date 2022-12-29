import java.util.*;

class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        HashMap<Integer, Integer> items = new HashMap<Integer, Integer>();
        for (int i = 0; i < items1.length; i++) {
            items.put(items1[i][0], items1[i][1]);
        }
        for (int i = 0; i < items2.length; i++) {
            if (items.containsKey(items2[i][0])) {
                items.put(items2[i][0], items.get(items2[i][0]) + items2[i][1]);
            } else {
                items.put(items2[i][0], items2[i][1]);
            }
        }
        
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        for (Integer i : items.keySet()) {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            temp.add(i);
            temp.add(items.get(i));
            ret.add(temp);
        }
        Collections.sort(ret, new Comparator<List<Integer>>() {    
                @Override
                public int compare(List<Integer> o1, List<Integer> o2) {
                    return o1.get(0).compareTo(o2.get(0));
                }               
        });
        return ret;
    }
}