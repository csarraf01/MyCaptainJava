import java.util.Scanner;
class Convert {

    public static void main(String[] args) {


        long n = 60 * 24 * 365;

        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");

        long min = input.nextLong();

        long years =  (min / n);
        int days = (int) (min / 60 / 24) % 365;

        System.out.println(min + " minutes is approximately " + years + " years and " + days + " days");
    }
}
