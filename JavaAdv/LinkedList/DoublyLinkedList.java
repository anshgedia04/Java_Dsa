package JavaAdv.LinkedList;

public class DoublyLinkedList extends DoublyNode{
    private DoublyNode head;

    public void addFirst(int value) {
        DoublyNode newNode = new DoublyNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        return;
    }
    public void addLast(int value) {
        DoublyNode newNode = new DoublyNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        DoublyNode prev = head;
        while (prev.next != null) {
            prev = prev.next;
        }
        prev.next = newNode;
        newNode.prev = prev;
        newNode.next = null;
        return;
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next != null) {
            head = head.next;
            return;
        }else{
            head = null;
            System.out.println("List is empty");
            return;
        }
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        DoublyNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        // temp is now the last node
        temp.prev.next = null;
        temp.prev = null; // optional cleanup
    }

    public void insertAfter(int value, int newData) {
        DoublyNode temp = head;
        while (temp != null && temp.value != value) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Value " + value + " not found.");
            return;
        }

        DoublyNode newNode = new DoublyNode(newData);
        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        }

        temp.next = newNode;
    }

    public void insertBefore(int value, int newData) {
        DoublyNode temp = head;
        while (temp != null && temp.value != value) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Value " + value + " not found.");
            return;
        }

        DoublyNode newNode = new DoublyNode(newData);
        newNode.next = temp;
        newNode.prev = temp.prev;

        if (temp.prev != null) {
            temp.prev.next = newNode;
        } else {
            head = newNode;
        }

        temp.prev = newNode;
    }

    public void removeAfter(int value) {
        if (head == null || head.next == null) {
            System.out.println("List is too short to remove after");
            return;
        }

        DoublyNode prev = head;
        DoublyNode temp = head.next;

        while (temp != null && prev.value != value) {
            prev = temp;
            temp = temp.next;
        }

        if (prev.value != value || temp == null) {
            System.out.println("No node found after value: " + value);
            return;
        }

        // Remove temp (node after value)
        prev.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = prev;
        }

        temp.prev = null;
        temp.next = null;
    }

    public void removeBefore(int value) {
        if (head == null || head.next == null) {
            System.out.println("List is too short to remove before");
            return;
        }

        DoublyNode prev = head;
        DoublyNode temp = head.next;

        while (temp != null && temp.value != value) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null || prev == head && temp.value == value) {
            System.out.println("No node exists before value: " + value);
            return;
        }

        // Remove prev (node before temp)
        if (prev.prev != null) {
            prev.prev.next = temp;
            temp.prev = prev.prev;
        } else {
            head = temp;
            temp.prev = null;
        }

        prev.next = null;
        prev.prev = null;
    }


    public void display(){
        DoublyNode currentNode = head;
        while (currentNode.next != null) {
            System.out.print(currentNode.value + " -> ");
            currentNode = currentNode.next;
        }
        System.out.print(currentNode.value + " -> END");
        return ;
    }
}
