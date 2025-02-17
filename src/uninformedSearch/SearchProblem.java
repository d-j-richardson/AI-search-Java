package uninformedSearch;

import java.util.List;

public interface SearchProblem<T>{
		
	// Return the initial state of the problem
	T getInitialState();
	
	// Return the goal state of the problem
	T getGoalState();
		
	// Check if a given state is goal state
	boolean isGoal(T State);
		
	// For a given state, return a list of successor nodes
	List<T> getSuccessors(T State);
	
	// Default set to false to not perform a graph search
	default boolean useGraphSearch() {
		return false;
	}
}