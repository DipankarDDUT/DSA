class MyHashMap {
    ArrayList<Integer> keys;
    ArrayList<Integer> values;

    public MyHashMap() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }

    public void put(int key, int value) {
        int index = keys.indexOf(key);
        if (index == -1) {
            keys.add(key);
            values.add(value);
        } else {
            // add adds it , set replace the exisitng index with this new value
            values.set(index, value);
        }

    }

    public int get(int key) {
        // require last index 
        int index = keys.indexOf(key);
        if (index == -1)
            return -1;
        return values.get(index);
    }

    public void remove(int key) {

        int index = keys.indexOf(key);
        if (index != -1) {
            keys.remove(index);
            values.remove(index);
        }

    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */