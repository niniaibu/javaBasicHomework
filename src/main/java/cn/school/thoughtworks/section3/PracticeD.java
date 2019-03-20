package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String, Integer> createUpdatedCollection(List<String> collectionA, Map<String, List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> countSameMap = new HashMap<>();
        for (String string : collectionA) {
            int index = string.indexOf("-");
            if (index >= 0) {
                String stringKey = string.substring(0, index);
                int value = Integer.parseInt(string.substring(index + 1));
                countSameMap.put(stringKey, value);
            } else {
                addCount(string, countSameMap);
            }
        }
        Map<String, Integer> updateMap = new HashMap<>(countSameMap);
        List<String> listUpdate = object.get("value");
        for (String stringUpdate : listUpdate) {
            int value = countSameMap.get(stringUpdate);
            int valueUpdate = value - value / 3;
            updateMap.put(stringUpdate, valueUpdate);
        }

        return updateMap;
    }


    public void addCount(String string, Map<String, Integer> countSameMap) {
        if (countSameMap.containsKey(string)) {
            countSameMap.put(string, countSameMap.get(string) + 1);
        } else {
            countSameMap.put(string, 1);
        }
    }

}
