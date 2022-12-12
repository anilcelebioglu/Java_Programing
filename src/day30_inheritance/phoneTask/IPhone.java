package day30_inheritance.phoneTask;

public class IPhone extends Phone { // IPhone is a phone


    public static boolean hasApplePay = true;


    public IPhone( String model, String size, double price, String color) {
        super("Apple", model, size, price, color);
    }


    public void faceTime(long phoneNumber){
        System.out.println( getModel() +" is face timing with " +phoneNumber );
    }

    public void faceTime(String email){
        System.out.println( getModel() +" is face timing with " +email );
    }


}

/*
2.1 Iphone:
					Extra methods:
						faceTime(phoneNumber)
						faceTile(email)
 */