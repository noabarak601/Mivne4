import java.util.LinkedList;
import java.util.List;

public class BacktrackingBTree<T extends Comparable<T>> extends BTree<T> {
	// For clarity only, this is the default ctor created implicitly.
	public BacktrackingBTree() {
		super();
	}

	public BacktrackingBTree(int order) {
		super(order);
	}

	//You are to implement the function Backtrack.
	public void Backtrack() {
		// You should remove the next two lines, after double-checking that the signature is valid!
	    IntegrityStatement.signature(); // Reminder!
	    throw new UnsupportedOperationException("You should implement this");
    }
	
	//Change the list returned to a list of integers answering the requirements
	public static List<Integer> BTreeBacktrackingCounterExample(){
		// You should remove the next two lines, after double-checking that the signature is valid!
	    LinkedList<Integer> list  = new LinkedList<>();
	    list.add(3);
	    list.add(4);
	    list.add(5);
	    list.add(6);
	    list.add(7);
	    list.add(8);
	    return list;
	}
	//NOA
	public static void foo() {
		System.out.println("Noa queen");
	}
	//########################
	//MAYA
	public int foo2(int num) {
		return num+1;

	}
		
}
