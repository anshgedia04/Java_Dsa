package JavaAdv.LinkedList;

public class CircularLinkedList {
    private CircularNode head = null;
    private CircularNode tail = null;

    // Add node at the beginning
    public void addFirst(int value) {
        CircularNode newNode = new CircularNode(value);
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
            return;
        }

        newNode.next = head;
        head = newNode;
        tail.next = head;
    }

    // Add node at the end
    public void addLast(int value) {
        CircularNode newNode = new CircularNode(value);
        if (head == null) {
            addFirst(value);
            return;
        }

        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    // Remove first node
    public void removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head == tail) {
            head = tail = null;
            return;
        }

        head = head.next;
        tail.next = head;
    }

    // Remove last node
    public void removeLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head == tail) {
            head = tail = null;
            return;
        }

        CircularNode temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }

        temp.next = head;
        tail = temp;
    }

    // Search if value exists
    public boolean search(int value) {
        if (head == null) return false;

        CircularNode temp = head;
        do {
            if (temp.value == value) return true;
            temp = temp.next;
        } while (temp != head);

        return false;
    }

    // Display list
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        CircularNode temp = head;
        do {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(head)");
    }
}

