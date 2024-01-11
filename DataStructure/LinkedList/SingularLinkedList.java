package DataStructure.LinkedList;

public class SingularLinkedList {

    Node head;

    public void insert( int data ) {
        Node newNode = new Node(data);

       if( head == null ) {
           //this is the first node
           head = newNode;
       } else {
           Node n = head;
           while( n.next != null ) {
                n = n.next;
           }
           n.next = newNode;
       }
    }


    public void insertAtFirst( int data ) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAt( int index, int data ) {
        Node newNode = new Node(data);
        Node n = head;
        for( int i =0; i<index-2; i++) {

            n = n.next;
        }

        newNode.next = n.next;
        n.next = newNode;

    }



    public void show(){

        Node n = head;
        while ( n.next != null ) {
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }

}
