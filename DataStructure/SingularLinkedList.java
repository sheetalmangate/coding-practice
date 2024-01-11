package DataStructure;

public class SingularLinkedList {

    public static class Node {

        int data;
        Node next;

        public Node( int data ) {

            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void insert( int data ) {

        Node newNode = new Node( data );

        if( head == null ) {

            //if list is empty point head and tail to newly created element
            head = newNode;
            tail = newNode;

        } else {

            tail.next = newNode;
            tail = newNode;
        }


    }

    public void printList() {

        Node current = head;

        if ( head == null) {

            System.out.println("link list is empty ");
            return;

        } else {

            System.out.print( "[ ");
            while( current != null ) {

                System.out.print( current.data + "," );
                current = current.next;

            }
            System.out.print( " ] ");

        }

    }

    public static void main( String[] args ) {

        SingularLinkedList objLinkList = new SingularLinkedList();
        objLinkList.insert( 14 );
        objLinkList.insert( 24 );
        objLinkList.insert( 30 );
        objLinkList.insert( 42 );
        objLinkList.printList();

    }


}
