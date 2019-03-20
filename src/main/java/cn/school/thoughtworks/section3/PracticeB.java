package cn.school.thoughtworks.section3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> createUpdatedCollection(Map<String, Integer> collectionA, Map<String, List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> updateMap = new HashMap<>(collectionA);
        List<String> listUpdate = object.get("value");
        for (String string : listUpdate) {
            int value = collectionA.get(string);
            int valueUpdate = value - value / 3;
            updateMap.put(string, valueUpdate);
        }
        return updateMap;
    }
}
