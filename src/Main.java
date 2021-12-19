
import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    static String[] rowOne = {"_", "_", "_"};
    static String[] rowTwo = {"_", "_", "_"};
    static String[] rowThree = {"_", "_", "_"};

    static boolean gameRunning = true;

    public static void main(String[] args) {

        while (gameRunning) {

            // method for player input
            playerInput();

            // method for Computer turn
            ComputerTurn();

            // check for winner of game
            CheckForWinnerIsPlayer();
            CheckForWinnerIsComputer();

        } // end of while loop

    } // end of main method

    public static void playerInput() {
        System.out.println("its your turn select a position");

        String userChoiceOfPosition = scanner.nextLine();

        switch (userChoiceOfPosition) {
            case "1" -> {
                rowOne[0] = "x";
                //  printGrid();
            }
            case "2" -> {
                rowOne[1] = "x";
                //  printGrid();
            }
            case "3" -> {
                rowOne[2] = "x";
                //  printGrid();
            }
            case "4" -> {
                rowTwo[0] = "x";

            }
            case "5" -> {
                rowTwo[1] = "x";

            }
            case "6" -> {
                rowTwo[2] = "x";

            }
            case "7" -> {
                rowThree[0] = "x";

            }
            case "8" -> {
                rowThree[1] = "x";

            }
            case "9" -> {
                rowThree[2] = "x";

            }
        } // end of switch case

    } // end of playerInput

    public static void printGrid() {

        System.out.println((rowOne[0] + "|" + rowOne[1] + "|" + rowOne[2]));
        System.out.println((rowTwo[0] + "+" + rowTwo[1] + "+" + rowTwo[2]));
        System.out.println((rowThree[0] + "|" + rowThree[1] + "|" + rowThree[2]));

    } // end of printGrid

    public static void CheckForWinnerIsPlayer() {

        // horizontal check for player winner
        if (rowOne[0].equals("x") && rowOne[1].equals("x") && rowOne[2].equals("x")) {

            System.out.println("Player has won!!!");
            System.out.println("Game over!!!");
            gameRunning = false;

        } else if (rowTwo[0].equals("x") && rowTwo[1].equals("x") && rowTwo[2].equals("x")) {

            System.out.println("Player has won!!!");
            System.out.println("Game over!!!");
            gameRunning = false;

        } else if (rowThree[0].equals("x") && rowThree[1].equals("x") && rowThree[2].equals("x")) {

            System.out.println("Player has won!!!");
            System.out.println("Game over!!!");
            gameRunning = false;

        } // end of if statement horizontal check

        // vertical check for player winner
        if (rowOne[0].equals("x") && rowTwo[0].equals("x") && rowThree[0].equals("x")) {

            System.out.println("Player has won!!!");
            System.out.println("Game over!!!");
            gameRunning = false;

        } else if (rowOne[1].equals("x") && rowTwo[1].equals("x") && rowThree[1].equals("x")) {

            System.out.println("Player has won!!!");
            System.out.println("Game over!!!");
            gameRunning = false;

        } else if (rowOne[2].equals("x") && rowTwo[2].equals("x") && rowThree[2].equals("x")) {

            System.out.println("Player has won!!!");
            System.out.println("Game over!!!");
            gameRunning = false;

        } // end of if statement vertical check

        // diagonal check for player winner
        if (rowOne[0].equals("x") && rowTwo[1].equals("x") && rowThree[2].equals("x")) {

            System.out.println("Player has won!!!");
            System.out.println("Game over!!!");
            gameRunning = false;

        } else if (rowOne[2].equals("x") && rowTwo[1].equals("x") && rowThree[0].equals("x")) {

            System.out.println("Player has won!!!");
            System.out.println("Game over!!!");
            gameRunning = false;

        } // end of if statement diagonal check

    }  // end of CheckForWinnerIsPlayer method

    public static void CheckForWinnerIsComputer() {

        // horizontal check for player winner
        if (rowOne[0].equals("O") && rowOne[1].equals("O") && rowOne[2].equals("O")) {

            System.out.println("Computer has won!!!");
            System.out.println("Game over!!!");
            gameRunning = false;

        } else if (rowTwo[0].equals("O") && rowTwo[1].equals("O") && rowTwo[2].equals("O")) {

            System.out.println("Computer has won!!!");
            System.out.println("Game over!!!");
            gameRunning = false;

        } else if (rowThree[0].equals("O") && rowThree[1].equals("O") && rowThree[2].equals("O")) {

            System.out.println("Computer has won!!!");
            System.out.println("Game over!!!");
            gameRunning = false;

        } // end of if statement horizontal check

        // vertical check for player winner
        if (rowOne[0].equals("O") && rowTwo[0].equals("O") && rowThree[0].equals("O")) {

            System.out.println("Computer has won!!!");
            System.out.println("Game over!!!");
            gameRunning = false;

        } else if (rowOne[1].equals("O") && rowTwo[1].equals("O") && rowThree[1].equals("O")) {

            System.out.println("Computer has won!!!");
            System.out.println("Game over!!!");
            gameRunning = false;

        } else if (rowOne[2].equals("O") && rowTwo[2].equals("O") && rowThree[2].equals("O")) {

            System.out.println("Computer has won!!!");
            System.out.println("Game over!!!");
            gameRunning = false;

        } // end of if statement vertical check

        // diagonal check for player winner
        if (rowOne[0].equals("O") && rowTwo[1].equals("O") && rowThree[2].equals("O")) {

            System.out.println("Computer has won!!!");
            System.out.println("Game over!!!");
            gameRunning = false;

        } else if (rowOne[2].equals("O") && rowTwo[1].equals("O") && rowThree[0].equals("O")) {

            System.out.println("Computer has won!!!");
            System.out.println("Game over!!!");
            gameRunning = false;

        } // end of if statement diagonal check

    } // end of checkForWinnerIsComputer method

    public static void ComputerTurn() {

        Random random = new Random();
        int input = random.nextInt(9) + 1;

        if (input == 1) {
            rowOne[0] = "O";
            printGrid();
            System.out.println("The Computer made it move!");
        }
        if (input == 2) {
            rowOne[1] = "O";
            printGrid();
            System.out.println("The Computer made it move!");
        }
        if (input == 3) {
            rowOne[2] = "O";
            printGrid();
            System.out.println("The Computer made it move!");
        }
        if (input == 4) {
            rowTwo[0] = "O";
            printGrid();
            System.out.println("The Computer made it move!");
        }
        if (input == 5) {
            rowTwo[1] = "O";
            printGrid();
            System.out.println("The Computer made it move!");
        }
        if (input == 6) {
            rowTwo[2] = "O";
            printGrid();
            System.out.println("The Computer made it move!");
        }
        if (input == 7) {
            rowThree[0] = "O";
            printGrid();
            System.out.println("The Computer made it move!");
        }
        if (input == 8) {
            rowThree[1] = "O";
            printGrid();
            System.out.println("The Computer made it move!");
        }
        if (input == 9) {
            rowThree[2] = "O";
            printGrid();
            System.out.println("The Computer made it move!");
        }
    } // end of ComputerTurn

} // end of public main class

