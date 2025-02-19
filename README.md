# AI Search Algorithms

### Index of Implemented Algorithms

|No.|Use|Search Type|Name|Code|Documentation|
| -------- |:--------:| :-----| :----- |:----- |:----- |
|1.1|Generic|Uninformed|Node|Yes|[Node](#node)|
|1.2|Generic|Uninformed|SearchProblem|Yes|[SearchProblem](#searchproblem)|
|1.3|Indavidual|Uninformed|BFS|Yes|[BreadthFirstSearch](#breadth-first-search-bfs)|
|1.4|Indavidual|Uninformed|DFS|---|---|
|1.5|Indavidual|Uninformed|UCS|---|---|
|1.6|Indavidual|Uninformed|IDS|---|---|
|1.7|Indavidual|Uninformed|BS|---|---|
|1.8|Indavidual|Uninformed|DLS|---|---|
|2.0|Generic|Informed|InformedSearchProblem|---|---|
|2.1|Indavidual|Informed|BeFS|---|---|
|2.2|Indavidual|Informed|AStar|---|---|
|2.3|Indavidual|Informed|GBeFS|---|---|
|2.4|Indavidual|Informed|RBeFS|---|---|
|2.5|Indavidual|Informed|MAStar|---|---|
|2.6|Indavidual|Informed|SMBAStar|---|---|
|3.0|Indavidual|Local|HC|---|---|
|3.1|Indavidual|Local|SHC|---|---|
|3.2|Indavidual|Local|SA|---|---|
|3.3|Indavidual|Local|LBS|---|---|
|3.4|Indavidual|Local|GA|---|---|
|3.5|Indavidual|Local|TS|---|---|
|4.0|Indavidual|Local|CSP|---|---|
|4.1|Indavidual|Adverserial|MMA|---|---|
|4.2|Indavidual|Adverserial|ABP|---|---|
|4.3|Indavidual|Adverserial|ES|---|---|
|4.4|Indavidual|Adverserial|MCTS|---|---|


## Node
The node class is a generalised class and is utalised by all search classes and contains attribures such as the state, parent, depth, heuristics, etc. 

## SearchProblem 
The search problem interface is utilised by all uninformed search classes and defines the search problem the problem can be defined in many ways useing HashMaps with Array lists for node and node nieghbors or Edge cases as just a couple of examples. The Search problem also provides a method to switch between graph search (keeps a list of explored states) and tree search (allows cycles) 

## Breadth First Search (BFS)
Breadth first search utalises the SearchProblem class and the Node class. The BFS takes in a SearchProblem and returns a List<T> of a sultion path if there is one,  or null if no solution is found. It utalises a FIFO stack as a frontier. 

Run as a tree search the BFS algorithm has a time complexity and memory complexity of O(b^d) where b = branching factor and d = depth of the goal node from the initial node. Branching factor is calculated by b = total number of child nodes / total number of parent nodes.
Run as a graph search where explored nodes are not re-added to the frontier the time and memory complexity is O(|V| + |E|) where the vertives(V) are nodes and the edges(E) are connections between nodes. This is becuase each vertex and edge is only visited once. Differnce between the graph and tree versions is that the graph version keeps a list of explored nodes. 
