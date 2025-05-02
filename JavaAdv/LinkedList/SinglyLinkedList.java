package JavaAdv.LinkedList;

public class SinglyLinkedList extends Node{
    private Node head = null;
    private Node tail = null;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        return;
    }
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        return;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
    }
    public void removeFirst(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        if (head == null) {
            System.out.println("List is empty");
        }
        return;
    }
    public void removeLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head == tail) { // Only one node
            head = tail = null;
            return;
        }

        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;
    }

    public void remove(int data){
        if(search(data)){
            if(head.value == data){
                removeFirst();
                return;
            }
            if(head == tail){
                removeFirst();
                return;
            }
            Node temp = head;
            Node prev = null;
            if(head.next != null){
                temp = head.next;
                prev = head;
            }
            while(temp.value != data){
                prev = temp;
                temp = temp.next;
            }
            if(temp.next != null){
                prev.next = temp.next;
            }else{
                removeLast();
                return;
            }

        }
        else{
            System.out.println("Element not found");
        }
    }

    public boolean search(int data){
        Node temp = head;
        while(temp != null){
            if(temp.value == data){
                System.out.println("Element found");
                return true;
            }
            temp = temp.next;
        }
        System.out.println("Element not found");
        return false;
    }
}
