public class Practice {
    public static void main(String[] args) {
        Node myNode = new Node('w', null);
        Node otherNode = new Node('x', null);
        Node coolNode = new Node('e', null);

        Node currentNode = myNode;

        myNode.next = otherNode;
        otherNode.next = coolNode;

        while(currentNode != null) {
            System.out.println(currentNode.value);
            currentNode = currentNode.next;
        }


        // System.out.println(myNode.value);
        // System.out.println(myNode.next.value);
        // System.out.println(myNode.next.next.value);
    }
}
