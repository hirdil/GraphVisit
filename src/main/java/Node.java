import java.util.LinkedHashSet;
import java.util.Set;

public class Node {
	private final Set<Node> _siblings = new LinkedHashSet<>();
	private final char _id;

	public Node(char id) {
		_id = id;
	}

	public void addSibling(Node sibling) {
		getSiblings().add(sibling);
	}

	public char getId() {
		return _id;
	}

	@Override
	public String toString() {
		return Character.toString(getId()); // + getSiblings() + "\n";
	}

	public Set<Node> getSiblings() {
		return _siblings;
	}
}
