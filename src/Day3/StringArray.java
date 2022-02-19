package Day3;

public class StringArray {
    public static void main(String[] args) {
        String[] stringArr= new String[5];

        System.out.println("String length-----"+stringArr.length);
        for(int i=0;i< stringArr.length;i++){
            stringArr[i]= "Pune"+i;
        }
        for(int i=0;i< stringArr.length;i++){
            System.out.println("Value of the String----"+stringArr[i]);
        }
    }
}
