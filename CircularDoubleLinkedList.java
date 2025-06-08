class CircularDoubleNode {
    int data;
    CircularDoubleNode prev, next;

    public CircularDoubleNode(int data) {
        this.data = data;
        this.prev = this.next = null;
    }
}
public class CircularDoubleLinkedList {
    CircularDoubleNode head = null;

    void addNode(int data) {
        CircularDoubleNode newNode = new CircularDoubleNode(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head; // Head menunjuk ke dirinya sendiri
        } else {
            CircularDoubleNode tail = head.prev; // Ambil node terakhir
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode; // Sambungkan kembali ke head
        }
    }

    void display() {
        if (head == null) return;
        CircularDoubleNode temp = head;
        do {
            System.out.print(temp.data + " ↔ ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(kembali ke head)");
    }
}
