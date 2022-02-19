package JavaExcersize3;

import java.util.Locale;

public class StringTest {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Selenium";
        System.out.println("Before "+str1);
        str1 = str2.toUpperCase();
        System.out.println("After "+str1);

        String str3 = "Pune";
        String str4 = "Selenium";

        System.out.println("Before "+str2);
        str2=str1.concat(str3);
        System.out.println("After "+str2);
        System.out.println(str2.equals(str4));

        str4=str4.concat(str4);
        System.out.println(str4);

        String newStr1 = new String("Hi");
        String newStr2 = new String("How are you");
        String newStr3 = new String("See you ");

        System.out.println(newStr1.toUpperCase());
        System.out.println(newStr1);
        newStr2 = newStr3.replace("you","ya");
        System.out.println("2-> "+newStr2);
        System.out.println("3-> "+newStr3);

    }
}
