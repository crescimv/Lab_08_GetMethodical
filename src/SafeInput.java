import java.util.Scanner;

public class SafeInput {
    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";  // Set this to zero length. Loop runs until it isn’t
        do {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        } while(retString.length() == 0);

        return retString;

    }
    public static int getInt(Scanner pipe, String prompt) {

        int retInt=0;
        System.out.println("\n"+prompt+": ");
        while (!pipe.hasNextInt()) { //checks for non integer
            System.out.println("Invalid, please enter an integer");
            pipe.next();//discards non integer
        }
        return pipe.nextInt();
    }

    public static double getDouble(Scanner pipe, String prompt) {
        double retDouble=0;
        System.out.println("\n"+prompt+": ");
        while (!pipe.hasNextDouble()) { //checks for non double
            System.out.println("Invalid, please enter a double");
            pipe.next();//discards non double
        }
        return pipe.nextDouble();
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retInt=0;
        boolean done;

        System.out.println("\n"+prompt+": ");
        while (!pipe.hasNextInt()) { //checks for non integer
            System.out.println("Invalid, please enter a valid integer");
            pipe.next(); //discard input
        }
        while (pipe.hasNextInt()) {
            if (retInt>=low && retInt<=high) {
                done=true; //loop ends, returns input
            } else {
                System.out.println("Invalid, please enter a valid integer in range");
                pipe.next(); //discard input
            }
        }
        return pipe.nextInt();
    }
}


