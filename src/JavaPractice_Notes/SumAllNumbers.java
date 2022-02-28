package JavaPractice_Notes;

public class SumAllNumbers {
    public static void main(String[] args) {
        int n=100500;
        int sum=0;

        System.out.println(1000000%10);
        while(n>0){
            System.out.println(n/10+ "--"+ n%10);
            sum=sum+n%10;
            n=n/10;
        }
        System.out.println(sum);
    }
}
