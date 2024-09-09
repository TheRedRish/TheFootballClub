public class Node {
    public MemberPlayer data;
    public Node next;
    //public Node prev;

    public Node(MemberPlayer data) {
        this.data = data;
        next = null;
        //prev = null;
    }

    public Node(MemberPlayer data, Node next){
        this.data = data;
        this.next = next;
        //this.prev = prev;
    }
}
