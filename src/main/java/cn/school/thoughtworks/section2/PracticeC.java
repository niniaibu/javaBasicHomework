package cn.school.thoughtworks.section2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> countSameMap = new HashMap<>();
        for (String string : collection1) {
            if (string.length() != 1) {
                dealString(countSameMap, string);
            } else {
                addCount(string, 1,countSameMap);
            }
        }
        return countSameMap;
    }

    private void dealString(Map<String, Integer> countSameMap, String string) {
        String stringKey = string.substring(0, 1);
        int index = string.indexOf("]");
        int value;
        if (index > -1) {
            value = Integer.parseInt(string.substring(2, index));
        } else {
            value = Integer.parseInt(string.substring(2));
        }
        addCount(stringKey, value,countSameMap);
    }

    private void addCount(String string, int value, Map<String, Integer> countSameMap) {
        if (countSameMap.containsKey(string)) {
            countSameMap.put(string, countSameMap.get(string) + value);
        } else {
            countSameMap.put(string, value);
        }
    }
}
