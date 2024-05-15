1. MyHashTable
MyHashTable is a generic hash table implementation using chaining for collision resolution. It supports basic operations such as put, get, remove, contains, and getKey.

Features:
Generic Type Support: Works with any types of keys and values.
Collision Handling: Uses linked lists (chaining) to handle collisions.
Dynamic Resizing: Not implemented, but can be added as an enhancement.
Methods:
put(K key, V value): Inserts a key-value pair into the hash table.
get(K key): Retrieves the value associated with a key.
remove(K key): Removes the key-value pair associated with a key.
contains(K key): Checks if a key exists in the hash table.
getKey(V value): Retrieves the key associated with a value.
2. MyTestingClass
MyTestingClass is a class designed to test the behavior of hash functions in the MyHashTable through custom hashCode() and equals() implementations.

Features:
Custom Hashing: Implements a custom hashCode() method.
Equality Check: Implements the equals() method to compare objects based on both id and name.
Methods:
hashCode(): Custom hash code generator.
equals(Object object): Custom equality checker.
3. BST (Binary Search Tree)
BST is a generic implementation of a binary search tree, supporting operations such as insertion, deletion, and retrieval.

Features:
Generic Type Support: Works with any comparable types.
In-Order Traversal: Supports retrieving all entries in sorted order.
Methods:
put(K key, V value): Inserts a key-value pair or updates the value of an existing key.
get(K key): Retrieves the value associated with a key.
delete(K key): Removes the key-value pair associated with a key and maintains the BST properties.
keys(): Returns an iterable list of all keys in sorted order.
Inner Classes:
Node: Represents a node in the binary search tree.
Entry: Represents a key-value pair.
Usage
To utilize these classes, include them in your Java project and ensure proper handling of generics. They are ready for integration into applications requiring hash tables or binary search trees for data storage and manipulation.

