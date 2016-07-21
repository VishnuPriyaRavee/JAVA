private static void zigZagTraversal(BinaryTreeNode root) {
		int leftToRight=1;
		BinaryTreeNode temp;
		Stack<BinaryTreeNode> currentLevel=new Stack<BinaryTreeNode>();
		Stack<BinaryTreeNode> nextLevel=new Stack<BinaryTreeNode>();
		
		System.out.println("Zig Zag Traversal");
		currentLevel.push(root);
		while (!currentLevel.isEmpty()) {
			temp = currentLevel.pop();
			if(temp!=null)
			{
				System.out.println(temp.getData());
				if(leftToRight==1)
				{
					if (temp.getLeft() != null)
						nextLevel.push(temp.getLeft());
					if (temp.getRight() != null)
						nextLevel.push(temp.getRight());
				}
				else
				{
					if (temp.getRight() != null)
						nextLevel.push(temp.getRight());
					if (temp.getLeft() != null)
						nextLevel.push(temp.getLeft());
				}
				
			}
			if(currentLevel.isEmpty())
			{
				leftToRight=1-leftToRight;
				while(!nextLevel.isEmpty())
				{
					currentLevel.push(nextLevel.pop());
				}
			}
			
			
		}
	}
