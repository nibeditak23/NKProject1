package JavaPractice_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        List<String> colours = new ArrayList<>();
        colours.add("Red");
        colours.add("Orange");
        colours.add("Red");
        colours.add("Yellow");
        colours.add("Green");
        colours.add("Blue");
        System.out.println("Print the object---> "+colours);
        for (String col:colours)
            System.out.println("The colors --> "+col);

        colours.add(0,"Indigo");
        System.out.println("Print the Updated object---> "+colours);

       String third_obj = colours.get(2);
        System.out.println("Third Obj---> "+third_obj);
// update the 3rd element with Black
        colours.set(2,"Black");
        System.out.println("Print the Updated object---> "+colours);
        // Remove the Third element
        colours.remove(2);
        System.out.println("Print the Updated object---> "+colours);
        System.out.println(colours.get(1));
        //Search an element in the list
        if(colours.contains("Green"))
            System.out.println("Found");
        else
            System.out.println("Not Found");
        Collections.sort(colours);
        System.out.println("Print the sorted List---> "+colours);
        //copy
        List<String> list_new = new ArrayList<>(colours);
        Collections.copy(list_new,colours);
        System.out.println("Print the copied List---> "+list_new);
        System.out.println("Print the original List---> "+colours);

        List<String> copy_list = new ArrayList<>();
        copy_list.add("Java");
        copy_list.add("Python");
        copy_list.add("Selenium");
        copy_list.add("JavaScript");
        copy_list.add("VBScript");
        copy_list.add("JavaC");
        System.out.println("Before--> "+copy_list);
       // Collections.copy(copy_list,colours);
        //System.out.println("After--> "+copy_list);
        Collections.reverse(copy_list);
        System.out.println("After Reverse--> "+copy_list);



    }
}
