class RandomizedSet {
    HashMap<Integer, Integer> map;
    List<Integer> list;
    Random rand;

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<Integer>();
        rand = new Random();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        list.add(val);
        map.put(val, list.size() - 1);
        return true;
    }

    public boolean remove(int val) {
        if (map.containsKey(val)) {
            int index = map.get(val);
            map.put(list.get(list.size() - 1), index);
            list.set(index, list.get(list.size() - 1));
            list.remove(list.size() - 1);
            map.remove(val);
            return true;
        }
        return false;
    }

    public int getRandom() {
        int random = rand.nextInt(list.size());
        return list.get(random);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */