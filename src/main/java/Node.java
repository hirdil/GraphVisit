import java.util.LinkedHashSet;
import java.util.Set;

public class Node {
	private final char _id;
	private final Set<Node> _siblings = new LinkedHashSet<>();

	public Node(final char id) {
		_id = id;
	}

	public void addSibling(final Node sibling) {
		getSiblings().add(sibling);
	}

	public char getId() {
		return _id;
	}

	public Set<Node> getSiblings() {
		return _siblings;
	}

	@Override
	public String toString() {
		return Character.toString(getId()); // + getSiblings() + "\n";
	}
}
