package JavaAdv.LinkedList;

public class main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst(25);
        list.addFirst(5);
        list.addFirst(10);
        list.addFirst(15);
        list.addFirst(20);

        list.remove(15);
        list.display();


    }
}