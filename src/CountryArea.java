import java.text.DecimalFormat;
import java.util.Scanner;
class CountryArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is square area of your destination country in km2? ");

        double kmInMiles = 0.621371;
        int area=input.nextInt();

        DecimalFormat df = new DecimalFormat("###.##");

        System.out.println("In miles2 that is "+ df.format(area*kmInMiles));

    }
}
