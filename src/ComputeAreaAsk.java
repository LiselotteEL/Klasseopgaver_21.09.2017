import java.util.Scanner;

public class ComputeAreaAsk {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast radius: ");

          double radius = input.nextDouble();
          double area = radius * radius * 3.1415;



          System.out.println("For en cirkel med radius " + radius + " er arealet: " + area);
    }
}
