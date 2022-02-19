package JavaExcersize2;

public class AccessSpecifier_2 extends AccessSpecifier_1{
    public static void main(String[] args) {
        AccessSpecifier_1 obj1 = new AccessSpecifier_1();
        System.out.println(obj1.i);
        System.out.println(obj1.k);
        System.out.println(obj1.str1);
        //System.out.println(obj1.str2);
        obj1.m1();
        obj1.m2();
        obj1.m3();
       // obj1.m4();

        AccessSpecifier_2 obj2 = new AccessSpecifier_2();
        System.out.println(obj2.i);
        System.out.println(obj2.k);
        System.out.println(obj2.str1);
       // System.out.println(obj2.str2);
        obj2.m1();
        obj2.m2();
        obj2.m3();
        //obj2.m4();

        AccessSpecifier_1 obj3 = new AccessSpecifier_2();




    }
}
