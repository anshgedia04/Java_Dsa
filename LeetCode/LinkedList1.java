package LeetCode;
//removeduplicates  from linked list
import JavaAdv.LinkedList.Node;
import JavaAdv.LinkedList.SinglyLinkedList;

public class LinkedList1 extends SinglyLinkedList {
    LinkedList1(){
        super();
    }

    public void removeDuplicates(){

        Node temp = head ;

        while(temp.next != null){
            if(temp.value == temp.next.value){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        LinkedList1 list = new LinkedList1();
        list.addLast(1);
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(3);
        list.addLast(3);
        list.removeDuplicates();
        list.display();
    }
}
