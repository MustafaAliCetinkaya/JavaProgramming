package constructor;

public class Main {
    public static void main(String[] args) {//new Car(); ifadesi constructor dır. Metotlara benzer.
        Car mercedes = new Car();//Önce gizli dosyanın içindeki bastırılır sonra aşağıdakiler yazdırılır.
        System.out.println(mercedes.trademark);
        System.out.println(mercedes.color);
        System.out.println(mercedes.typeOfGear);
        System.out.println(mercedes.year);


    }
}
