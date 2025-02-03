import java.util.LinkedHashMap;

class LRUCache {
    private final int capacity;
    private final LinkedHashMap<Integer, Integer> cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashMap<>(capacity, 0.75f, true) {
        };
    }

    public int get(int key) {
        if(cache.containsKey(key)) {
            return cache.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {
        cache.put(key, value);

        if (cache.size() > capacity) {
            Integer eldestKey = cache.keySet().iterator().next();
            cache.remove(eldestKey);
        }
    }

    @Override
    public String toString() {
        return cache.toString();
    }
}
