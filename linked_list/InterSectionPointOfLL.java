package linked_list;

public class InterSectionPointOfLL {

    static SinglyLinkedListedList.Node findInterSection(SinglyLinkedListedList.Node head1, SinglyLinkedListedList.Node head2){
        if(head1 == null || head2 == null) return head1;

        SinglyLinkedListedList.Node temp1 = head1, temp2 = head2;

        while (temp1 != temp2 ) {
            if(temp1 == null) temp1 = head2;
            else if(temp2 == null) temp2 = head1;
            
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return temp1;
    }

    public static void main(String[] args) {
        SinglyLinkedListedList.Node f1 = new SinglyLinkedListedList.Node(1);
        SinglyLinkedListedList.Node f2 = new SinglyLinkedListedList.Node(2);
        SinglyLinkedListedList.Node f3 = new SinglyLinkedListedList.Node(3);
        
        SinglyLinkedListedList.Node n1 = new SinglyLinkedListedList.Node(4);
        SinglyLinkedListedList.Node n2 = new SinglyLinkedListedList.Node(5);
        
        SinglyLinkedListedList.Node s1 = new SinglyLinkedListedList.Node(10);
        SinglyLinkedListedList.Node s2 = new SinglyLinkedListedList.Node(9);
        SinglyLinkedListedList.Node s3 = new SinglyLinkedListedList.Node(8);
        SinglyLinkedListedList.Node s4 = new SinglyLinkedListedList.Node(7);
        SinglyLinkedListedList.Node s5 = new SinglyLinkedListedList.Node(6);


       f1.next = f2;
       f2.next = f3;
       f3.next = n1;

       n1.next = n2;

       s1.next = s2;
       s2.next = s3;
       s3.next = s4;
       s4.next = s5;
       s5.next = n1;

        System.out.println(findInterSection(f1, s1).data);
    }
}
