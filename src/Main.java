public class Main {

    public static void main(String[] args) {
        testMyHashTable();
        testPart2();
        testBST();
    }

    public static void testMyHashTable(){
        MyHashTable<String, Integer> hashTable = new MyHashTable<>();

        hashTable.put("apple", 10);
        hashTable.put("banana", 20);
        hashTable.put("cherry", 30);
        hashTable.put("date", 40);

        System.out.println("Value for 'apple': " + hashTable.get("apple"));
        System.out.println("Value for 'banana': " + hashTable.get("banana"));

        System.out.println("Does 'banana' exist? " + hashTable.contains("banana"));
        System.out.println("Does 'fig' exist? " + hashTable.contains("fig"));

        System.out.println("Removing 'banana'...");
        hashTable.remove("banana");
        System.out.println("Does 'banana' exist after removal? " + hashTable.contains("banana"));
        System.out.println("Value for 'banana' after removal: " + hashTable.get("banana"));

        System.out.println("Current size of hash table: " + hashTable.size());

        System.out.println("Adding 'fig' with value 50...");
        hashTable.put("fig", 50);
        System.out.println("Value for 'fig': " + hashTable.get("fig"));

        System.out.println("Current size of hash table after adding 'fig': " + hashTable.size());

        System.out.println();
    }

    public static void testPart2(){
        BST<Integer, String> tree = new BST<>();

        tree.put(3, "Three");
        tree.put(1, "One");
        tree.put(2, "Two");

        for (BST.Entry<Integer, String> elem : tree.keys()) {
            System.out.println("Key = " + elem.getKey() + " and Value = " + elem.getValue());
        }
        System.out.println();
    }

    public static void testBST(){
        BST<String, Integer> tree = new BST<>();

        tree.put("Mango", 10);
        tree.put("Apple", 20);
        tree.put("Banana", 30);
        tree.put("Orange", 40);

        System.out.println("Value for 'Apple': " + tree.get("Apple"));

        System.out.println("Does tree contain 'Banana'? " + (tree.get("Banana") != null));

        System.out.println("Deleting 'Banana'...");
        tree.delete("Banana");
        System.out.println("Does tree contain 'Banana' after deletion? " + (tree.get("Banana") != null));

        System.out.println("All keys and values after deletion:");
        for (BST.Entry<String, Integer> entry : tree.keys()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("Current size of the BST: " + tree.size());

        System.out.println("Is the BST empty? " + tree.isEmpty());
    }
}