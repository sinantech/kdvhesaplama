import java.util.Scanner;

public class KdvProgramı {
    public static void main(String[] args) {
        //değişkenler
        float kdvsizfiyat;
        //scanner sınıfı tanımla
        Scanner inp = new Scanner(System.in);
        //değeri al
        System.out.print("fiyat giriniz");
        kdvsizfiyat = inp.nextInt();
        float kdvlifiyat;
        kdvlifiyat = (float) (kdvsizfiyat*1.18);
        System.out.println("urunun kdvli fiyati" + " " + kdvlifiyat);
        float kdvdegeri = ((kdvlifiyat-kdvsizfiyat));
        System.out.println("kdv degeri" + " " + kdvdegeri);



    }
}
