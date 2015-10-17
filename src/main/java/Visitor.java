import java.util.LinkedHashSet;

public class Visitor {

	public static void main(final String[] args) {
		final Node a = new Node('a');
		final Node b = new Node('b');
		final Node c = new Node('c');
		final Node d = new Node('d');
		final Node e = new Node('e');
		final Node f = new Node('f');
		final Node g = new Node('g');
		final Node h = new Node('h');
		final Node i = new Node('i');

		final Edge ab = new Edge(a, b);
		final Edge ad = new Edge(a, d);
		final Edge be = new Edge(b, e);
		final Edge bc = new Edge(b, c);
		final Edge ec = new Edge(e, c);
		final Edge ef = new Edge(e, f);
		final Edge cg = new Edge(c, g);
		final Edge fg = new Edge(f, g);
		final Edge gh = new Edge(g, h);
		final Edge gi = new Edge(g, i);

		final Graph graph = new Graph("test", ab, ad, be, bc, ec, ef, cg, fg, gh, gi);
		System.out.println(visitGraph(graph).toString());
		// Output: [a, b, e, c, g, f, h, i, d]
	}

	private static LinkedHashSet<Node> visitGraph(final Graph graph) {
		// start element (I just choose the 1st node but it could be any)
		final Node startNode = graph.getEdges().iterator().next().getNode1();
		final LinkedHashSet<Node> visitedNodes = new LinkedHashSet<>();
		visitNode(startNode, visitedNodes);
		return visitedNodes;
	}

	private static void visitNode(final Node node, final LinkedHashSet<Node> visitedNodes) {
		final boolean newVisiting = visitedNodes.add(node);
		if (newVisiting) {
			for (final Node sibling : node.getSiblings()) {
				visitNode(sibling, visitedNodes);
			}
		}
	}
}