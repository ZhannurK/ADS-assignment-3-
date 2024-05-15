import java.util.ArrayList;
import java.util.List;

public class BST<K extends Comparable<K>, V> {
    private K key;
    private V value;
    private Node root = null;
    private int size = 0;

    private class Node {
        private final K key;
        private V val;
        private Node left, right;

        private Node(K key, V val){
            this.key = key;
            this.val = val;
        }
    }

    public void put(K key, V value){
        root = put(root, key, value);
    }

    private Node put(Node node, K key, V value){
        if(node == null){
            size++;
            return new Node(key, value);
        }
        int cmp = key.compareTo(node.key);
        if(cmp < 0){
            node.left = put(node.left, key, value);
        }
        else if(cmp > 0){
            node.right = put(node.right, key, value);
        }
        else{
            node.val = value;
        }
        return node;
    }

    public V get(K key){
        return get(root, key);
    }

    private V get(Node node, K key){
        if(node == null){
            return null;
        }
        int cmp = key.compareTo(node.key);
        if(cmp < 0){
            return get(node.left, key);
        }
        else if(cmp > 0){
            return get(node.right, key);
        }
        else{
            return node.val;
        }
    }

    public boolean delete(K key){
        if(get(key) == null){
            return false;
        }
        root = delete(root, key);
        return true;
    }

    private Node delete(Node node, K key){
        if(node == null){
            return null;
        }
        int cmp = key.compareTo(node.key);
        if(cmp < 0){
            node.left = delete(node.left, key);
        }
        else if(cmp > 0){
            node.right = delete(node.right, key);
        }
        else{
            if(node.left == null && node.right == null){
                return null;
            }
            else if(node.left == null){
                return node.right;
            }
            else if(node.right == null){
                return node.left;
            }
        }
        return node;
    }

    public Iterable<Entry<K, V>> keys() {
        List<Entry<K, V>> entry = new ArrayList<>();
        inorder(root, entry);
        return entry;
    }

    private void inorder(Node node, List<Entry<K, V>> entry) {
        if (node == null) {
            return;
        }
        inorder(node.left, entry);
        entry.add(new Entry<>(node.key, node.val));
        inorder(node.right, entry);
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public static class Entry<K, V> {
        private final K key;
        private final V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
}