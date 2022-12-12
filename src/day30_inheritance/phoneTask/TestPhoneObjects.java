package day30_inheritance.phoneTask;

public class TestPhoneObjects {
    public static void main(String[] args) {

        IPhone iPhone = new IPhone("IPhone 12","large",1000.5,"Black");

        Samsung samsung = new Samsung("note 11","medium",1100,"White");

        Nokia nokia = new Nokia("Brick","Small",50,"Black");


        iPhone.call(911);
        samsung.call(911);
        nokia.call(911);

        iPhone.text(12321312);
        samsung.text(2123213);
        nokia.text(12321);

        System.out.println("----------------------");
        iPhone.faceTime(1221);
        nokia.selfDefense();
        samsung.freeze();

        System.out.println("-------------------------------------------");

        System.out.println(iPhone);
        System.out.println(samsung);
        System.out.println(nokia);



    }
}
