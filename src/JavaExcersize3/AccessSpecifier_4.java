package JavaExcersize3;

import JavaExcersize2.AccessSpecifier_1;

public class AccessSpecifier_4 extends AccessSpecifier_1{
    public static void main(String[] args) {
        AccessSpecifier_1 obj5 = new AccessSpecifier_1();
        System.out.println(obj5.i);
       // System.out.println(obj5.k);
       // System.out.println(obj5.str1);
       // System.out.println(obj5.str2);
        obj5.m1();
      //  obj5.m2();
       // obj5.m3();
       //obj5.m4();

        AccessSpecifier_4 obj7 = new AccessSpecifier_4();
        System.out.println(obj7.i);
        System.out.println(obj7.k);
       // System.out.println(obj7.str1);
       // System.out.println(obj7.str2);
        obj7.m1();
        obj7.m2();
        //obj7.m3();
       // obj7.m4();

        AccessSpecifier_1 obj8 =  new AccessSpecifier_4();

    }

}
