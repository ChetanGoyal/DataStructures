package LinkedListDataStructure;

/**
 * The below class will delete a node from a linkedList by value.
 */
public class DeletingANodeFromLinkedList {

    private Node head;

    private static class Node{
        private Node next;
        private int data;

        Node(int data){
            this.data = data;
        }
    }

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
     * Function will delete the node from the linkedList and will return the head.
     * @param head
     * @param value
     * @return Updated head.
     */

    public Node deleteANode(Node head,int value){
        Node temp = head;
        Node prev = null;

        if(temp.data == value && temp!=null){
            head = temp.next;
            return head;
        }
        else{
            while(temp!=null && temp.data!=value){
                prev = temp;
                temp = temp.next;
            }

            if(temp == null){
                return null;
            }
            prev.next = temp.next;
        }
        return head;
    }

    /**
     * Takes the head as input and print the list.
     * @param head
     */
    public void printLinkedList(Node head){
        Node temp = head;

        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args){
        DeletingANodeFromLinkedList deletingANodeFromLinkedList = new DeletingANodeFromLinkedList();
        Node head = new Node(1);
        deletingANodeFromLinkedList.addToLast(head);
        deletingANodeFromLinkedList.addToLast(new Node(2));
        deletingANodeFromLinkedList.addToLast(new Node(3));
        deletingANodeFromLinkedList.addToLast(new Node(5));
        deletingANodeFromLinkedList.addToLast(new Node(6));
        deletingANodeFromLinkedList.addToLast(new Node(8));

        deletingANodeFromLinkedList.printLinkedList(head);

        Node newHead = deletingANodeFromLinkedList.deleteANode(head,5);

        deletingANodeFromLinkedList.printLinkedList(newHead);

    }
}
