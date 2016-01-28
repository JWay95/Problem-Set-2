public class problem25 {

	public void insertAfter(Node x, Node y) {
		if (x = null)
			;
		else if (y = null)
			;
		else {
			Node tempx = x.next;
			x.next = y;
			Node tempy = y.next;
			while (tempy != null) {
				tempy = tempy.next;
			}
			tempy.next = tempx;
		}
	}
}