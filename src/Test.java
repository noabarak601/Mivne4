public class Test {
	public static void main(String[]args)
    {
		BacktrackingBTree<Integer> bt = new BacktrackingBTree<Integer>(3);
		bt.insert(4);
		bt.insert(8);
		bt.insert(12);
		bt.insert(16);
		bt.insert(20);
		bt.insert(24);
		bt.insert(26);
		bt.insert(27);
		
		bt.insert(1);
		bt.insert(2);
		bt.insert(3);
		bt.insert(13);
		bt.insert(14);
		bt.insert(9);
		System.out.println(bt.toString());
//		bt.Backtrack();
//		System.out.println(bt.toString());
    }
}
