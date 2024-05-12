import java.util.ArrayList;
import java.util.List;

public class BST<K extends Comparable<K>, V> {
    private K key;
    private V value;
    private Node root;
    private int size;

    private class Node {
        private K key;
        private V val;
        private Node left, right;

        private Node(K key, V val){
            this.key = key;
            this.val = val;
        }
    }

    public K getKey(){
        return key;
    }

    public V getValue(){
        return value;
    }

    public BST() {
        root = null;
        size = 0;
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

    public Iterable<K> keys(){
        List<K> queue = new ArrayList<K>();
        inorder(root, queue);
        return queue;
    }

    private void inorder(Node node, List<K> queue){
        if(node == null){
            return;
        }
        queue.add(node.key);
        inorder(node.left, queue);
        inorder(node.right, queue);
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }
}