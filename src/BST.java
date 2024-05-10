public class BST<K extends Comparable<K>, V> {
    private Node root;
    private class Node {
        private K key;
        private V val;
        private Node left, right;

        private Node(K key, V val){
            this.key = key;
            this.val = val;
        }
    }

    public void put(K key, V value){

    }

    public V get(K key){
        return null;
    }

    public boolean delete(K key){
        return false;
    }

    public Iterable<K> keys(){
        return null;
    }
}
