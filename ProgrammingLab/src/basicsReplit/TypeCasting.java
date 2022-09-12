package basicsReplit;

public class TypeCasting {
    public static void main(String[] args) {
        //İlkel veri tiplerinden sayılarla ilgili olanlar arasında tip değişimi yapabiliriz.
        //İkisi de sayı ise sayılararası tip değişimi bu yöntemle ama Satringi int e dönüştürmek Wrapper Class ile yapılır.
        byte number1=12;
        int number2=99;

        number1= (byte) number2;
        System.err.println(number1);

        double number3=65.9;
        long number4=12;

        number3= (double) number4;//long türünü double ye çevirdik
        System.err.println("\n"+number3);

    }
}
