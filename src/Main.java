public class Main {

    public static void main(String[] args) {
        testBST();
    }

    public static void testMyHashTable(){}

    public static void testBST(){
        BST<String, Double> productPrices  = new BST<>();
        productPrices .put("Apple", 0.99);
        productPrices.put("Banana", 0.59);
        productPrices.put("Orange", 1.29);
        productPrices.put("Watermelon", 1.59);


    }
}