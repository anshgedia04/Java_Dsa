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
        list.insertAtIndexRec(2,3);
//        list.display();
        SinglyLinkedList list4 = new SinglyLinkedList();
        list4.addFirst(25);
        list4.addFirst(56);
        list4.addFirst(17);
        list4.addFirst(15);
        list4.addFirst(201);
        list4.addFirst(100);
        list4.remove(15);
        list4.insertAtIndexRec(2,3);
        list.Merge(list4);
        list.display();
        System.out.println(list.Is_cycle());

        DoublyLinkedList list2 = new DoublyLinkedList();
//        list2.addFirst(10);
//        list2.addFirst(20);
//        list2.addLast(30);
//        list2.addLast(40);
//        list2.insertAfter(30 , 12);
//        list2.insertAfter(20 , 15);
//        list2.insertBefore(15 , 10);
//
//        list2.removeAfter(10);
//        list2.removeBefore(30);
//        list2.display();

        CircularLinkedList list3 = new CircularLinkedList();
//        list3.addFirst(12);
//        list3.addFirst(13);
//        list3.addFirst(14);
//        list3.addLast(15);
//        list3.addLast(16);
//        list3.removeFirst();
//        System.out.println(list3.search(12));

//        list3.display();

    }
}