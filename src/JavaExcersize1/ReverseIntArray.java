package JavaExcersize1;

public class ReverseIntArray {
    public static void main(String[] args) {
        int[] revArr = new int[5];
        revArr[0]= 2;
        revArr[1]= 45;
        revArr[2]= 67;
        revArr[3]= 9;
        revArr[4]= 100;

        for (int i=revArr.length-1;i>=0;i--)
            System.out.println(revArr[i]);

    }
}
