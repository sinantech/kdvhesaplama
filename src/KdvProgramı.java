import java.util.Scanner;

public class KdvProgramı {
    public static void main(String[] args) {
        //değişkenler
        float kdvsizfiyat;
        //scanner sınıfı tanımla
        Scanner inp = new Scanner(System.in);
        //değeri al
        System.out.print("fiyat giriniz");
        kdvsizfiyat = inp.nextFloat();
        if (kdvsizfiyat < 1000) {


            float kdvlifiyat;
            kdvlifiyat = (float) (kdvsizfiyat * 1.18);
            System.out.println("urunun kdvli fiyati" + " " + kdvlifiyat);
            float kdvdegeri = ((kdvlifiyat - kdvsizfiyat));
            System.out.println("kdv degeri" + " " + kdvdegeri);
        }
        else {
            float kdvlifiyat;
            kdvlifiyat = (float) (kdvsizfiyat * 1.08);
            System.out.println("urunun kdvli fiyati" + " " + kdvlifiyat);
            float kdvdegeri = ((kdvlifiyat - kdvsizfiyat));
            System.out.println("kdv degeri" + " " + kdvdegeri);

        }
    }
}
