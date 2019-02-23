public class Driver {
    public static void main(String[] args) {
        Node myNode = new Node(4);

        LinkedList myList = new LinkedList(myNode);

        myList.addNode(2);
        System.out.println(myNode.getNext().getValue());

        System.out.println(myList.getSize());

        myList.removeNode();
        System.out.println(myList.getSize());
        System.out.println(myNode.getNext());

        myList.addNode(3);
        System.out.println(myList.get(3));
    }
}
