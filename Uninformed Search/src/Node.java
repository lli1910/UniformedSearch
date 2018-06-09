import java.util.ArrayList;
import java.lang.reflect.Array;

//Author: Lily Li
//Date created: 5/31/18

public class Node { 
	public String stationName;
	private ArrayList<Node> children;
	Node parentNode;
	
	//constructor
	public Node(String stationName, Node children) {
		this.stationName = stationName;
		this.children = new ArrayList<>();
		this.children.add(children);
	}
	
	//return a list of all connected nodes
	public ArrayList<Node> getChildren(){
		return this.children;
	}
	
	//used to set the children of a node
	public void setChildren (ArrayList<Node> children) {
		this.children = children;
	}
	
	//remove child node from a list of child nodes
	public boolean removeChild(Node n) {
		return false; 
	}
	
	//print the path found
	public String toString() {
		return this.stationName;
	}
	

}
