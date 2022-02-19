package JavaExcersize1;

public class smallNumber {
    int[] smallNum = {1200,52,100,301,34,35,894,48,602,900,23};

    public int findSmallNum(int[] arr1){
        int j=arr1[0];
        for (int i=0;i<arr1.length;i++)
            if (j>arr1[i])
                j=arr1[i];
        return j;
    }

    public static void main(String[] args) {

        smallNumber smallNumObj = new smallNumber();
        int smallFinal= smallNumObj.findSmallNum(smallNumObj.smallNum);
        System.out.println(smallFinal);



    }

}
