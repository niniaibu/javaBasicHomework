package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> collectionSameList = new ArrayList<>();
        for (String s1 : collection1) {
            for (String s2 : collection2) {
                if (s1.equals(s2)) {
                    collectionSameList.add(s2);
                }
            }
            // if (collection2.contains(s1)) {
            //     collectionSameList.add(s1);
            // }
        }
        return collectionSameList;
    }
}
