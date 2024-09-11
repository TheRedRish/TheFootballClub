import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        MyLinkedListRepo.loadAllMemberPlayers(myLinkedList);
        UserInterface.run(myLinkedList);
        MyLinkedListRepo.saveAllMemberPlayers(myLinkedList);
    }
}