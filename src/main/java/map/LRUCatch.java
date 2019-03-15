package map;

import java.util.LinkedHashMap;

/**
 * 基于linkedHashMap 实现LRU缓存
 */
public class LRUCatch<K,V> extends LinkedHashMap<K,V> {

    protected int maxElements;

    public LRUCatch(int maxSize) {
        super(maxSize, 0.75f, Boolean.TRUE);
        maxElements = maxSize;

    }

    @Override
    public boolean removeEldestEntry(java.util.Map.Entry entry) {
        return maxElements < size();
    }

}
