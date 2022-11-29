class RandomizedSet {
    HashMap <Integer, Integer> index;
    List <Integer> values;
    
    public RandomizedSet() {
        index = new HashMap<Integer, Integer>();
        values = new ArrayList<Integer>();
    }
    
    public boolean insert(int val) {
        if (index.containsKey(val)) return false;
        index.put(val, values.size());
        values.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if (!index.containsKey(val)) return false;
        int rIndex = index.get(val);
        int last = values.size() - 1;
        values.set(rIndex, values.get(last));
        index.put(values.get(rIndex), rIndex);
        index.remove(val);
        values.remove(last);
        return true;
    }
    
    public int getRandom() {
        int rand = new Random().nextInt(values.size());
        return values.get(rand);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */