package miniTasks.task21;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ExampleMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Anna");
        map.put(2, "Anton");
        map.put(3, "Ekaterina");
        getKeys(map);
        Collection<String> values = map.values();
        System.out.println(values);
        getKeys(map);
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        System.out.println(entries);

    }

    public static <K, V> void getKeys(Map<K,V> map) {
        for (K k : map.keySet()) {
            System.out.println(k);
        }
    }

    public static <K, V> void getValues(Map<K,V> map) {
        for (V value : map.values()) {
            System.out.println(value);
        }
    }
}
