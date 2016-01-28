public class problem26 {
	
	public void remove(String frodo, Node bilbo) {
		Node temp = bilbo;
		Node temp2 = bilbo;
		
		while (temp.item.equals(frodo)) {
		temp = temp.next;
		temp2 = null;
		temp2 = temp;
		}
		
		while (temp != null) {
			if (temp.next.item.equals(frodo)) {
				temp.next = temp.next.next;
			}
			temp = temp.next;
		}
	}
}