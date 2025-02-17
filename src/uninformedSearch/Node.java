package uninformedSearch;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Node<T> {
	// Node attributes
	private T state;
	private Node<T> parent;
	private int depth;
	
	// Constructor
	public Node (T state, Node<T> parent) {
		this.state = state;
		this.parent = parent;
		this.depth = (parent == null) ? 0 : parent.depth + 1;
	}
	
	//getters and setters
	public T getState() {
		return state;
	}
	
	public Node<T> getParent() {
		return parent;
	}
	
	public int getDepth() {
		return depth;
	}
	
	public List<T> getPath() {
		List<T> path = new ArrayList<>();
		Node<T> current = this;
		while(current != null) {
			path.add(current.state);
			current = current.getParent();
		}
		Collections.reverse(path);
		return path;
	}
}
