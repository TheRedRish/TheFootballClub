import java.util.ArrayList;

public class UserInterface {
    public static void run(MyLinkedList myLinkedList) {

        while (true) {
            System.out.println("1. Add player");
            System.out.println("2. Remove player");
            System.out.println("3. List players");
            System.out.println("4. Search players");
            //System.out.println("5. Edit player");
            System.out.println("6. Exit");
            int choice = UserInputUtil.getIntInput("Enter your choice: ", "Invalid choice!", 1, 6);

            switch (choice) {
                case 1:
                    addPlayer(myLinkedList);
                    break;
                case 2:
                    removePlayer(myLinkedList);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void addPlayer(MyLinkedList myLinkedList) {

        String firstName = UserInputUtil.getStringInput("Enter player first name: ");
        String lastName = UserInputUtil.getStringInput("Enter player last name: ");
        int age = UserInputUtil.getIntInput("Enter player age: ", "Invalid age!");
        int teamDivision = UserInputUtil.getIntInput("Enter player teamDivision: 1 or 2: ", "Invalid teamDivision!", 1, 2);
        MemberPlayer memberPlayer = new MemberPlayer(firstName, lastName, age, teamDivision);
        myLinkedList.addMemberPlayer(memberPlayer);
    }

    public static void removePlayer(MyLinkedList myLinkedList) {
        System.out.println("Search a player by last name to delete");
        MemberPlayer playerToDelete = searchByLastName(myLinkedList);

        if (myLinkedList.removeMemberPlayer(playerToDelete)) {
            System.out.println("Player deleted successfully");
        } else {
            System.out.println("Something went wrong, player not deleted");
        }
    }

    public static void listPlayers(MyLinkedList myLinkedList) {

    }

    public static void searchPlayers(MyLinkedList myLinkedList) {
        System.out.println("1. By last name");
        System.out.println("2. By team division");
        System.out.println("3. By age interval");
        int choice = UserInputUtil.getIntInput("Enter your choice: ", "Invalid choice!", 1, 3);

        switch (choice) {
            case 1:
                MemberPlayer searchByLastName = searchByLastName(myLinkedList);
                System.out.println(searchByLastName == null ? "No players found" : searchByLastName);
                break;
            case 2:
                MemberPlayer searchByByDivision = searchByByDivision(myLinkedList);
                System.out.println(searchByByDivision == null ? "No players found" : searchByByDivision);
                break;
            case 3:
                MemberPlayer searchByByAgeInterval = searchByByAgeInterval(myLinkedList);
                System.out.println(searchByByAgeInterval == null ? "No players found" : searchByByAgeInterval);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    public static MemberPlayer searchByLastName(MyLinkedList myLinkedList) {
        String lastName = UserInputUtil.getStringInput("Enter player last name: ");

        ArrayList<MemberPlayer> playersFromSearch = myLinkedList.findMemberPlayerByLastName(lastName);
        if (playersFromSearch.size() == 0) {
            System.out.println("No players found with last name: " + lastName);
            return null;
        }

        for (int i = 1; i <= playersFromSearch.size(); i++) {
            MemberPlayer player = playersFromSearch.get(i - 1);
            System.out.println(i + ".\n" + player);
        }

        int playerChoice = UserInputUtil.getIntInput("Enter player number to choose: ", "Invalid choice!", 1, playersFromSearch.size());
        MemberPlayer playerToDelete = playersFromSearch.get(playerChoice - 1);

        return playerToDelete;
    }

    public static MemberPlayer searchByByDivision(MyLinkedList myLinkedList) {
        int division = UserInputUtil.getIntInput("Enter player division: ");

        ArrayList<MemberPlayer> playersFromSearch = myLinkedList.findMemberPlayerByTeamDivision(division);
        for (int i = 1; i <= playersFromSearch.size(); i++) {
            MemberPlayer player = playersFromSearch.get(i - 1);
            System.out.println(i + ".\n" + player);
        }

        int playerChoice = UserInputUtil.getIntInput("Enter player number to choose: ", "Invalid choice!", 1, playersFromSearch.size());
        MemberPlayer playerToDelete = playersFromSearch.get(playerChoice - 1);

        return playerToDelete;
    }

    public static MemberPlayer searchByByAgeInterval(MyLinkedList myLinkedList) {
        int startAge = UserInputUtil.getIntInput("Enter player start age: ");
        int endAge = UserInputUtil.getIntInput("Enter player end age: ");

        ArrayList<MemberPlayer> playersFromSearch = myLinkedList.findMemberPlayerByAgeInterval(startAge, endAge);
        for (int i = 1; i <= playersFromSearch.size(); i++) {
            MemberPlayer player = playersFromSearch.get(i - 1);
            System.out.println(i + ".\n" + player);
        }

        int playerChoice = UserInputUtil.getIntInput("Enter player number to choose: ", "Invalid choice!", 1, playersFromSearch.size());
        MemberPlayer playerToDelete = playersFromSearch.get(playerChoice - 1);

        return playerToDelete;
    }
}
