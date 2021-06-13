import sun.util.resources.ms.CalendarData_ms_MY;

import java.util.*;

public class Main {
    public static <T> Collection<T> removeDuplicates(Collection<T> collection){
        Collection<T> list = new ArrayList<T>();
        for (T item : collection) {
            if (!list.contains(item)) {
                list.add(item);
            }
        }
        return list;
    }

    public static <K, V> Map<V, Collection<K>> changeKV(Map<K, V> input){
        Map<V, Collection<K>> res = new HashMap<>();
        Set<K> keys = input.keySet();
        System.out.println(keys);
        for(K key : keys){
            V value = input.get(key);
            res.compute(value, (v,k) -> {
                if (k == null){
                    k = new HashSet<>();
                }
                k.add(key);
                return k;
            });
        }
        return res;
    }

    public static void main(String []args){
        Collection myCollection = new ArrayList();
        myCollection.add(1);
        myCollection.add(1);
        myCollection.add(2);
        myCollection.add(3);
        myCollection.add(4);
        myCollection.add(6);
        myCollection.add(2);
        myCollection.add(3);
        myCollection.add(4);
        System.out.println("task1:");
        System.out.println(removeDuplicates(myCollection));


        Map <Integer, Integer> myMap = new HashMap<Integer, Integer>();
        myMap.put(1, 2);
        myMap.put(2, 5);
        myMap.put(8, 11);
        myMap.put(23, 3);
        myMap.put(17, 21);
        System.out.println("task2:");
        System.out.println(changeKV(myMap));
    }
}
