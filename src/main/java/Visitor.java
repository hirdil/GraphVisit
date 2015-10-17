import java.util.LinkedHashSet;
import java.util.Set;

public class Visitor {
	private final static Set<Node> _visited = new LinkedHashSet<>();

	public static void main(String[] args) {
		Node a = new Node('a');
		Node b = new Node('b');
		Node c = new Node('c');
		Node d = new Node('d');
		Node e = new Node('e');
		Node f = new Node('f');
		Node g = new Node('g');
		Node h = new Node('h');
		Node i = new Node('i');

		Edge ab = new Edge(a, b);
		Edge ad = new Edge(a, d);
		Edge be = new Edge(b, e);
		Edge bc = new Edge(b, c);
		Edge ec = new Edge(e, c);
		Edge ef = new Edge(e, f);
		Edge cg = new Edge(c, g);
		Edge fg = new Edge(f, g);
		Edge gh = new Edge(g, h);
		Edge gi = new Edge(g, i);

		Graph graph = new Graph("test", ab, ad, be, bc, ec, ef, cg, fg, gh, gi);
		System.out.println(visitGraph(graph).toString());

	}

	private static void visitNode(Node node) {
		boolean newVisiting = _visited.add(node);
		if (newVisiting) {
			for (Node sibling : node.getSiblings()) {
				visitNode(sibling);
			}
		}
	}

	private static Set<Node> visitGraph(Graph graph) {
		//random start element
		Node start = graph.getEdges().iterator().next().getNode1();
		visitNode(start);
		return _visited;
	}
}