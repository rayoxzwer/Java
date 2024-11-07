package csci235;

public class BSTMap<K extends Comparable<K>, V> implements Map<K, V>  {

    private class Node {
        public K key;
        public V value;
        public Node left;
        public Node right;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node root;

    private int size;

    public BSTMap() {
        this.root = null;
        this.size = 0;
    }

}


