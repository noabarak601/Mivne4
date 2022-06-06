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
	public void mergeWithChildren(T value)
	{
		Node<T> node = this.getNode(value);
		Node<T> leftChild = node.children[node.indexOf(value)];
		Node<T> rightChild = node.children[node.indexOf(value)+1];
		//add all keys to left child
		leftChild.addKey(value);
		for(int i=0;i<rightChild.numOfKeys;i++)
		{
			leftChild.addKey(rightChild.keys[i]);
		}
		for(int i=0;i<rightChild.numOfChildren;i++)
		{
			leftChild.addChild(rightChild.children[i]);
		}
	}
	//You are to implement the function Backtrack.
	public void Backtrack() {
		// You should remove the next two lines, after double-checking that the signature is valid!
		if(!were_splitted.isEmpty())
		{
			T delete = (T) were_splitted.pop();
			Node<T>node = this.getNode((T)(delete));
			node.removeKey(delete);
			while(!(were_splitted.peek() instanceof Boolean))
			//splits were made:
			{
				T was_splitted = (T) were_splitted.pop();
				mergeWithChildren(was_splitted);
			}
		}
		
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
