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

    public LinkedList(Node head){
        this.head = head;
        this.size = 1;
    }

    //methods
    public void addNode(int value){
        Node curr = head;
        Node temp = new Node(value);

        if(curr == null){
            this.head = temp;
            size += 1;
            return;
        }

        while (curr.getNext() != null){
            curr = curr.getNext();
        }

        curr.setNext(temp);
        size += 1;
    }

    public void removeNode(){

    }

    public int getSize(){

    }

    public boolean isEmpty(){

    }

    public int get(int nodeNum){

    }
}
