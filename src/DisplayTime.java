//denne kode vil bede bruger om indtastning af antal sekunder. Herefter vil det blive omregnet til antal minutter og antal sekunder
import java.util.Scanner;

public class DisplayTime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Indtast sekunder: ");

        int antalSekunder = input.nextInt();

        int minutterREST = (antalSekunder / 60);
        int sekunderREST = (antalSekunder % 60);

        System.out.println(antalSekunder + " sekunder50" + " = " + minutterREST + " minutter " + " og " + sekunderREST +" sekunder");



    }
}
