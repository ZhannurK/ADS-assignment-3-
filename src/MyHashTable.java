public class MyHashTable<K, V> {

    private static class HashNode<K, V> {
        private final K key;
        private V value;
        private HashNode<K, V> next;

        public HashNode(K key, V value) {
            this.key = key;
            this.value = value;
            next = null;
        }

        @Override
        public String toString() {
            return "{" + key + " " + value + "}";
        }
    }

    private final HashNode<K, V>[] chainArray;
    private int M = 11;
    private int size;

    public MyHashTable() {
        chainArray = new HashNode[M];
        size = 0;
    }

    public MyHashTable(int M) {
        this.M = M;
        chainArray = new HashNode[M];
        size = 0;
    }

    private int hash(K key){
        return (key.hashCode() & 0x7fffffff) % M;
    }

    public void put(K key, V value) {
        if(key == null || value == null){
            throw new NullPointerException();
        }
        int hash = hash(key);
        HashNode<K, V> current = chainArray[hash];
        for(HashNode<K, V> next = current; next != null; next = next.next){
            if(next.key.equals(key)){
                next.value = value;
                return;
            }
        }
        HashNode<K, V> newNode = new HashNode<>(key, value);
        newNode.next = current;
        chainArray[hash] = newNode;
        size ++;
    }

    public V get(K key) {
        if(key == null){
            throw new NullPointerException();
        }
        if (size == 0) {
            return null;
        }
        for(HashNode<K, V> current = chainArray[hash(key)]; current != null; current = current.next) {
            if (key.equals(current.key)) {
                return current.value;
            }
        }
        return null;
    }

    public void remove(K key) {
        if (size == 0) {
            return;
        }
        int index = hash(key);
        HashNode<K, V> prev = null;

        for(HashNode<K, V> current = chainArray[index]; current != null; current = current.next) {
            if (key.equals(current.key)) {
                if (prev == null) {
                    chainArray[index] = current.next;
                }
                else {
                    prev.next = current.next;
                }
                size--;
                return;
            }
            prev = current;
        }
    }

    public boolean contains(K key) {
        HashNode<K, V> node = chainArray[hash(key)];
        while (node != null) {
            if (key.equals(node.key)) {
                return true;
            }
            node = node.next;
        }
        return false;
    }

    public K getKey(V value) {
        if(value == null){
            throw new NullPointerException();
        }
        for (HashNode<K, V> kvHashNode : chainArray) //int i = 0; i < chainArray.length; i++
            for (HashNode<K, V> current = kvHashNode; current != null; current = current.next) {
                if (value.equals(current.value)) {
                    return current.key;
                }
            }
        return null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }
}