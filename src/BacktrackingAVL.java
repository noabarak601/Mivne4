import java.util.LinkedList;
import java.util.List;

public class BacktrackingAVL extends AVLTree {
    // For clarity only, this is the default ctor created implicitly.
    public BacktrackingAVL() {
        super();
    }

	//You are to implement the function Backtrack.
    public void Backtrack() {
        // You should remove the next two lines, after double-checking that the signature is valid!
        
    }
    
    //Change the list returned to a list of integers answering the requirements
    public static List<Integer> AVLTreeBacktrackingCounterExample() {
        // You should remove the next two lines, after double-checking that the signature is valid!
    	LinkedList<Integer> list  = new LinkedList<>();
	    list.add(2);
	    list.add(1);
	    list.add(4);
	    list.add(3);
	    list.add(5);
	    list.add(6);
	    return list;
            }
    
    public int Select(int index) {
        // You should remove the next two lines, after double-checking that the signature is valid!
        IntegrityStatement.signature(); // Reminder!
        throw new UnsupportedOperationException("You should implement this");
    }
    
    public int Rank(int value) {
        // You should remove the next two lines, after double-checking that the signature is valid!
        IntegrityStatement.signature(); // Reminder!
        throw new UnsupportedOperationException("You should implement this");
    }
}
