# 1. MyHashTable <br>
MyHashTable is a generic hash table implementation using chaining for collision resolution. It supports basic operations such as put, get, remove, contains, and getKey.

Features:<br>
Generic Type Support: Works with any types of keys and values.<br>
Collision Handling: Uses linked lists (chaining) to handle collisions.<br>
Dynamic Resizing: Not implemented, but can be added as an enhancement.<br>
Methods:<br>
put(K key, V value): Inserts a key-value pair into the hash table.<br>
get(K key): Retrieves the value associated with a key.<br>
remove(K key): Removes the key-value pair associated with a key.<br>
contains(K key): Checks if a key exists in the hash table.<br>
getKey(V value): Retrieves the key associated with a value.<br>

# 2. MyTestingClass<br>
MyTestingClass is a class designed to test the behavior of hash functions in the MyHashTable through custom hashCode() and equals() implementations.<br>

Features:<br>
Custom Hashing: Implements a custom hashCode() method.<br>
Equality Check: Implements the equals() method to compare objects based on both id and name.<br>
Methods:<br>
hashCode(): Custom hash code generator.<br>
equals(Object object): Custom equality checker.<br>

# 3. BST (Binary Search Tree)<br>
BST is a generic implementation of a binary search tree, supporting operations such as insertion, deletion, and retrieval.<br>

Features:<br>
Generic Type Support: Works with any comparable types.<br>
In-Order Traversal: Supports retrieving all entries in sorted order.<br>
Methods:<br>
put(K key, V value): Inserts a key-value pair or updates the value of an existing key.<br>
get(K key): Retrieves the value associated with a key.<br>
delete(K key): Removes the key-value pair associated with a key and maintains the BST properties.<br>
keys(): Returns an iterable list of all keys in sorted order.<br>
Inner Classes:<br>
Node: Represents a node in the binary search tree.<br>
Entry: Represents a key-value pair.<br>
Usage<br>
To utilize these classes, include them in your Java project and ensure proper handling of generics. They are ready for integration into applications requiring hash tables or binary search trees for data storage and manipulation.<br>

