import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayi1, sayi2, sayi3;
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz: ");
        sayi1 = input.nextInt();

        System.out.print("İkinci Sayıyı Giriniz: ");
        sayi2 = input.nextInt();

        System.out.print("Üçüncü Sayıyı Giriniz: ");
        sayi3 = input.nextInt();


        if(sayi1 < sayi2 && sayi1 < sayi3){
            if (sayi2 < sayi3){
                System.out.println("sayı-1 < sayı-2 < sayı-3");
                System.out.println(sayi1+ " < " +sayi2+ " < "+ sayi3);
            }else {
                System.out.println("sayı-1 < sayı-3 < sayı-2");
                System.out.println(sayi1+ " < " +sayi3+ " < "+ sayi2);
            }
        } else if (sayi2 < sayi1 && sayi2 < sayi3) {
            if (sayi1 < sayi3){
                System.out.println("sayı-2 > sayı-1 > sayı-3");
                System.out.println(sayi2+ " < " +sayi1+ " < "+ sayi3);
            }else {
                System.out.println("sayı-2 > sayı-3 > sayı-1");
                System.out.println(sayi2+ " < " +sayi3+ " < "+ sayi1);
            }

        } else if (sayi3 < sayi1 && sayi3 < sayi2) {
            if (sayi1 < sayi2){
                System.out.println("sayı-3 < sayı-1 < sayı-2");
                System.out.println(sayi3+ " < " +sayi1+ " < "+ sayi2);
            }else {
                System.out.println("sayı-3 < sayı-2 < sayı-1");
                System.out.println(sayi3+ " < " +sayi2+ " < "+ sayi1);
            }
        }else{
            System.out.println("Tüm sayılar eşit");
        }

    }
}