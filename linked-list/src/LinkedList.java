import java.util.List;

public class LinkedList {
    //properties
    Node head;
    int size;

    //constructors
    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public LinkedList(Node head) {
        this.head = head;
        this.size = 1;
    }

    //methods
    public void addNode(int value) {
        Node curr = head;
        Node temp = new Node(value);

        if (curr == null) {
            this.head = temp;
            size += 1;
            return;
        }

        while (curr.getNext() != null) {
            curr = curr.getNext();
        }

        curr.setNext(temp);
        size += 1;
    }

    public void removeNode() {
        Node curr = head;

        if (curr == null) {
            System.out.println("linked list empty");
            return;
        } else if (size == 1) {
            System.out.println("one node in linked list.deleting node");
            this.head = null;
            size--;
            return;
        }

        while (curr.getNext() != null) {
            curr = curr.getNext();
        }

        curr.setNext(null);
        size--;

    }

    public int getSize() {
        return this.size;

    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    public int get(int nodeNum) {
        if (nodeNum <= 0) {
            return -1;
        }
        Node curr = head;

        for (int i = 1; i < nodeNum; i++) {
            curr = curr.getNext();

        }
        return curr.getValue();
    }
}
