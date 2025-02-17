package uninformedSearch;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Collection;

/*
* BFS expands each node from the initial node until the goal node is reached
* If solution returns the path as a list from initial node to goal node
* If no solution found returns null
*/
public class BFS<T> {
	
    public List<T> search(SearchProblem<T> problem) {
        Queue<Node<T>> frontier = new LinkedList<>();
        Set<T> explored = problem.useGraphSearch() ? new HashSet<>() : null;     
        frontier.add(new Node<>(problem.getInitialState(), null));
		
        while (!frontier.isEmpty()) { 	
        	Node<T> node = frontier.poll();
        	T state = node.getState();
        	
        	if (problem.isGoal(state)) {
        		return node.getPath();
        	}
        	
        	if (explored != null) {
        		explored.add(state);
        	}
        	
        	for (T successor : problem.getSuccessors(state)) {
        		if (explored != null) {
        			if (explored.contains(successor) || containsState(frontier, successor)) {
        				continue;
        			}
        		}
        		frontier.add(new Node<>(successor, node));    		
        	}
        }	
        return null;
	}
    
    
    private boolean containsState(Collection<Node<T>> nodes, T state) {
        for (Node<T> node : nodes) {
            if (node.getState().equals(state)) {
                return true;
            }
        }
        return false;
    }   
}
