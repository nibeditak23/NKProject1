package Day2;

public class Methods {

    public static int addNumber(int a,int b){
        System.out.println("Inside the Method");
        int c= a+b;
        return c;
    }

    public static void main(String[] args) {
        System.out.println("Inside Main ...");
        int sum= addNumber(4,6);
        System.out.println("The Sum is----"+sum);
    }
}
