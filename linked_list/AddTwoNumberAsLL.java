package linked_list;

public class AddTwoNumberAsLL {
    public static void main(String[] args) {
        SinglyLinkedListedList s1 = new SinglyLinkedListedList();
        s1.addLast(s1, 1);
        s1.addLast(s1, 5);
        s1.addLast(s1, 9);
        s1.addLast(s1, 0);
        s1.printList(s1);
        System.out.println();
        SinglyLinkedListedList s2 = new SinglyLinkedListedList();
        s2.addLast(s2, 1);
        s2.addLast(s2, 6);
        s2.addLast(s2, 5);
        s2.addLast(s2, 0);
        s2.addFront(s2, 0);
        s2.printList(s2);
        System.out.println();
        s1.printList(s1.addLL(s1, s2));
    }
}
