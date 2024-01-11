package DataStructure.LinkedList;

public class LinkListRunner {

    public static void main( String[] args ) {

        SingularLinkedList list = new SingularLinkedList();
        list.insert(5);
        list.insert(12);
        list.insert(6);
        list.insert(9);
        list.insertAtFirst(25);
        list.insertAt(2,50);
        list.show();

    }
}
