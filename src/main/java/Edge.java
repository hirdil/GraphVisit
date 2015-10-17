public class Edge {
	private final Node _node1;
	private final Node _node2;

	public Edge(Node node1, Node node2) {
		_node1 = node1;
		getNode1().addSibling(node2);
		_node2 = node2;
		_node2.addSibling(node1);
	}

	@Override
	public String toString() {
		return getNode1().toString() + " to " + _node2.toString();
	}

	public Node getNode1() {
		return _node1;
	}

	public Node getNode2() {
		return _node2;
	}
}
