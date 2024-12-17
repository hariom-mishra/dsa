package linked_list;

public class ReverseLL {

    public static void main(String[] args) {
        SinglyLinkedListedList s1 = new SinglyLinkedListedList();
        s1.addLast(s1, 0);
        s1.addLast(s1, 1);
        s1.addLast(s1, 2);
        s1.addLast(s1, 3);
        s1.addLast(s1, 4);
        s1.printList(s1);
        System.out.println();
        s1.reverseLL(s1);
        s1.printList(s1);
    }
}
