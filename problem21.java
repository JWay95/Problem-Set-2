public class problem21 {
	public boolean find(String panda) {
		Node temp = first;
		
		while (temp != null) {
			if (temp.item.equals(panda))
				return true;
			else
				temp = temp.next;
		}
		return false;
	}
}
