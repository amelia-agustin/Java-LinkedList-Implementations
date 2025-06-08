
public class Main {
    public static void main(String[] args) {

        //single linked list
        SingleLinkedList singleList = new SingleLinkedList();
        System.out.println("Single Linked List:");
        singleList.addNode(10);
        singleList.addNode(20);
        singleList.addNode(30);
        singleList.display();

        System.out.println(" ");

        //double linked list
        System.out.println("Double Linked List:");
        DoubleLinkedList doubleList = new DoubleLinkedList();
        doubleList.addNode(10);
        doubleList.addNode(20);
        doubleList.addNode(30);
        doubleList.display();

        System.out.println(" ");

        //circular linked list
        System.out.println("Circular Linked List:");
        CircularLinkedList list = new CircularLinkedList();
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.display();

        System.out.println(" ");

        //circular double linked list
        System.out.println("Circular Double Linked List:");
        CircularDoubleLinkedList circularDoubleList = new CircularDoubleLinkedList();
        circularDoubleList.addNode(10);
        circularDoubleList.addNode(20);
        circularDoubleList.addNode(30);
        circularDoubleList.display();
    }
}