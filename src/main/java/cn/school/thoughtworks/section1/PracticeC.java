package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> collectionSameList = new ArrayList<>();
        for (String s1 : collection1) {
            for (String s2 : collection2.get("value")) {
                if (s2.equals(s1)) {
                    collectionSameList.add(s1);
                }
            }
        }
        return collectionSameList;
    }
}
