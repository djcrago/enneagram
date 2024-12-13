
import java.io.File;
import java.util.Scanner;

public class UserInterface {

    public void displayFileContents(String filePath) {
        File file = new File(filePath);

        try {
            Scanner myScanner = new Scanner(file);

            System.out.println("\n~ ~ ~ ~\n");

            while (myScanner.hasNextLine()) {
                System.out.println(myScanner.nextLine());
            }

            myScanner.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public boolean pauseUntilReady() {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("\nWhen ready to continue, type \"Y\" and hit enter, otherwise type \"N\".\n");

        boolean userIsReady = false;

        try {
            String input = myScanner.nextLine().toUpperCase();

            while (!input.equals("Y") && !input.equals("N")) {
                input = myScanner.nextLine().toUpperCase();
            }

            if (input.equals("Y")) {
                userIsReady = true;
            }

        } catch (Exception e) {
            System.err.println(e);
        }

        return userIsReady;
    }
}
