package linked_list;

public class ReverseLL {

    public static void main(String[] args) {
        SinglyLinkedListedList s1 = new SinglyLinkedListedList();
        SinglyLinkedListedList.addLast(s1, 0);
        SinglyLinkedListedList.addLast(s1, 1);
        SinglyLinkedListedList.addLast(s1, 2);
        SinglyLinkedListedList.addLast(s1, 3);
        SinglyLinkedListedList.addLast(s1, 4);
        SinglyLinkedListedList.printList(s1);
        System.out.println();
        SinglyLinkedListedList.reverseLL(s1);
        SinglyLinkedListedList.printList(s1);
    }
}
