class NodeForDouble {
    int data;
    NodeForDouble prev;
    NodeForDouble next; // Pointer ke node sebelum dan sesudahnya

    public NodeForDouble(int data) {
        this.data = data;
        this.prev = this.next = null; // Awalnya null
    }
}
public class DoubleLinkedList {
    NodeForDouble head = null;

    void addNode(int data) {
        NodeForDouble newNode = new NodeForDouble(data);
        if (head == null) { // Jika list kosong, buat head baru
            head = newNode;
        } else {
            NodeForDouble temp = head;
            while (temp.next != null) { // Cari node terakhir
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp; // Hubungkan prev ke node sebelumnya
        }
    }

    void display() {
        NodeForDouble temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ↔ ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
