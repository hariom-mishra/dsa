package linked_list;

public class IsPalindrome {
    public static void main(String[] args) {
        SinglyLinkedListedList s1 = new SinglyLinkedListedList();
        s1.addFront(s1, 1);
        s1.addLast(s1, 2);
        s1.addLast(s1, 2);
        s1.addLast(s1, 1);
        s1.printList(s1);
        System.out.println(s1.isPalin(s1));
    }
}
