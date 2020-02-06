import java.util.Scanner;
class TripPlanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name: ");
        String myString = input.next();
        System.out.print("Nice to meet you " + myString + "," + "where are you traveling to? ");
        Scanner i = new Scanner(System.in);
        String myString2 = i.next();
        System.out.println("Great! " + myString2 + " " + "sounds like a great trip" );
    }
}