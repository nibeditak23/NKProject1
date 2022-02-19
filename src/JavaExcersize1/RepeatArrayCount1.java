package JavaExcersize1;

public class RepeatArrayCount1 {
    public static void main(String[] args) {
        int[] repetitiveArr = {1,3,4,5,6,3,2,4,6,7,9,4,12,3,4,6,8,9,7,6,43,2,4,7,7,5,2,1,3,4,6,311,1};
        int[] compareF = new int[repetitiveArr.length];
        for (int i=0;i<repetitiveArr.length;i++) {
            int currentCompNum = repetitiveArr[i];
            int countRepeatation = 1;
            int nCountPresent = 0;
            for(int n=0;n<compareF.length;n++) {
                if (compareF[n] == repetitiveArr[i])
                    nCountPresent++;
            }

            if(nCountPresent==0) {
                for (int k = i + 1; k < repetitiveArr.length; k++)
                    if (currentCompNum == repetitiveArr[k])
                        countRepeatation++;
                System.out.println(currentCompNum + "- Repeated " + countRepeatation + " times");
                compareF[i]=currentCompNum;
            }

        }

    }
}
