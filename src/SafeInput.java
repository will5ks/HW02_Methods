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
            System.out.print("\n" +prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        } while (retString.length() == 0);
        return retString;
    }

    public static int getInt(Scanner pipe, String prompt) {
        int retInt = 0;
        boolean validInt = false;
        String trash;
        do {
            System.out.print("\n" +prompt + ": ");
            if (pipe.hasNextInt()) {
                retInt = pipe.nextInt();
                validInt = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("\nInvalid input: " + trash);
            }
        } while (!validInt);
        pipe.nextLine();
        return retInt;
    }

    public static double getDouble(Scanner pipe, String prompt) {
        double retDouble = 0;
        boolean validDouble = false;
        String trash;
        do {
            System.out.print("\n" +prompt + ": ");
            if (pipe.hasNextDouble()) {
                retDouble = pipe.nextDouble();
                validDouble = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("\nInvalid input: " + trash);
            }
        } while (!validDouble);
        pipe.nextLine();
        return retDouble;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retRanInt = 0;
        boolean validRanInt = false;
        String trash;
        do {
            System.out.print("\n" +prompt + " (" + low + " to " + high + "): ");
            if (pipe.hasNextInt()) {
                retRanInt = pipe.nextInt();
                if (retRanInt >= low && retRanInt <= high) {
                    validRanInt = true;
                } else {
                    trash = pipe.nextLine();
                    System.out.println("\nInvalid input: " + retRanInt);
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("\nInvalid input: " + trash);
            }
        } while (!validRanInt);
        pipe.nextLine();
        return retRanInt;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double retRanDouble = 0;
        boolean validRanDouble = false;
        String trash;
        do {
            System.out.print("\n" +prompt + " (" + low + " to " + high + "): ");
            if (pipe.hasNextDouble()) {
                retRanDouble = pipe.nextDouble();
               if (retRanDouble >= low && retRanDouble <= high) {
                   validRanDouble = true;
               } else  {
                   System.out.println("\nInvalid input: " + retRanDouble);
               }
            } else {
                trash = pipe.nextLine();
                System.out.println("\nInvalid input: " + trash);
            }
        } while (!validRanDouble);
        pipe.nextLine();
        return retRanDouble;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        boolean retYN = false;
        String input;
        boolean validInput = false;
        do {
            System.out.print("\n" +prompt + ": ");
            input = pipe.next();
            if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
                retYN = true;
                validInput = true;
            } else if (input.equalsIgnoreCase("n") || input.equalsIgnoreCase("no")) {
                validInput = true;
            } else {
                System.out.println("\nInvalid input: " + input);
            }
        } while (!validInput);
        pipe.nextLine();
        return retYN;
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String retRegEx;
        boolean validRegEx = false;
        do {
            System.out.print("\n" + prompt + ": ");
            retRegEx = pipe.nextLine();
            if (retRegEx.matches(regEx)) {
                validRegEx = true;
            }
            else {
                System.out.println("\nInvalid input: " + retRegEx);
            }
        } while(!validRegEx);
        //pipe.nextLine();
        return retRegEx;
    }

}
