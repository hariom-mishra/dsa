package linked_list;
public class FlattenLL {
    Node head;
    public static class Node{
        int data;
        Node next;
        Node child;

        Node(int data){
            this.data = data;
            this.next = null;
            this.child = null;
        }
    }

    static Node merge(Node head1, Node head2){
        Node res = new Node(-1);
        Node newHead = res;

        while (head1 != null && head2 != null) {
            if(head1.data < head2.data){
                newHead.child = head1;
                newHead = head1;
                head1 = head1.child;
            }else{
                newHead.child = head2;
                newHead = head2;
                head2 = head2.child;
            }
            newHead.next = null;
        }

        if(head1 != null){
            newHead.child = head1;
        }

        if(head2 != null) {
            newHead.child = head2;
        }

        return res.child;
    }

    static Node flatten(Node head){
        if(head == null || head.next == null)
            return head;

        Node head1 = head;
        Node head2 = head.next;

        while (head2 != null) {
            Node temp = head2.next;
            head1 = merge(head1, head2);
            head2 = temp;
        }
        return head1;
    }

    public static void printLinkedList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.child;
        }
        System.out.println();
    }

    public static void printOriginalLinkedList(Node head, int depth) {
        while (head != null) {
            System.out.print(head.data);

            // If child exists, recursively
            // print it with indentation
            if (head.child != null) {
                System.out.print(" -> ");
                printOriginalLinkedList(head.child, depth + 1);
            }

            // Add vertical bars
            // for each level in the grid
            if (head.next != null) {
                System.out.println();
                for (int i = 0; i < depth; ++i) {
                    System.out.print("| ");
                }
            }
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(3);
        Node n2 = new Node(2);
        Node n3 = new Node(10);
        Node n4 = new Node(1);
        Node n5 = new Node(7);
        Node n7 = new Node(11);
        Node n8 = new Node(12);
        Node n9 = new Node(4);
        Node n10 = new Node(9);
        Node n11 = new Node(5);
        Node n12 = new Node(6);
        Node n13 = new Node(7);

        n1.next = n2;
        n2.child = n3;
        n2.next = n4;
        n4.next = n9;
        n4.child = n5;
        n5.child = n7;
        n7.child = n8;
        n9.child = n10;
        n9.next = n11;
        n11.child = n12;
        n12.child = n13;

        System.out.println("Original linked list:");
        printOriginalLinkedList(n1, 0);

        // Flatten the linked list
        // and print the flattened list
        Node flattened = flatten(n1);
        System.out.print("\nFlattened linked list: ");
        printLinkedList(flattened);
        
    }
}
