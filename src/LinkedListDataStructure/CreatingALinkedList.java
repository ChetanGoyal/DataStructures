package LinkedListDataStructure;

/**
 * This class with create a Linked List by adding new Node to the end of the list.
 */

public class CreatingALinkedList {

    private Node head;

    private static class Node{
        private Node next;   //Pointer to next node.
        private int value;

        Node(int value){
            this.value = value;
        }
        }

    /**
     * Will add the node to the end of the list.
     * @param node
     */
    public void addToLast(Node node){
        if(head == null){
            head = node;
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    /**
     * Takes the head as input and print the list.
     * @param head
     */
        public void printLinkedList(Node head){
            Node temp = head;

            while(temp!=null){
                System.out.println(temp.value);
                temp = temp.next;
            }
        }


    /**
     * Main function to create a linked list.
     * @param args
     */
    public static void main(String[] args){
        CreatingALinkedList creatingALinkedList = new CreatingALinkedList();
        Node head = new Node(1);
        creatingALinkedList.addToLast(head);
        creatingALinkedList.addToLast(new Node(2));
        creatingALinkedList.addToLast(new Node(4));
        creatingALinkedList.addToLast(new Node(5));

        creatingALinkedList.printLinkedList(head);

    }
}
