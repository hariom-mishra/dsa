package linked_list;

public class Temp {
    public static void main(String[] args) {
        SinglyLinkedListedList s1 = new SinglyLinkedListedList();
        s1.printList(s1);
        s1.addLast(s1, 0);
        System.out.println();
        s1.printList(s1);

        s1.addFront(s1, 15);
        System.out.println();
        s1.printList(s1);

        s1.addFront(s1, 15);
        s1.addFront(s1, 21);
        s1.addFront(s1, 91);
        System.out.println();
        s1.printList(s1);

        s1.insertAt(s1, 2, 2);
        System.out.println();
        s1.printList(s1);

        s1.removeAtIndex(s1, 2);
        System.out.println();
        s1.printList(s1);

        s1.removeFront(s1);
        System.out.println();
        s1.printList(s1);

        s1.removeLast(s1);
        System.out.println();
        s1.printList(s1);
    }
}
