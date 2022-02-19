package JavaPractice_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayList2 {
    public static void main(String[] args) {
        List<String> listCourse = new ArrayList<>();
        listCourse.add("Java");
        listCourse.add("Python");
        listCourse.add("Selenium");
        listCourse.add("JavaScript");
        listCourse.add("VBScript");
        listCourse.add("JavaC");
        System.out.println("Before--> "+listCourse);
        List<String> subListCourse = listCourse.subList(0, 6);
        System.out.println("After--> "+listCourse);
        System.out.println("Before--> "+subListCourse);

        List<String> colours = new ArrayList<>();
        colours.add("Red");
        colours.add("Orange");
        colours.add("Red");
        colours.add("Yellow");
        colours.add("Green");
        colours.add("Blue");
        System.out.println("Print the object---> "+colours);
        Collections.copy(subListCourse,colours);

        System.out.println(colours.equals(subListCourse));
    }
}
