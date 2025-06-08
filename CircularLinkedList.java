class CircularNode {
    int data;
    CircularNode next;

    public CircularNode(int data) {
        this.data = data;
        this.next = null;
    }
}
public class CircularLinkedList {
    CircularNode head = null;

    void addNode(int data) {
        CircularNode newNode = new CircularNode(data);
        if (head == null) {
            head = newNode;
            head.next = head; // Node pertama menunjuk ke dirinya sendiri
        } else {
            CircularNode temp = head;
            while (temp.next != head) { // Cari node terakhir
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head; // Hubungkan node terakhir ke head
        }
    }

    void display() {
        if (head == null) return;
        CircularNode temp = head;
        do {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(kembali ke head)");
    }
}
