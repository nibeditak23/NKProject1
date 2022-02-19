package JavaExcersize3;

public class StringTest2 {
    public static void main(String[] args) {
        String str1 =" Great! where are you? let's meet , tomorrow!";
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println(str1.concat("Sure see you"));
        System.out.println("********************");
        System.out.println(str1.charAt(10));
        System.out.println(str1.contains("you"));
        System.out.println(str1.indexOf('w'));
        System.out.println(str1.length());
        System.out.println("********************");
        System.out.println(str1.trim());
        System.out.println(str1.strip());
        String[] str2 = str1.split(" ");
        for (String s1:str2) {
            System.out.println(s1);

        }
    }
}
