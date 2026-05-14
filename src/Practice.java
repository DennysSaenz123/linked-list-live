public class Practice {
    public static void main(String[] args) {
        Node myNode = new Node('w', null);
        Node otherNode = new Node('x', null);
        Node coolNode = new Node('e', null);
        Node helloNode = new Node('f', null);

        // Node currentNode = myNode;

        myNode.next = otherNode;
        otherNode.next = coolNode;
        coolNode.next = helloNode;

        // int numNodes = length(myNode);
        // System.out.println(numNodes);

        Node newHead = removeAt(myNode, 2);

        Node current = newHead;

        while(current != null) {
            System.out.println(current.value);
            current = current.next;
        }


        // System.out.println(myNode.value);
        // System.out.println(myNode.next.value);
        // System.out.println(myNode.next.next.value);
    }


    //Count hoe many nodes are in the list
    public static int length(Node head){
        int count = 0;
        Node currentNode = head;

        while(currentNode != null){
            count++;
            currentNode = currentNode.next;
        }

        return count;
    }

    // Remove node at removeIndex
    // head is at index 0 
    public static Node removeAt(Node head, int removeIndex){
        Node current = head;

        for(int i = 0; i < removeIndex - 1; i++){
            current = current.next;
        }

        current.next = current.next.next;

        return head;
    }
}
