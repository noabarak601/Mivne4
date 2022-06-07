public class Test {
	public static void main(String[]args)
    {
		BacktrackingBTree<Double> bt = new BacktrackingBTree<Double>(3);
		bt.insert(392.0);
		bt.insert(-209.0);
		bt.insert(-431.0);
		bt.insert(457.0);
		bt.insert(-246.0);
		
		bt.insert(30.0);
//		bt.insert(35.0);
//		bt.insert(40.0);
//		bt.insert(45.0);
//		bt.insert(21.0);
//		bt.insert(22.0);
//		bt.insert(23.0);
//		bt.insert(24.0);
//		bt.insert(25.0);
//		bt.insert(26.0);
//		bt.insert(50.0);
//		bt.insert(55.0);
//		bt.insert(27.0);
//		bt.insert(28.0);
//		bt.insert(29.0);
//		bt.insert(4.0);
//		bt.insert(6.0);
//		
		System.out.println("haradot: "+bt.toString());
		bt.Backtrack();
		bt.Backtrack();
		bt.Backtrack();
		bt.Backtrack();
		bt.Backtrack();
		System.out.println("after haradot: "+bt.toString());

		bt.Backtrack();
		System.out.println("after haradot2: "+bt.toString());
		
//		bt.insert(51.0);
//		//System.out.println("Before 26.5 "+bt.toString());
//
//		bt.insert(26.5);
//
//		//System.out.println("After 26.5 "+bt.toString());
//		bt.Backtrack();
//		//System.out.println("After Backtrack: "+bt.toString());
//		
//		bt.Backtrack();
//		System.out.println("After Backtrack: "+bt.toString());
//	
//		BTree_BackTracking_Tests.BtreeDebugging(new int[]{392, -209, -431, 457, -246});
    
    }
}
