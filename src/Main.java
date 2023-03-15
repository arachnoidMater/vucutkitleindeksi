import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kg,boy,ındex;
        Scanner inp=new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz:");
        boy=inp.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz:");
        kg=inp.nextDouble();

        ındex=kg/(boy*boy);

        System.out.println("Vücut kitle indeksiniz:"+ındex);
    }
}