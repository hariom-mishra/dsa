package linked_list;

public class SinglyLinkedListedList{
    private Node head;
    public static class Node {
        int data;
        Node next;
    
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static void addLast(SinglyLinkedListedList list , int data){
        Node temp = list.head;
        Node newNode = new Node(data);
        newNode.next = null;
        if (temp == null) {
            list.head = newNode;
            return;
        }
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    static void addFront(SinglyLinkedListedList list, int data){
        Node node = new Node(data);
        node.next = list.head;
        list.head = node;
    }

    static void insertAt(SinglyLinkedListedList list, int data, int pos){
        Node temp = list.head;
        int i = 1;
        Node newNode = new Node(data);
        while (i < pos && temp != null) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    static int removeFront(SinglyLinkedListedList list){
        if(list.head == null){
            System.out.println("The List is empty");
            return -1;
        }

        list.head = list.head.next;
        return 0;
    }

    static int removeLast(SinglyLinkedListedList list){
        if(list.head == null){
            System.out.println("The List is empty");
            return -1;
        }else if(list.head.next == null){
            int data = list.head.data;
            list.head = null;
            return data;
        }
        Node temp = list.head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = null;
        return val;
    }

    static int removeAtIndex(SinglyLinkedListedList list, int pos){
        Node temp = list.head;
        int i = 1;
        while (i < pos && temp != null) {
            i++;
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = temp.next.next;
        return val;
    }

    static void printList(SinglyLinkedListedList list){
        Node temp = list.head;
        if (temp == null) {
            System.out.println("No elements found!");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    static void printList(Node temp){
        if (temp == null) {
            System.out.println("No elements found!");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    static Node recursiveReverse(Node head){
        if(head.next == null || head == null){
            return head;
        }
        
        Node newHead = recursiveReverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    static void reverseLL(SinglyLinkedListedList list){
        list.head = recursiveReverse(list.head);
    }

    static Node findMid(SinglyLinkedListedList s1){
        Node slow = s1.head;
        Node fast = s1.head;
        if(slow.next == null) return slow;
        while (fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static boolean isPalin(SinglyLinkedListedList s1){
        Node mid = findMid(s1);
        Node midHead = recursiveReverse(mid.next);
        Node left = s1.head;
        while (midHead != null) {
            if(midHead.data != left.data){
                return false;
            }
            midHead = midHead.next;
            left = left.next;
        }
        return true;
    }

    static Node addLL(SinglyLinkedListedList s1, SinglyLinkedListedList s2){
        Node dummyNode = new Node(-1);
        Node res = dummyNode;
        int remainder = 0;
        Node head1 = s1.head, head2 = s2.head;

        while (head1 != null && head2 != null) {
            int addition = head1.data + head2.data + remainder;
            int num = addition % 10;
            Node newNode = new Node(num);
            res.next = newNode;
            res = res.next;
            remainder = addition / 10;
            head1 = head1.next;
            head2 = head2.next;

        }

        while (head1 != null) {
            Node newNode = new Node(remainder + head1.data);
            res.next = newNode;
            res = res.next;
            remainder = remainder + head1.data /10;
            head1 = head1.next;
        }

        while (head2 != null) {
            Node newNode = new Node(remainder + head2.data);
            res.next = newNode;
            res = res.next;
            remainder = remainder + head2.data /10;
            head2 = head2.next;
        }

        return dummyNode.next;
    }
}
