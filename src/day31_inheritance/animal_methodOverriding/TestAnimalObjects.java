package day31_inheritance.animal_methodOverriding;

public class TestAnimalObjects {
    public static void main(String[] args) {

        Cat cat = new Cat("pisi","iran",'f',2,"small","white");

        Dog dog = new Dog("Mia","covashan",'f',1,"small","gold");

        Lion lion = new Lion("anil","an",'m',37,"big","black",true);

        Eagle eagle = new Eagle("caz","biz",'f',1,"big","white");

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(lion);
        System.out.println(eagle);

        System.out.println("-----------------------------------------------");

        cat.eat();
        dog.eat();
        lion.eat();
        eagle.eat();

        System.out.println("---------------------------------------------------");

        cat.sleep();
        dog.sleep();
        lion.sleep();
        eagle.sleep();


    }
}
