package JavaExcersize1;

public class DivisibleFive {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++)
            if(i%5==0)
                System.out.println(i+"----Divisible by 5");
        else
                System.out.println(i);
    }
}
