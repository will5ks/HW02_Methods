import java.util.Scanner;

public class Reggie {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String ssn;
        String mNum;
        String zip;

        ssn = SafeInput.getRegExString(in, "Enter your SSN", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your SSN is " + ssn);

        mNum = SafeInput.getRegExString(in, "Enter your UC Student M-number", "(M|m)\\d{5}");
        System.out.println("Your UC Student M-number is " + mNum);

        zip = SafeInput.getRegExString(in, "Enter your Zip + 4 code", "\\d{5}-\\d{4}");
        System.out.println("Your Zip code is " + zip);
    }
}
