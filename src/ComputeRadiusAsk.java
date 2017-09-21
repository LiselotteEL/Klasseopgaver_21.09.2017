import java.util.Scanner;

public class ComputeRadiusAsk {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Indtast radius: " );

        double radius = input.nextDouble();

        System.out.println("Radius er: " + radius);
    }
}
