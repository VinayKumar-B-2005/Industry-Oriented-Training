package day_12;

public class p10 {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    static Node merge(Node a, Node b) {
        Node dummy = new Node(0);
        Node temp = dummy;
        while (a != null && b != null) {
            if (a.data < b.data) {
                temp.next = a;
                a = a.next;
            } else {
                temp.next = b;
                b = b.next;
            }
            temp = temp.next;
        }
        if (a != null)
            temp.next = a;
        else
            temp.next = b;
        return dummy.next;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        a.next = new Node(2);
        a.next.next = new Node(4);

        Node b = new Node(1);
        b.next = new Node(3);
        b.next.next = new Node(4);

        Node result = merge(a, b);

        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }
    }
}
