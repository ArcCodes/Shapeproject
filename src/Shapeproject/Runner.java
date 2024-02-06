package Shapeproject;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        int secim;
        do {
            System.out.println("\n 1)Kare\n 2)Dikdortgen\n 3)Daire\n 4)Ucgen \n 0)CIKIS");
            System.out.print("Lutfen seciminizi yapın:");
            secim = oku.nextInt();
            oku.nextLine();
            double sonuc;

            switch (secim) {
                case 0:
                    System.out.println("program sonlandırıldı.");
                case 1:
                    System.out.print("Karenın kenar uzunlugunu gırın:");
                    double kenar = oku.nextDouble();
                    Kare kare = new Kare(kenar);
                    sonuc = kare.alanhesapla();
                    System.out.println("Alanı: " + sonuc);
                    sonuc = kare.cevrehesapla();
                    System.out.println("Cevrasi: " + sonuc);

                case 2:
                    System.out.print("Dıkdortgenın uzun kenar uzunlugunu gırın:");
                    double ukenar = oku.nextDouble();
                    System.out.print("Dıkdortgenın kısa kenar uzunlugunu gırın:");
                    double kkenar = oku.nextDouble();

                    Dikdortgen dikdortgen = new Dikdortgen(ukenar, kkenar);
                    sonuc = dikdortgen.alanhesapla();
                    System.out.println("Alanı: " + sonuc);
                    sonuc = dikdortgen.cevrehesapla();
                    System.out.println("Cevrasi: " + sonuc);
                    break;

                case 3:
                    System.out.print("Yarıcap uzunlugunu gırın:");
                    double yaricap = oku.nextDouble();

                    Daire Daire = new Daire(yaricap);
                    sonuc = Daire.alanhesapla();

                    System.out.println("Alanı: " + sonuc);
                    sonuc = Daire.cevrehesapla();
                    System.out.println("Cevrasi: " + sonuc);
                    break;

                case 4:
                    System.out.println("1. kenar uzunlugunu giriniz:");
                    double kenar1 = oku.nextDouble();
                    System.out.println("2. kenar uzunlugunu giriniz:");
                    double kenar2 = oku.nextDouble();
                    System.out.println("3. kenar uzunlugunu giriniz:");
                    double kenar3 = oku.nextDouble();
                    Ucgen ucgen = new Ucgen(kenar1, kenar2, kenar3);
                    sonuc = ucgen.alanhesapla();
                    System.out.println("Ucgenın alanı:" + sonuc);
                    sonuc = ucgen.cevrehesapla();
                    System.out.println("ucgenın cevresı:" + sonuc);
                    break;

                default:
                    System.out.println("Gecersız Secım");

            }

        } while (secim != 0);

        // TODO Bu class doldurunuz

    }
}
