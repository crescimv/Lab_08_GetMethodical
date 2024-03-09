import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int birthYear=0;
        int birthMonth=0;
        int birthDay=0;
        int birthHour=0;
        int birthMinute=0;

        birthYear=SafeInput.getRangedInt(in, "Enter your birth year [1950-2015] ", 1950, 2015);
        birthMonth=SafeInput.getRangedInt(in, "Enter your birth month [1-12] ", 1, 12);

        switch (birthMonth) {
            case 1,3,5,7,8,10,12:
                birthDay=SafeInput.getRangedInt(in, "Enter your birth day [1-31] ", 1, 31);
                break;
            case 4,6,9,11:
                birthDay=SafeInput.getRangedInt(in, "Enter your birth day [1-31] ", 1, 30);
                break;
            case 2:
                birthDay=SafeInput.getRangedInt(in, "Enter your birth day [1-28] ", 1, 28);
                break;
        }
        birthHour=SafeInput.getRangedInt(in, "Enter your birth hour [1-24] ", 1, 24);
        birthMinute=SafeInput.getRangedInt(in, "Enter your birth minute [1-60] ", 1, 60);

        System.out.println("Your birth occurred on "+birthMonth+"/"+birthDay+"/"+birthYear+" at "+birthHour+":"+birthMinute);


    }
}
