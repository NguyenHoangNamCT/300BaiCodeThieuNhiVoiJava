package code300BaiThieuNhi;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree_LatNgangCayNhiPhan {
	
	
	 public static class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode() {}
	     TreeNode(int val) { this.val = val; }
	     TreeNode(int val, TreeNode left, TreeNode right) {
	         this.val = val;
	         this.left = left;
	         this.right = right;
	     }
	 }
	 

	public static void main(String[] args) {
		// Đặt encoding UTF-8 cho System.out
        try {
			System.setOut(new PrintStream(System.out, true, "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Tạo cây nhị phân ví dụ:
		//        4
		//      /   \
		//     2     7
		//    / \   / \
		//   1   3 6   9
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2, new TreeNode(1), new TreeNode(3));
		root.right = new TreeNode(7, new TreeNode(6), new TreeNode(9));

		System.out.println("Cây gốc:");
		levelOrder(root); // In cây trước khi đảo ngược
		
		// Đảo ngược cây
		root = invertTree(root);

		System.out.println("\nCây sau khi đảo ngược:");
		levelOrder(root); // In cây sau khi đảo ngược

	}
	
	public static TreeNode invertTree(TreeNode root) {
        if(root == null)
            return root;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
	
	// Duyệt cây theo tầng (BFS - Level Order Traversal)
		public static void levelOrder(TreeNode root) {
			if (root == null) return;

			Queue<TreeNode> queue = new LinkedList<>();
			queue.add(root);

			while (!queue.isEmpty()) {
				TreeNode current = queue.poll();
				System.out.print(current.val + " ");

				if (current.left != null) queue.add(current.left);
				if (current.right != null) queue.add(current.right);
			}
			System.out.println();
		}
}
