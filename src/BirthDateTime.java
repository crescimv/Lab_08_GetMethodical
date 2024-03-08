import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rangedInt;
        double rangedDouble;

        rangedInt=SafeInput.getRangedInt(in, "Enter an integer");
        System.out.println("Your favorite integer is "+rangedInt);


    }
}
