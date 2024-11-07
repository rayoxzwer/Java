package csci235;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class HashTableMap<K, V> implements Map<K, V> {

    private class KVPair {
        public K key;
        public V value;

        KVPair(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private List<KVPair>[] buckets;

    private int size;

    public HashTableMap(int numBuckets) {
        this.buckets = new ArrayList[numBuckets];
        for (int i = 0; i < numBuckets; i++) {
            this.buckets[i] = new ArrayList<>();
        }
        this.size = 0;
    }

    private int getIndex(K key) {
        return Math.abs(key.hashCode()) % this.buckets.length;
    }

    private double loadFactor() {
        return (double) size / this.buckets.length;
    }
    /*
    
    */
    private void rehash(){
        int new_size = size * 2 + 1;
        V new_val;
        List<KVPair>[] new_buckets = new ArrayList[new_size];
        for(List<KVPair> arr: this.buckets){
            for(KVPair val: arr){
                int index = getIndex(val);
                new_val = val.value;
                new_buckets[index].put(val, new_val);
            }
        }
        this.buckets = new_buckets;
        }
    }
    @override
    public V put(K key, V value){
        int index = getIndex(key);
        while(true){
            //empty spot
            if(this.buckets[index] == null){
                this.buckets[index] = new List<KVPair>(key, value);
                size++;
            if(loadFactor()>=4.0){
                rehash();
            }
            return null;
            }//key exists, need to update KVpair
            else if(this.buckets[index].equals(key)){
                V temp = this.buckets[index].value;
                this.buckets[index].value = value;
                return temp;
            }else{
                index = (index + 1) % this.buckets.length;
            }
        }
    }
    @override
    public V get(K key){
        int index = getIndex(key);
        while(true){
            if(this.buckets[index].equals(key)){
                return this.buckets[index].value;
            }else{
                return null;
            }
        }
    }
    
    @override
    public boolean containsKey(K key){
        int index = getIndex(key);
        return this.buckets[index].contains(key);
    }
    @override
    public int size(){
        return this.size;
    }
    @override
    public void clear(){
        this.size = 0;
        this.buckets = new ArrayList[4];
    }
    
}


