public class LinkedList {
    static Node head;
    public static void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head==null){
            head = node;
        }
        else {
            Node n = head ;
            while(n.next!=null){
                n=n.next;
            }
            n.next=node;
        }
    }

    public static void show(){
        Node n = head ;
        while(n.next!=null){
            System.out.print(n.data+"->");
            n=n.next;
        }
        System.out.print(n.data+"->Null");

    }

}

