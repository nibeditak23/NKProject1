package JavaPractice_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_Compare {
    public static void main(String[] args) {
        List<String> colours = new ArrayList<>();
        colours.add("Red");
        colours.add("Orange");
        colours.add("Indigo");
        colours.add("Yellow");
        colours.add("Green");
        colours.add("Blue");
        System.out.println("Print the object---> "+colours);

        List<String> newCols = new ArrayList<>();
        newCols.add("Red");
        newCols.add("Orange");
        newCols.add("Violet");
        newCols.add("Yellow");
        newCols.add("Green");
        newCols.add("Blue");
        newCols.add("Black");
        newCols.add("Red");
        System.out.println("Print the object---> "+newCols);

        List<String> compResult = new ArrayList<>();
        for (String cols:newCols)
            compResult.add(colours.contains(cols) ? "Yes" : "No");
        System.out.println(compResult);
        Collections.swap(colours,2,5);
        System.out.println("Print colours after Swap---> "+colours);
        colours.addAll(newCols);
        System.out.println("Print colours after Swap---> "+colours);
        //ArrayList<String> newCloneCol = (ArrayList<String>)colours.clone();
        //colours.removeAll(colours);
        System.out.println(colours);
        System.out.println(colours.isEmpty());
        String strobj = colours.toString();
        System.out.println(strobj);
        

    }
}
