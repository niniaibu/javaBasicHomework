package cn.school.thoughtworks.section2;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> countSameMap = new HashMap<>();
        for (String string : collection1) {
            if (string.contains("-")) {
                int index = string.indexOf("-");
                String stringKey = string.substring(0, index);
                int value = Integer.parseInt(string.substring(index + 1));
                countSameMap.put(stringKey, value);
            } else {
                addCount(string, countSameMap);
            }
        }
        return countSameMap;
    }

    public void addCount(String string, Map<String, Integer> countSameMap) {
        if (countSameMap.containsKey(string)) {
            countSameMap.put(string, countSameMap.get(string) + 1);
        } else {
            countSameMap.put(string, 1);
        }
    }
}
