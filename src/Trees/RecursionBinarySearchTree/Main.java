package Trees.RecursionBinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTreeUsingRecursion myRBST = new BinarySearchTreeUsingRecursion();
      //  System.out.println("Root = "+myRBST.root);
//        myRBST.rInsert(47);
//        myRBST.rInsert(21);
//        myRBST.rInsert(76);
//        myRBST.rInsert(18);
//
//        myRBST.rInsert(52);
//        myRBST.rInsert(82);
//        myRBST.rInsert(27);
//        myRBST.rInsert(28);
//        System.out.println(myRBST.rContains(44));
//        System.out.println(myRBST.rContains(82));
       // myRBST.rInsert(5);
        myRBST.rInsert(2);
        myRBST.rInsert(1);
        myRBST.rInsert(3);
   //     System.out.println(myRBST.minValue(myRBST.root));
        System.out.println("Root: "+myRBST.root.value);
        System.out.println("Left Root: "+myRBST.root.left.value);
        System.out.println("Right Root: "+myRBST.root.right.value);

        myRBST.deleteNode(2);
        System.out.println("Root: "+myRBST.getRoot().value);
        System.out.println("Left Root: "+myRBST.getRoot().left.value);
        System.out.println("Right Root: "+myRBST.getRoot().right);

    }
}
