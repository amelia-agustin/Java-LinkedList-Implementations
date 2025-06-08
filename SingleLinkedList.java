class NodeForSingle {
    int data;
    NodeForSingle next; // Pointer ke node berikutnya

    public NodeForSingle(int data) {
        this.data = data;
        this.next = null; // Awalnya tidak menunjuk ke node lain
    }
}
public class SingleLinkedList {
    NodeForSingle head = null; // Head sebagai node pertama dalam linked list

    // Menambahkan node ke akhir list
    void addNode(int data) {
        NodeForSingle newNodeForSingle = new NodeForSingle(data);
        if (head == null) {
            head = newNodeForSingle; // Jika list kosong, jadikan newNode sebagai head
        } else {
            NodeForSingle temp = head;
            while (temp.next != null) { // Cari node terakhir
                temp = temp.next;
            }
            temp.next = newNodeForSingle; // Hubungkan node terakhir ke newNode
        }
    }

    // Menampilkan semua elemen dalam linked list
    void display() {
        NodeForSingle temp = head;
        while (temp != null) { // Iterasi sampai node terakhir
            System.out.print(temp.data + " → ");
            temp = temp.next;
        }
        System.out.println("null"); // Node terakhir menunjuk ke null
    }
}
