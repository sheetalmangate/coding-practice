package DataStructure;

public class SingularLinkListNew {

    public static class Node {

        int data;
        Node link;

        public Node( int data ) {

            this.data = data;
            this.link = null;
        }
    }

    Node head = null;
    Node tail = null;


    public void insert( int data ) {

        Node newNode = new Node( data );

        if( head == null ) {
            head = newNode;
            tail = newNode;
        } else {
            tail.link = newNode;
            tail = newNode;
        }
    }

    public static void main( String[] args ) {

        SingularLinkListNew obj = new SingularLinkListNew();
        obj.insert(10);

    }
}
