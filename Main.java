
public class Main {

    public static void main(String[] args) {
        UserInterface terminal = new UserInterface();

        System.out.println("\n~ ~ ~ ~");
        System.out.println("\nWelcome! An Enneagram test is special type of personality test. There are nine different basic personality types, each with their own unique strengths, common struggles, and characteristics.");

        if (terminal.pauseUntilReady()) {
            EnneagramTest myEnneagramTest = new EnneagramTest();

            int result = myEnneagramTest.takeTest();

            if (result != 0) {
                System.out.println("\n~ ~ ~ ~");
                System.out.println("\nYour potential type and a brief description are found below.");

                String typeDescriptionFilePath = "./TypeDescriptions/" + result + ".txt";
                terminal.displayFileContents(typeDescriptionFilePath);

                System.out.println("\n~ ~ ~ ~");
                System.out.println("\nIf you are interested in learning more I encourage you to read The Wisdom of the Enneagram by Don Richard Riso and Russ Hudson. Thank you!\n");

            } else {
                System.out.println("\nThank you!\n");
            }

        } else {
            System.out.println("\nThank you!\n");
        }

    }
}
