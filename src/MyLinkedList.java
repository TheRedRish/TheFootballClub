import java.util.*;

public class MyLinkedList {
    Node head;
    Node tail;

    public MyLinkedList() {
        head = null;
        tail = null;
    }

    public MyLinkedList(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }

    public void addMemberPlayer(MemberPlayer memberPlayer) {
        if (head == null) {
            head = new Node(memberPlayer);
            tail = head;
        } else {
            Node newNode = new Node(memberPlayer);
            tail.next = newNode;
            tail = newNode;
        }
    }

    public boolean removeMemberPlayer(MemberPlayer memberPlayer) {
        if (head == null || memberPlayer == null) {
            return false;
        }

        if (head.data == memberPlayer) {
            // If only one item in list, empty the list.
            if (head == tail) {
                head = null;
                tail = null;
            }

            head = head.next;
            return true;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == memberPlayer) {
                // Update tail if it's the last item.
                if (current.next == tail) {
                    tail = current;
                }
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public MemberPlayer findMemberPlayer(MemberPlayer memberPlayer) {
        if (head == null || memberPlayer == null) {
            return null;
        }
        Node current = head;
        while (current != null) {
            if (current.data.equals(memberPlayer)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    public ArrayList<MemberPlayer> findMemberPlayerByLastName(String lastName) {
        ArrayList<MemberPlayer> players = new ArrayList<>();
        Node current = head;
        while (current != null) {
            if (current.data.lastName.toLowerCase().equals(lastName.toLowerCase())) {
                players.add(current.data);
            }
            current = current.next;
        }
        return players;
    }

    public ArrayList<MemberPlayer> findMemberPlayerByTeamDivision(int teamDivision) {
        ArrayList<MemberPlayer> players = new ArrayList<>();
        Node current = head;
        while (current != null) {
            if (current.data.teamDivision == teamDivision) {
                players.add(current.data);
            }
            current = current.next;
        }
        return players;
    }

    public ArrayList<MemberPlayer> findMemberPlayerByAgeInterval(int startAge, int endAge) {
        ArrayList<MemberPlayer> players = new ArrayList<>();
        Node current = head;
        while (current != null) {
            if (current.data.age >= startAge && current.data.age <= endAge) {
                players.add(current.data);
            }
            current = current.next;
        }
        return players;
    }

    public List<MemberPlayer> sort(Comparator<MemberPlayer> chosenComparator) {
        List<MemberPlayer> arrayList = new ArrayList<>();
        Node current = head;
        while (current != null) {
            arrayList.add(current.data);
            current = current.next;
        }
        Collections.sort(arrayList, chosenComparator);
        return arrayList;
    }

    public String toPrintString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.data.toPrintString());
            sb.append("\n");
            current = current.next;
        }
        return sb.toString();
    }
}
