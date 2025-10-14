class Pair {
    int key;
    int value;

    Pair(int key,int value){
        this.key=key;
        this.value=value;
    }
}

class MyHashMap {
    private static final int BUCKET_SIZE = 1000;
    // chain(array) of bucket each bucket has linkedlist 
    private LinkedList<Pair>[] buckets;  // array of type linked list<Pair> 

    public MyHashMap() {
        buckets=new LinkedList[BUCKET_SIZE];
        for(int i=0;i<BUCKET_SIZE;i++){
            buckets[i]=new LinkedList<>();
        }
    }

    public Pair existPair(int key){
        // get the index 
        LinkedList<Pair> temp=buckets[key%BUCKET_SIZE];
        // for that particular chain
        for(Pair pair:temp){
            if(pair.key==key){
                return pair;
            }
        }
        return null;
    }

    public void put(int key, int value) {
        Pair pair=existPair(key);
        if(pair!=null){
            pair.value=value;
        }else{
            Pair newPair=new Pair(key,value);
            buckets[key%BUCKET_SIZE].add(newPair);
        }
    }

    public int get(int key) {
        Pair pair=existPair(key);
        if(pair!=null){
            return pair.value;
        }
        return -1;
    }

    public void remove(int key) {
        
        Pair pair=existPair(key);
        // key exist simply remove 
        buckets[key%BUCKET_SIZE].remove(pair);

    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */