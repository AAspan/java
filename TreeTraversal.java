public class TreeTraversal {
    public static void main(String[] args){

// CreateA tree called tree1
        
    	BinaryTree<Character> tree1 = new BinaryTree("H");

    	BinaryTree<Character> rightsubtree1 = new BinaryTree("X"); 
    	rightsubtree1.attachRight('Y');

    	BinaryTree<Character> leftsubtree1 = new BinaryTree("D"); 
    	leftsubtree1.attachLeft('B');

    	BinaryTree<Character> leftsubtree2 = new BinaryTree("F"); 
    	leftsubtree2.attachRight('G'); 
    	leftsubtree2.attachLeft('E');

    	leftsubtree1.attachRightSubtree(leftsubtree2); 
    	tree1.attachLeftSubtree(leftsubtree1);
    	tree1.attachRightSubtree(rightsubtree1);



//  BUILD tree2 HERE
    	BinaryTree<Character> tree2 = new BinaryTree("F");
        BinaryTree<Character> rrightsubtree1 = new BinaryTree("G");
        BinaryTree<Character> rrightsubtree2 = new BinaryTree("I");
        rrightsubtree2.attachLeft('H');
        rrightsubtree1.attachRightSubtree(rrightsubtree2);

        BinaryTree<Character> lleftsubtree1 = new BinaryTree("B");

        lleftsubtree1.attachLeft('A');

        BinaryTree<Character> lleftsubtree2 = new BinaryTree("D");

        lleftsubtree2.attachLeft('C');

        lleftsubtree2.attachRight('E');

        lleftsubtree1.attachRightSubtree(lleftsubtree2);

        tree2.attachLeftSubtree(lleftsubtree1);

        tree2.attachRightSubtree(rrightsubtree1);
        

        System.out.println(checkSkipped(tree1)); // Should return false
        System.out.println(checkSkipped(tree2)); // Should return true

    }

    public static boolean checkSkipped(BinaryTree<Character> tree){
    	/* // To Iterate a tree using Inorder Traversal
    	TreeIterator<Character> iter = new TreeIterator<Character>(tree);

    	iter.setInorder();
    	while (iter.hasNext()){
    	System.out.print (iter.next());}*/

        String inorderStr = tree.getInorderString();
		if (inorderStr.length() <= 1) {
          return true;
        }

        Character last = inorderStr.charAt(0);
        for (int i = 1; i < inorderStr.length(); i++) {
          char x = inorderStr.charAt(i);

          if (x - last != 1) {
            return true;
          }
          last = x;
        }
        return false;
      }
    }
