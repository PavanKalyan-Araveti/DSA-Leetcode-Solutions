package leetCode.top150IQ.QN380InsertDeleteGetRandom;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class RandomizedSet {
    private List<Integer> list;
    private Map<Integer, Integer> map;
    public RandomizedSet() {
        this.list = new ArrayList<>();
        this.map = new HashMap<>();
    }

    public boolean insert(int val) {
        if(map.containsKey(val)) return false;
        list.add(val);
        map.put(val, list.size() - 1);
        return true;
    }

    public boolean remove(int val) {
        Integer valueIndex = map.get(val);
        if(valueIndex == null) return false;
        int lastIndex = list.size() - 1;
        int lastIndexValue = list.get(lastIndex);
        if(valueIndex != lastIndex) {
            list.set(valueIndex, lastIndexValue);
            map.put(lastIndexValue, valueIndex);
        }
        list.remove(lastIndex);
        map.remove(val);
        return true;
    }


    public int getRandom() {
        return list.get(ThreadLocalRandom.current().nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */