public class Test {
	public static void main(String[]args)
    {
		BacktrackingBTree<Integer> bt = new BacktrackingBTree<Integer>(3);
		bt.insert(3);
		System.out.println(bt.toString());
		bt.insert(4);
		System.out.println(bt.toString());
		bt.insert(5);
		System.out.println(bt.toString());
		bt.insert(6);
		System.out.println(bt.toString());
		bt.insert(7);
		System.out.println(bt.toString());
		bt.insert(8);
		System.out.println(bt.toString());
		bt.Backtrack();
		System.out.println(bt.toString());
    }
}
