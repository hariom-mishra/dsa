package linked_list;

public class AddTwoNumberAsLL {
    public static void main(String[] args) {
        SinglyLinkedListedList s1 = new SinglyLinkedListedList();
        SinglyLinkedListedList.addLast(s1, 1);
        SinglyLinkedListedList.addLast(s1, 5);
        SinglyLinkedListedList.addLast(s1, 9);
        SinglyLinkedListedList.addLast(s1, 0);
        SinglyLinkedListedList.printList(s1);
        System.out.println();
        SinglyLinkedListedList s2 = new SinglyLinkedListedList();
        SinglyLinkedListedList.addLast(s2, 1);
        SinglyLinkedListedList.addLast(s2, 6);
        SinglyLinkedListedList.addLast(s2, 5);
        SinglyLinkedListedList.addLast(s2, 0);
        SinglyLinkedListedList.addFront(s2, 0);
        SinglyLinkedListedList.printList(s2);
        System.out.println();
        SinglyLinkedListedList.printList(SinglyLinkedListedList.addLL(s1, s2));
    }
}
