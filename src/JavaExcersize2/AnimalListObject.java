package JavaExcersize2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AnimalListObject {
    public static void main(String[] args) {
        List<Animal> listAnimal = new ArrayList<>();
        //listAnimal.add("Lion");
       // listAnimal.add("Tiger");
        Dog bulldog = new Dog();
        Cat persian = new Cat();
        listAnimal.add(bulldog);
        listAnimal.add(persian);

        bulldog.eat("Dog","Bone");
        persian.run("Cat","Slow");
        bulldog.size("bulldog","Big");

       // listAnimal.get(0).

        System.out.println(listAnimal);
        Iterator<Animal> itr=listAnimal.iterator();
       Object a1=itr.next();



       //Animal a2 = itr.next();

        for (Object o:listAnimal)
            System.out.println(o);


    }
}
