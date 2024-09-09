import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class MyLinkedListRepo {
    public static void loadAllMemberPlayers(MyLinkedList myLinkedList) {
        try {
            Scanner scan = new Scanner(new File("src\\memberList.txt"));
            while (scan.hasNextLine()) {
                String[] parts = scan.nextLine().split(":");
                if (parts.length != 4) continue;
                MemberPlayer memberPlayer = new MemberPlayer(parts[0], parts[1], Integer.parseInt(parts[2]), Integer.parseInt(parts[3]));
                myLinkedList.addMemberPlayer(memberPlayer);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void saveAllMemberPlayers(MyLinkedList myLinkedList) {
        PrintStream ps = null;
        try {
            ps = new PrintStream("src\\memberList.txt");
            ps.println(myLinkedList.toPrintString());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
