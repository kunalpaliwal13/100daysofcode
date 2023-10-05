class MyHashMap {
    private static final int SIZE = 1000;
    private Node[] buckets;

    /** Initialize your data structure here. */
    public MyHashMap() {
        buckets = new Node[SIZE];
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        int index = key % SIZE;
        if (buckets[index] == null) {
            buckets[index] = new Node(-1, -1); // Create a dummy node as the head of the list
        }
        Node prev = findPrev(buckets[index], key);
        if (prev.next == null) {
            prev.next = new Node(key, value);
        } else {
            prev.next.value = value; // Update the existing key's value
        }
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int index = key % SIZE;
        if (buckets[index] == null) {
            return -1;
        }
        Node prev = findPrev(buckets[index], key);
        return prev.next == null ? -1 : prev.next.value;
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int index = key % SIZE;
        if (buckets[index] == null) {
            return;
        }
        Node prev = findPrev(buckets[index], key);
        if (prev.next != null) {
            prev.next = prev.next.next;
        }
    }
    
    private Node findPrev(Node head, int key) {
        Node current = head;
        Node prev = null;
        while (current != null && current.key != key) {
            prev = current;
            current = current.next;
        }
        return prev;
    }
    
    private class Node {
        int key;
        int value;
        Node next;
        
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
