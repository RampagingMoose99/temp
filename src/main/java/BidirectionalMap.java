import java.util.HashMap;

public class BidirectionalMap<V, K> extends HashMap<V, K> {

    private HashMap<K, V> inverseMap = new HashMap<>();

    @Override
    public K remove(Object key) {
        inverseMap.remove(this.get(key));
        return super.remove(key);
    }

    @Override
    public boolean remove(Object key, Object value) {
        inverseMap.remove(value, key);
        return super.remove(key, value);
    }

    @Override
    public boolean replace(V key, K oldValue, K newValue) {
        inverseMap.remove(oldValue);
        inverseMap.put(newValue, key);
        return super.replace(key, oldValue, newValue);
    }

    @Override
    public K replace(V key, K value) {
        inverseMap.remove(this.get(key));
        inverseMap.put(value, key);
        return super.replace(key, value);
    }


    @Override
    public K put(V v, K k) {
        inverseMap.put(k, v);
        super.put(v, k);
        return k;
    }

    public V getKey(K k) {
        return inverseMap.get(k);
    }

    public String inverseMapToString() {
        return inverseMap.toString();
    }


}
