package cn.school.thoughtworks.section2;

import java.util.*;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> countSameMap = new HashMap<>();
        for (String string : collection1) {
            if (countSameMap.containsKey(string)) {
                countSameMap.put(string, countSameMap.get(string) + 1);
            } else {
                countSameMap.put(string, 1);
            }
        }
        return countSameMap;
    }
}
