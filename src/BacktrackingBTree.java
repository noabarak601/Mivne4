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
		
		for(int i=0;i<leftChild.numOfKeys;i++)
		{
			node.addKey(leftChild.keys[i]);
		}
		for(int i=0;i<leftChild.numOfChildren;i++)
		{
			node.addChild(leftChild.children[i]);
		}
		for(int i=0;i<rightChild.numOfKeys;i++)
		{
			node.addKey(rightChild.keys[i]);
		}
		for(int i=0;i<rightChild.numOfChildren;i++)
		{
			node.addChild(rightChild.children[i]);
		}
		node.removeChild(leftChild);
		node.removeChild(rightChild);
	
	}
	//You are to implement the function Backtrack.
	public void Backtrack() {
		// You should remove the next two lines, after double-checking that the signature is valid!
		if(!were_splitted.isEmpty())
		{
			T delete = (T) were_splitted.pop();
			Node<T>delete_node = this.getNode((T)(delete));
			delete_node.removeKey(delete);
			while(!(were_splitted.peek() instanceof Boolean))
			//splits were made:
			{
				T was_splitted = (T) were_splitted.pop();
				Node<T>was_splitted_node = this.getNode((T)(was_splitted));
				
				mergeWithChildren(was_splitted);
//				was_splitted_node.removeKey(was_splitted);
//				for(int i=0;i<was_splitted_node.getNumberOfChildren();i++)
//				{
//					was_splitted_node.removeChild(i);
//				}
				
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
		
}
