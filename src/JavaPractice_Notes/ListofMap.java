package JavaPractice_Notes;

import java.util.*;

public class ListofMap {
    public static void main(String[] args) {
        Map<String, List<String>> addListMap = new HashMap<>();
        List<String> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("Selenium");
        courses.add("Python");
        courses.add("VB");

        List<String> colours = new ArrayList<>();
        colours.add("Red");
        colours.add("Orange");
        colours.add("Yellow");
        colours.add("Green");
        colours.add("Blue");

        addListMap.put("1",courses);
        addListMap.put("2",colours);
        System.out.println(addListMap);

        Set<String> keyValues = addListMap.keySet();
        for (String keys:keyValues ) {
            System.out.println(keys);
            List<String> valKey = addListMap.get(keys);
        }
       Collection<List<String>> mapValues = addListMap.values();
        for (List<String> listVals:mapValues) {
            System.out.println(listVals);
            for (String arrayVals:listVals ) {
                System.out.println(arrayVals);

            }

        }
    }
}
