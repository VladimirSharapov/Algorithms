package ll;

public class LLUtils {

    public static Node createLinkedList(int... arr) {

        Node next = null;
        Node current = null;
        for(int i = arr.length - 1; i >= 0; i-- ) {
            current = new Node(arr[i], next);
            next = current;
        }

        return current;
    }


    public static  void printLinkedList(Node node) {
        Node curr = node;
        while(curr != null) {
            System.out.print(curr.data);
            curr = curr.next;
            if(curr != null) {
                System.out.print("--->");
            }
        }

        System.out.println();
    }


    public static void main(String[] args) {
        Node list = LLUtils.createLinkedList(1,2,3);

        LLUtils.printLinkedList(list);
    }

}
