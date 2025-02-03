public class Main {
    public static void main(String[] args) {
        // Initialize the LRUCache with capacity 2
        LRUCache lRUCache = new LRUCache(2);

        // Add key-value pair (1, 1) to the cache
        lRUCache.put(1, 1);
        System.out.println("Cache after put(1, 1): " + lRUCache);

        // Add key-value pair (2, 2) to the cache
        lRUCache.put(2, 2);
        System.out.println("Cache after put(2, 2): " + lRUCache);

        // Access key 1
        System.out.println("get(1): " + lRUCache.get(1)); // Expected: 1

        // Add key-value pair (3, 3) to the cache (causes eviction of key 2)
        lRUCache.put(3, 3);
        System.out.println("Cache after put(3, 3): " + lRUCache);

        // Access key 2 (should not be found)
        System.out.println("get(2): " + lRUCache.get(2)); // Expected: -1

        // Add key-value pair (4, 4) to the cache (causes eviction of key 1)
        lRUCache.put(4, 4);
        System.out.println("Cache after put(4, 4): " + lRUCache);

        // Access key 1 (should not be found)
        System.out.println("get(1): " + lRUCache.get(1)); // Expected: -1

        // Access key 3
        System.out.println("get(3): " + lRUCache.get(3)); // Expected: 3

        // Access key 4
        System.out.println("get(4): " + lRUCache.get(4)); // Expected: 4
    }
}
