package Day2;

public class ObjectDemo1 {
    int i=10;
    public void m(){
        System.out.println("Inside Method M");
    }

    public static void main(String[] args) {
        int i=30;
        ObjectDemo1 obj1 = new ObjectDemo1();
        System.out.println(obj1.i);
        obj1.i=20;
        System.out.println("After changing the value of i----"+obj1.i);
        ObjectDemo1 obj2 = new ObjectDemo1();
        System.out.println("2nd object---"+obj2.i);
        obj1 = new ObjectDemo1();
        System.out.println("Again----"+obj1.i);
        obj1.m();
        System.out.println(i);

    }
}
