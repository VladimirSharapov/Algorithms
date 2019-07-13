package ll;

public class InsertToLinkedList {

    public static Node insertNode(Node node, int value) {
         if(node == null) {
             return new Node(value);
         }


         Node prev = null;
         Node cur = node;
         while(cur != null && cur.data < value) {
             prev = cur;
             cur = cur.next;
         }

        Node ins = new Node(value, cur);
        if(prev != null) {
            prev.next = ins;
        }

        return prev == null ? ins : node;
    }



    public static void main(String[] args) {

        Node in = LLUtils.createLinkedList(2,5,7,10,15);
        LLUtils.printLinkedList(in);

        Node out = insertNode(in, 16);

        LLUtils.printLinkedList(out);
    }
}
