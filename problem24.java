public class problem24 {
	public void removeAfter(Node x) {
		if (x = null)
			;
		else if (x.next = null)
			x = null;
		else
			x.next = x.next.next;
	}
}
