
public class BinaryTree {
    static Node root;
    static Node left = null, right = null;
    static boolean flag = false;

    public static void insert(int data) {
        Node n = new Node();
        n.data = data;
        n.left = null;
        n.right = null;
        if (root == null) {
            root = n;
            System.out.println("\t\t"+root.data+"\t\t-root");
            System.out.println();
        } else insert(root, n);


    }

    public static void insert(Node n, Node Nnode) {
        if (Nnode.data < n.data) {
            if (n.left == null) {
                n.left = Nnode;
                System.out.println(n.data+ "\t-left");
            } else insert(n.left, Nnode);
        } else {
            if (n.right == null) {
                n.right = Nnode;
                System.out.println("\t-right "+n.data);
            } else insert(n.right, Nnode);

        }

        System.out.println();
    }

    public static void search(int data,Node n){

         if(n.data==data){
            flag=true;
             return;
        }
        else{
            if(!flag &&n.right!=null){
                search(data,n.right);
            }
            if(!flag &&n.left!=null){
                search(data,n.left);
            }

         }
    }



    public static void inOrderTransversal(Node n){
        if(n==null){
            return;
        }
        inOrderTransversal(n.left);
        System.out.print(n.data+" ");
        inOrderTransversal(n.right);

    }

       public static void preOrderTransversal(Node n) {
           if (n == null) {
               return;
           }
           System.out.print(n.data + " ");
           preOrderTransversal(n.left);
           preOrderTransversal(n.right);

       }
        public static void postOrderTransversal(Node n) {
           if (n == null) {
               return;
           }
           postOrderTransversal(n.left);
           postOrderTransversal(n.right);
           System.out.print(n.data + " ");

       }

}