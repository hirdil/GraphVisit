import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Graph {
	private final Set<Edge> _edges = new LinkedHashSet<>();
	private final String _id;

	public Graph(final String id) {
		_id = id;
	}

	public Graph(final String id, final Edge... edges) {
		_id = id;
		getEdges().addAll(Arrays.asList(edges));
	}

	public void addEdge(final Edge edge) {
		getEdges().add(edge);
	}

	public Set<Edge> getEdges() {
		return _edges;
	}

	public String getId() {
		return _id;
	}

	@Override
	public String toString() {
		return getEdges() + "\n";
	}
}