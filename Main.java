import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int km,start=10;
        double tsm=2.20,odenecekTutar;
        Scanner input=new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz: ");
        km=input.nextInt();

        odenecekTutar=km*tsm;
        odenecekTutar+=start;

        odenecekTutar= (odenecekTutar<20)? 20: odenecekTutar;  //20 den küçükse yine 20 yaz
        System.out.println("Ödenecek tutar: "+odenecekTutar);

    }
}