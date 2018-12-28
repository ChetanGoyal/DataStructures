package LinkedListDataStructure;

import java.util.HashSet;

public class RemoveDuplicates {

    private Node head;

    private static class Node{
        private Node next;
        private int value;

        Node(int value){
            this.value = value;
        }
    }

    public void addToList(Node node){
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

    public void printList(Node head){
        Node temp = head;

        while(temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }

        System.out.println("");
    }

    /**
     * In this scenario, a HashSet is being used to remove the duplicates from a list.
     * Two pointers are maintained, one previous and one current
     * As moving forward if, current encounters a duplicate, it is removed.
     * @param head
     */
    public void deleteDups(Node head){

        Node node = head;
        Node previousNode = null;
        HashSet<Integer> set = new HashSet<>();

        while(node!=null){
            if(set.contains(node.value)){
                previousNode.next = node.next;
            }
            else{
                set.add(node.value);
                previousNode = node;
            }
            node = node.next;
        }
    }

    /**
     * In case no extra data structure is to be used.
     * @param
     */

    public void deleteDupsWithoutDS(Node head){
        Node currentNode = head;

        while(currentNode!=null){
            Node runnerNode = currentNode;

            while(runnerNode.next!=null){
                if(runnerNode.next.value == currentNode.value){
                    runnerNode.next = runnerNode.next.next;
                }
                else {
                    runnerNode = runnerNode.next;
                }
            }

            currentNode = currentNode.next;
        }
    }

    public static void main(String[] args){
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        Node head = new Node(1);

        removeDuplicates.addToList(head);
        removeDuplicates.addToList(new Node(1));
        removeDuplicates.addToList(new Node(3));
        removeDuplicates.addToList(new Node(4));
        removeDuplicates.addToList(new Node(5));
        removeDuplicates.addToList(new Node(3));
        removeDuplicates.addToList(new Node(5));

        removeDuplicates.printList(head);

        //removeDuplicates.deleteDups(head);

        removeDuplicates.deleteDupsWithoutDS(head);

        removeDuplicates.printList(head);

    }
}
