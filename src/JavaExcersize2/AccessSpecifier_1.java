package JavaExcersize2;

public class AccessSpecifier_1 {
    public int i =10;
    protected int k = 30;
    String str1 ="Java";
    private String str2 ="Selenium";

    public void m1(){
        System.out.println("Inside Public method m1");
    }
    protected void m2(){
        System.out.println("Inside protected method m2");
    }
    void m3(){
        System.out.println("Inside default method m3");
    }
    private void m4(){
        System.out.println("Inside private method m4");
    }


}
