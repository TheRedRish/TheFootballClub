import java.util.Scanner;

public class UserInputUtil {
    // Method to handle wrong input for integer
    public static int getIntInput(String promptMessage) {
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        boolean validInput = false;

        do {
            try {
                System.out.print(promptMessage);
                userInput = Integer.parseInt(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter an integer.");
            }
        } while (!validInput);

        return userInput;
    }

    public static int getIntInput(String promptMessage, String errorMessage) {
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        boolean validInput = false;

        do {
            try {
                System.out.print(promptMessage);
                userInput = Integer.parseInt(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        } while (!validInput);

        return userInput;
    }

    public static int getIntInput(String promptMessage, String errorMessage, int[] conditions) {
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        boolean validInput = false;

        do {
            try {
                System.out.print(promptMessage);
                userInput = Integer.parseInt(scanner.nextLine());
                validInput = true;
                if (!contains(conditions, userInput)) {
                    System.out.println(errorMessage);
                    validInput = false;
                }
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        } while (!validInput);

        return userInput;
    }

    //get input within range of numbers
    public static int getIntInput(String promptMessage, String errorMessage, int minNum, int maxNum) {
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        boolean validInput = false;

        do {
            try {
                System.out.print(promptMessage);
                userInput = Integer.parseInt(scanner.nextLine());
                validInput = true;
                if (userInput > maxNum && userInput < minNum) {
                    System.out.println(errorMessage);
                    validInput = false;
                }
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        } while (!validInput);

        return userInput;
    }

    public static long getLongInput(String promptMessage) {
        Scanner scanner = new Scanner(System.in);
        long userInput = 0;
        boolean validInput = false;

        do {
            try {
                System.out.print(promptMessage);
                userInput = Long.parseLong(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a long integer.");
            }
        } while (!validInput);

        return userInput;
    }

    public static long getLongInput(String promptMessage, String errorMessage) {
        Scanner scanner = new Scanner(System.in);
        long userInput = 0;
        boolean validInput = false;

        do {
            try {
                System.out.print(promptMessage);
                userInput = Long.parseLong(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        } while (!validInput);

        return userInput;
    }

    public static long getLongInput(String promptMessage, String errorMessage, long[] conditions) {
        Scanner scanner = new Scanner(System.in);
        long userInput = 0;
        boolean validInput = false;

        do {
            try {
                System.out.print(promptMessage);
                userInput = Long.parseLong(scanner.nextLine());
                validInput = true;
                if (!contains(conditions, userInput)) {
                    System.out.println(errorMessage);
                    validInput = false;
                }
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        } while (!validInput);

        return userInput;
    }

    private static boolean contains(int[] arr, int targetValue) {
        for (int num : arr) {
            if (num == targetValue) {
                return true;
            }
        }
        return false;
    }
    private static boolean contains(long[] arr, long value) {
        for (long num : arr) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }

    // Method to handle wrong input for double
    public static double getDoubleInput(String promptMessage) {
        Scanner scanner = new Scanner(System.in);
        double userInput = 0.0;
        boolean validInput = false;

        do {
            try {
                System.out.print(promptMessage);
                userInput = Double.parseDouble(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
            }
        } while (!validInput);

        return userInput;
    }

    public static double getDoubleInput(String promptMessage, String errorMessage) {
        Scanner scanner = new Scanner(System.in);
        double userInput = 0.0;
        boolean validInput = false;

        do {
            try {
                System.out.print(promptMessage);
                userInput = Double.parseDouble(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        } while (!validInput);

        return userInput;
    }

    // Method to handle wrong input for string
    public static String getStringInput(String promptMessage) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        boolean validInput = false;

        do {
            System.out.print(promptMessage);
            userInput = scanner.nextLine();
            if (!userInput.trim().isEmpty()) {
                validInput = true;
            } else {
                System.out.println("Invalid input! Please enter a non-empty string.");
            }
        } while (!validInput);

        return userInput;
    }

    public static String getStringInput(String promptMessage, String errorMessage) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        boolean validInput = false;

        do {
            System.out.print(promptMessage);
            userInput = scanner.nextLine();
            if (!userInput.trim().isEmpty()) {
                validInput = true;
            } else {
                System.out.println(errorMessage);
            }
        } while (!validInput);

        return userInput;
    }

    public static String getStringInput(String promptMessage, String errorMessage, String[] conditions) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        boolean validInput = false;

        do {
            System.out.printf(promptMessage);
            userInput = scanner.nextLine();
            boolean meetsConditions = false;
            for (String condition : conditions) {
                if (condition.equalsIgnoreCase(userInput)) {
                    meetsConditions = true;
                    break;
                }
            }
            if (!userInput.trim().isEmpty() && meetsConditions) {
                validInput = true;
            } else {
                System.out.printf(errorMessage + "\n");
            }
        } while (!validInput);

        return userInput;
    }
}