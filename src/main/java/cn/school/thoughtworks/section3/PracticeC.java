package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> collection3 = new HashMap<>();
        List<String> list = object.get("value");
        for (String string : collectionA) {
            if (collection3.containsKey(string)) {
                collection3.put(string, collection3.get(string) + 1);
            } else {
                collection3.put(string, 1);
            }
        }
        Map<String, Integer> updateMap = new HashMap<>(collection3);
        for (String stringList : list) {
            int value = collection3.get(stringList);
            int valueUpdate = value - value / 3;
            updateMap.put(stringList, valueUpdate);
        }

        return updateMap;
    }
}
