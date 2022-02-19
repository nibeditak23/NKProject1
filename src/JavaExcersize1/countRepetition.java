package JavaExcersize1;

import java.util.ArrayList;
import java.util.List;

public class countRepetition {
    public static void main(String[] args) {
        Integer[] repetitiveArr = {1,3,4,5,6,3,2,4,6,7,9,4,12,3,4,6,8,9,7,6,43,2,4,7,7,5,2,1,3,4,6,311,1};
        List<Integer> compareF=new ArrayList<>();
        for (Integer i=0;i<repetitiveArr.length;i++) {
            Integer j = repetitiveArr[i];
            int count = 1;

                    if (!compareF.contains(j)) {
                        for (int k = i + 1; k < repetitiveArr.length; k++)
                            if (j == repetitiveArr[k])
                                count++;
                        System.out.println(j + "- Repeated " + count + " times");
                        compareF.add(j);
                                            }

        }
    }
}
