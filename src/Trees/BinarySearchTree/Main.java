package Trees.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();
      //  System.out.println("Root = "+myBST.root);
        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);
        myBST.insert(82);

      //  System.out.println("Root = "+myBST.root.right.right.value);
        System.out.println(myBST.contains(44));
        System.out.println(myBST.contains(82));
    }
}
