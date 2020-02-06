import java.util.Scanner;
class TimeDifference {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        int hourDifference = input.nextInt();

        if (hourDifference > 0) {
            int midnightHome = 0;
            int midnightDestination = midnightHome + hourDifference;
            int noon = 12;
            int noonDestination = noon + hourDifference;
            System.out.print("That means that when it is midnight at home it will be " + midnightDestination + ":00 in your travel destination and when it's noon at home it will be " + noonDestination+":00");
        }
        else{
            int midnightHome = 24;
            int midnightDestination = midnightHome + hourDifference;
            int noon = 12;
            int noonDestination = noon + hourDifference;
            System.out.print("That means that when it is midnight at home it will be " + midnightDestination + ":00 in your travel destination and when it's noon at home it will be " + noonDestination+":00");
        }
    }
}