package Day5;

public class ConstructorTest {
    int num=10;
    String str = "ctc";
    int j= 30;

    public ConstructorTest(){
        System.out.println("Inside default constructor");
    }
    public ConstructorTest(int k, String name){
        num=k;
        System.out.println("Inside argument Constructor  "+k);
    }

    public static void main(String[] args) {
        ConstructorTest con1 = new ConstructorTest(40,"welcome");
        System.out.println("int-- "+con1.num+"  String---- "+con1.str+"  Int J  "+con1.j);
    }
}
