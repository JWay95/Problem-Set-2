public class problem20 {

		public void delete(int k) {
			Node temp = first;
			
			if (k == 1) {
				first = first.next;
				temp = null;
			}
			
			for (int x = 2; x < k; x++) {
				if (temp != null) 
					temp = temp.next;
			}
			
			temp.next = temp.next.next;
		}
}