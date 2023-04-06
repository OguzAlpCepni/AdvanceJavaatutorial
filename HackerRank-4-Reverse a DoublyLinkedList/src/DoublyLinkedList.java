public class DoublyLinkedList extends Node{

    public Node Reverse(Node node){
        Node head = node;
        Node temp = null;
        // 1 <=>2 <=> 3 <=> 4 <=> 5
        // 5 <=> 4 <=> 3 <=> 2 <=> 1
        while(node != null){
            temp = head.prev;
            head.prev = head.next;
            head.next = temp;
            node = head.prev;
        }
        if(temp != null) return temp.prev;

        return node;
    }

}
