package Day3;

public class Array {
    public static void main(String[] args) {

       int[] arr1 = {1, 6, 9, 78};
        System.out.println("Length of arr--"+arr1.length);

        for(int i=0; i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
        int[] arr2 = new int[5];
        arr2[0]=1;
        arr2[1]=19;
        arr2[2]=21;
        arr2[3]=51;
        arr2[4]=100;
        System.out.println(arr2[3]);
        for(int j=0;j<arr2.length;j++){
            System.out.println(j+"array value---"+arr2[j]);
        }


    }

}
