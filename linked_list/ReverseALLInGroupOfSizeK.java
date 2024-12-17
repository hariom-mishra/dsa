package linked_list;

public class ReverseALLInGroupOfSizeK {
    static SinglyLinkedListedList.Node findKth(SinglyLinkedListedList.Node head, int k){
        SinglyLinkedListedList.Node temp = head;

        while (temp != null && k > 0) {
            temp = temp.next;
            k--;
        }

        return temp;
    }

    static SinglyLinkedListedList.Node reverse(SinglyLinkedListedList.Node head, int k){
        SinglyLinkedListedList.Node temp = head;
        SinglyLinkedListedList.Node prevNode = new SinglyLinkedListedList.Node(-1);

        while (temp != null) {
            SinglyLinkedListedList.Node tail = findKth(temp, k);
            SinglyLinkedListedList.Node nextNode;

            if(tail != null){
                nextNode = tail.next;
                tail.next = null;
                SinglyLinkedListedList.Node newHead = SinglyLinkedListedList.recursiveReverse(temp);
    
                if(temp == head){
                    head = tail;
                }
                prevNode.next = newHead;
                prevNode = temp;
                temp = nextNode;
            }else{
                prevNode.next = temp;
                break;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        SinglyLinkedListedList.Node n1 = new SinglyLinkedListedList.Node(1);
        SinglyLinkedListedList.Node n2 = new SinglyLinkedListedList.Node(2);
        SinglyLinkedListedList.Node n3 = new SinglyLinkedListedList.Node(3);
        SinglyLinkedListedList.Node n4 = new SinglyLinkedListedList.Node(4);
        SinglyLinkedListedList.Node n5 = new SinglyLinkedListedList.Node(5);
        SinglyLinkedListedList.Node n6 = new SinglyLinkedListedList.Node(6);
        SinglyLinkedListedList.Node n7 = new SinglyLinkedListedList.Node(7);
        SinglyLinkedListedList.Node n8 = new SinglyLinkedListedList.Node(8);
        SinglyLinkedListedList.Node n9 = new SinglyLinkedListedList.Node(9);
        SinglyLinkedListedList.Node n10 = new SinglyLinkedListedList.Node(10);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = n9;
        n9.next = n10;

        SinglyLinkedListedList.printList(reverse(n1, 3));
    }
}
