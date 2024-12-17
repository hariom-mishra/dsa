package linked_list;

public class RotateALL {

    static SinglyLinkedListedList.Node rotateK(SinglyLinkedListedList.Node head, int k){
        if (head == null || head.next == null) return head;
        
        SinglyLinkedListedList.Node tempHead = head;
        int count = 1;
        while (tempHead.next != null) {
            count++;
            tempHead = tempHead.next;
        }

        SinglyLinkedListedList.Node tail = tempHead;
        tail.next = head;
        k = k % count;
        int i = 1;
        tempHead = head;
        while (i < count - k) {
            tempHead = tempHead.next;
            i++;
        }

        head = tempHead.next;
        tempHead.next = null;
        
        return head;
    }
    
    public static void main(String[] args) {
        int k = 2;
        SinglyLinkedListedList.Node n1 = new SinglyLinkedListedList.Node(1);
        SinglyLinkedListedList.Node n2 = new SinglyLinkedListedList.Node(2);
        SinglyLinkedListedList.Node n3 = new SinglyLinkedListedList.Node(3);
        SinglyLinkedListedList.Node n4 = new SinglyLinkedListedList.Node(4);
        SinglyLinkedListedList.Node n5 = new SinglyLinkedListedList.Node(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        SinglyLinkedListedList.printList(n1);
        System.out.println();
        SinglyLinkedListedList.printList(rotateK(n1, k));
    }
}
