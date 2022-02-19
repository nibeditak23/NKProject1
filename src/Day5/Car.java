package Day5;

public class Car {

    int i=0;
    String str;
    double d;

    public void eat(String name){
        System.out.println(name+" eating");
    }
    public void sleep(String animal){
        System.out.println(animal+ " sleeping");

    }
    static {
        System.out.println("Inside static block");
    }
    {
        int j=0;
        System.out.println("inside non-static block"+j++);
    }

    public static void main(String[] args) {
        System.out.println("Main starts....");
        Car maruti = new Car();
        maruti.str= "WagonR";
        maruti.eat(maruti.str);
        maruti.sleep(maruti.str);
        System.out.println(maruti.d+" Maruti "+ maruti.i);
        Car tata = new Car();
        tata.eat("Indigo");

    }
}
