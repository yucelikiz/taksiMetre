import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double perKm= 2.20, total;
        int km;

        Scanner sc = new Scanner(System.in);

        System.out.print("mesafeyi KM cinsinden giriniz : ");
        km = sc.nextInt();

        total =(perKm*km);
        total += 10;
        total = (total<20) ? 20 : total;

        System.out.print("Toplam ücret: "+total);


    }
}