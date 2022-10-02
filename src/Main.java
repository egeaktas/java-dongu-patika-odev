import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        /* Programın amacı

        Ödev
        Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız. (0 dahildir.)

         */
        Scanner input = new Scanner(System.in);
        System.out.println("sayı gir");

        int sayac = 0, toplam = 0, sonuc, n = input.nextInt();

        for(int i = 0; i<=n; i++){
            if(i%3 == 0 && i%4 == 0){
                toplam = toplam + i;
                sayac++;
            }
        }
        sonuc = toplam/sayac;
        System.out.println(sonuc);
    }
}