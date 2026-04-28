public class Practice {
    public static void main(String[] args) {
        Node myNode = new Node();
        myNode.value = 'w';

        Node otherNode = new Node();
        otherNode.value = 'e';

        Node coolNode = otherNode;
        coolNode.value = 'x';

        System.out.println(myNode.value);
        System.out.println(otherNode.value);
        System.out.println(coolNode.value);
    }
}
