public class Tester {

    public static void main(String[] args) {

        System.out.println(":Welcome To Binary Tree : ");

        BinaryTree b = new BinaryTree();
        b.insert(4);
        b.insert(2);
        b.insert(5);
        b.insert(1);
        b.insert(6);
        b.insert(3);
        b.insert(7);
        System.out.println("The InOrderTransversal Result is: ");
        b.inOrderTransversal(b.root);
        System.out.println();
        System.out.println("The PreOrderTransversal Result is: ");
        b.preOrderTransversal(b.root);
        System.out.println();
        System.out.println("The PostOrderTransversal Result is: ");
        b.postOrderTransversal(b.root);



    }



}
