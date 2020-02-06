import java.text.DecimalFormat;
import java.util.Scanner;
class TravelTimeAndBudget {
    public static void main(String[] args) {

        Scanner i = new Scanner(System.in);
        System.out.print("How many days are you going to spend in your destination? ");
        int days = i.nextInt();

        Scanner l = new Scanner(System.in);
        System.out.print("What is your total budget for the trip in USD? ");
        int budget = l.nextInt();

        Scanner k = new Scanner(System.in);
        System.out.print("What is the currency symbol for your destination? ");
        String myCurrency = k.next();

        Scanner money = new Scanner(System.in);
        System.out.print("How many "+ myCurrency + " are there in 1 USD? ");
        float currency = money.nextFloat();

        int hours = 24;
        int minutes = 60;
        int seconds = 60;

        int totalHours = days*hours;
        int totalMinutes = totalHours*minutes;
        int totalSeconds = totalMinutes*seconds;

        System.out.println("If you are traveling for "+ days + " days that is same as "+totalHours+" hours or "+totalMinutes+" minus or "+totalSeconds+" seconds.");
        System.out.print("If you are going to spend "+budget+" USD that means per day you can spend up to ");
        DecimalFormat df = new DecimalFormat("###.##");

        System.out.println(df.format(budget/days)+" USD");
        System.out.print("Your total budget in "+myCurrency+ " is "+df.format(budget*currency)+ " which per day is ");
        System.out.print(df.format(((budget*currency)/days))+" "+myCurrency);

    }
}