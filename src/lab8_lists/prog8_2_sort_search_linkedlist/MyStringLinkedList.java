package lab8_lists.prog8_2_sort_search_linkedlist;

import lab8_lists.prog8_1_sort_search_arr.MyStringList;

public class MyStringLinkedList {
	Node header;

	MyStringLinkedList() {
		header = new Node(null, null, null);
	}

	public void addFirst(String item) {
		Node n = new Node(header.next, header, item);
		if (header.next != null) {
			header.next.previous = n;
		}
		header.next = n;

	}

	void printNodes() {
		Node next = header.next;
		if (next == null)
			System.out.println("");
		else {
			String s = next.toString();
			System.out.println(s);
		}
	}

	public void add(String item) {
		Node n = new Node(header.next, header, item);
		if (header.next != null) {
			header.next.previous = n;
		}
		header.next = n;

	}

	// inserts a new Node containing data so that its
	// position in the list is now pos
	void insert(String data, int pos) {
		Node insertNode = new Node(null, null, data);
		Node prev = header;
		Node nex = header.next;
		int position = 0;
		while (nex != null) {
			position++;
			if (position == pos) {
				prev.next = insertNode;
				insertNode.next = nex;
				nex.previous = insertNode;
				insertNode.previous = prev;
			}
			prev = nex;
			nex = nex.next;
		}

	}

	// attempts to remove the first Node that contains
	// data; if successful, returns true; otherwise, false.
	boolean remove(String data) {
		Node prev = header;
		Node nex = header.next;
		while (nex != null) {
			if (nex.value.equals(data)) {
				nex.next.previous = prev;
				prev.next = nex.next;
				nex = null;
				return true;
			}
			prev = nex;
			nex = nex.next;
		}
		return false;

	}

	// recursively attempts to find a String in some Node in the
	// list; returns true if found, false otherwise
	boolean recurSearch(String data) {
		if (data == null)
			return false;
		// start node for searches is header.node
		Node node = header.next;
		while (node != null) {
			if (data.equals(node.value)) {
				return true;
			}
			node = node.next;
		}
		return false;

	}

	public void sort() {
		Node nex = header.next;
		while (nex != null) {
			Node nextMinNode = minNode(nex);
			swap(nex, nextMinNode);
			nex = nex.next;
		}
	}

	// find minimum of array between the indices bottom and top
	// return location of minimum, not the minimum itself
	public Node minNode(Node n) {

		Node minNode = n;
		Node nex = n.next;
		while (nex != null) {
			if (nex.value.compareTo(minNode.value) < 0) {
				minNode = nex;
			}
			nex = nex.next;
		}
		return minNode;
	}

	void swap(Node n1, Node n2) {
		String tempValue = n1.value;
		n1.value = n2.value;
		n2.value = tempValue;
	}

	class Node {
		String value;
		Node next;
		Node previous;

		Node(Node next, Node previous, String value) {
			this.next = next;
			this.previous = previous;
			this.value = value;
		}

		@Override
		public String toString() {
			if (value == null)
				return "";
			StringBuilder sb = new StringBuilder(value + " ");
			sb = toString(sb, next);
			return sb.toString();
		}

		private StringBuilder toString(StringBuilder sb, Node n) {
			if (n == null)
				return sb;
			sb.append(n.value + " ");
			return toString(sb, n.next);
		}

	}

	public static void main(String[] args) {
		MyStringLinkedList list = new MyStringLinkedList();
		list.add("big");
		list.add("small");
		list.add("tall");
		list.add("short");
		list.add("round");
		list.add("square");
		list.add("enormous");
		list.add("tiny");
		list.add("gargantuan");
		list.add("lilliputian");
		list.add("numberless");
		list.add("none");
		list.add("vast");
		list.add("miniscule");
		
		list.printNodes();
		list.sort();
		System.out.println("After sorting array string: ");
		list.printNodes();
		System.out.println("Search for \"number\": " + list.recurSearch("number"));
		System.out.println("Search for \"tiny\": " + list.recurSearch("tiny"));
	}
}
