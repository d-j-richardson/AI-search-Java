package uninformedSearchTest;

import uninformedSearch.SearchProblem;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import uninformedSearch.BFS;



public class UninformedSearchTest implements SearchProblem<String>{
	private Map<String, List<String>> graph;
	private String initial;
	private String goal;
	
	public UninformedSearchTest() {
		graph = new HashMap<>();
		graph.put("A", Arrays.asList("B", "C"));
		graph.put("B", Arrays.asList("D", "E"));
		graph.put("C", Arrays.asList("F"));
		graph.put("D", Arrays.asList("B"));
		graph.put("E", Arrays.asList("G"));
		graph.put("F", Arrays.asList("G"));
		graph.put("G", Collections.emptyList());
		
		initial = "A";
		goal = "G";
	}
	
	@Override
	public String getInitialState() {
		return initial;
	}
	
	@Override
	public String getGoalState() {
		return goal;
	}
	
	@Override
	public boolean isGoal(String state) {
		return state.equals(goal);
	}
	
	@Override
	public List<String> getSuccessors(String state) {
		return graph.getOrDefault(state, Collections.emptyList());
	}
	
	@Override
	public boolean useGraphSearch() {
		return true;
	}
	 
	public static void main(String[] args) {
		UninformedSearchTest st = new UninformedSearchTest();
		System.out.println(
				"Search Problem: Initial State = " + 
				st.getInitialState() + ", Goal State = " + 
				st.getGoalState());
		
		BFS<String> bfs = new BFS<>();
		List<String> solution = bfs.search(st);
		if(solution != null) {
			System.out.println("Graph Search BFS solution path = " + solution);
		}
		else {
			System.out.println("No solution found");
		}
		
	}
}
