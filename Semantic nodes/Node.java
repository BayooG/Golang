package golang;

import java.util.ArrayList;

import javax.naming.Context;

public abstract class Node {
	protected ArrayList <Node> children = new ArrayList<>();
	
	
	public void addChild(Node child) {
		children.add(child);
	}
	
	abstract public Object run (Context c );

}
