
import java.util.Scanner;

public class EnneagramTest {

    public int takeTest() {
        UserInterface terminal = new UserInterface();

        terminal.displayFileContents("./TestFiles/TestInstructions.txt");

        int result = 0;

        if (terminal.pauseUntilReady()) {
            terminal.displayFileContents("./TestFiles/groupOne.txt");
            String[] groupOneOptions = {"A", "B", "C"};
            String choiceOne = chooseGroupOption(groupOneOptions);

            terminal.displayFileContents("./TestFiles/groupTwo.txt");
            String[] groupTwoOptions = {"X", "Y", "Z"};
            String choiceTwo = chooseGroupOption(groupTwoOptions);

            String choices = choiceOne.concat(choiceTwo);

            result = determineType(choices);
            return result;
        }

        return result;
    }

    public String chooseGroupOption(String[] options) {
        Scanner myScanner = new Scanner(System.in);

        String input = "";

        try {
            boolean validInput = false;

            while (!validInput) {
                System.out.println("\nPlease type in one of the options.\n");

                input = myScanner.nextLine().toUpperCase();

                for (String option : options) {
                    if (option.equals(input)) {
                        validInput = true;
                    }
                }
            }

            input = input.toUpperCase();
        } catch (Exception e) {
            System.err.println(e);
        }

        return input;
    }

    private int determineType(String choices) {
        int type = 0;

        if (choices.equals("AX")) {
            type = 7;
        } else if (choices.equals("AY")) {
            type = 8;
        } else if (choices.equals("AZ")) {
            type = 3;
        } else if (choices.equals("BX")) {
            type = 9;
        } else if (choices.equals("BY")) {
            type = 4;
        } else if (choices.equals("BZ")) {
            type = 5;
        } else if (choices.equals("CX")) {
            type = 2;
        } else if (choices.equals("CY")) {
            type = 6;
        } else if (choices.equals("CZ")) {
            type = 1;
        }

        return type;
    }

}
