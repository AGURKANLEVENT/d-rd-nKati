import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int toplam = 0;

        Scanner yeni = new Scanner(System.in);

        do {
            System.out.println("Sayı Giriniz :");
            n = yeni.nextInt();
            if ((n % 2 == 0) && (n % 4 == 0)) {

                toplam += n;
            }
        }while (n % 2 == 1);
        System.out.println("Toplam : "+ toplam );
        }
    }

