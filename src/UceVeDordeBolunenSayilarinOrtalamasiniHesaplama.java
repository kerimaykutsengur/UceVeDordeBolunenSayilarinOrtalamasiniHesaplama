import java.util.Scanner;

public class UceVeDordeBolunenSayilarinOrtalamasiniHesaplama {
    public static void main(String[] args) {
        int sayi, i = 0, toplam = 0, sayac = 0;
        double ort;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı Giriniz: ");
        sayi = input.nextInt();
        while (i <= sayi) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                sayac++;
            }
            i++;
        }
        ort = toplam / sayac;
        System.out.println("3'e ve 4'e bölünenlerin ortalaması: " + ort);


    }


}

