package JavaExcersize1;

public class GreatestNumber {
    int[] greatNum = {1200,2,30,301,34,35,894,48,602,900};

    public int findGreatNum(int[] arr1){
        int j=1;
        for (int i=0;i<arr1.length;i++)
            if (j<arr1[i])
                j=arr1[i];
        return j;
    }

    public static void main(String[] args) {

        GreatestNumber greatNumObj = new GreatestNumber();
       int greatFinal= greatNumObj.findGreatNum(greatNumObj.greatNum);
        System.out.println(greatFinal);



    }


}
