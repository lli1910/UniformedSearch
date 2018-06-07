import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//Author: Lily Li
//Date created: 5/31/18
//BASICCC Breadth First Search

public class BreadthFirstSearch {
	Node startNode;
	Node goalNode;
	
	//constructor
	public BreadthFirstSearch(Node startNode, Node goalNode) {
		this.startNode = startNode;
		this.goalNode = goalNode;
	}
	
	public boolean compute() {
		//if goal node is found based on the current start node
		if(this.startNode.equals(goalNode)) {
			System.out.println("Goal Node Found :)");
			System.out.println(startNode);
		}
		
		Queue<Node> queue = new LinkedList<>();
		ArrayList<Node> explored = new ArrayList<>();
		queue.add(this.startNode);
		explored.add(startNode);
		
		//while queue is not empty
		while(!queue.isEmpty()) {
			//remove and return the first node in the queue
			Node current = queue.remove();
			if(current.equals(this.goalNode)) {
				System.out.println(explored);
				return true;
			}
			else {
				if(current.getChildren().isEmpty()){
					return false;
				}
				else {
					queue.addAll(current.getChildren());
				}
			}
			explored.add(current);
		}
		return false;
	}
}
