public class Edge {
	private final Node _node1;
	private final Node _node2;

	public Edge(final Node node1, final Node node2) {
		_node1 = node1;
		_node1.addSibling(node2);
		_node2 = node2;
		_node2.addSibling(node1);
	}

	public Node getNode1() {
		return _node1;
	}

	public Node getNode2() {
		return _node2;
	}

	@Override
	public String toString() {
		return getNode1().toString() + " to " + _node2.toString();
	}
}
