package code300BaiThieuNhi;

public class MergeTwoSortedLists {
	
	public static class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	 
	public static void main(String[] args) {
		ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);	
        
        ListNode headResultList = MergeTwoSortedLists(list1, list2);
        System.out.println("ket qua: " );
        while(headResultList != null) {
        	System.out.print(headResultList.val + "\t" );
        	headResultList = headResultList.next;
        }
	}
	
	public static ListNode MergeTwoSortedLists(ListNode list1, ListNode list2) {
		ListNode headResultList = new ListNode(-1);
		ListNode current = headResultList;
		
		while(list1 != null && list2 != null) {
			if(list1.val <= list2.val) {
				current.next = list1;
				list1 = list1.next;
			}
			else {
				current.next = list2;
				list2 = list2.next;
			}
			current = current.next;
		}
		
		if(list1 != null) {
			current.next = list1;
		} else {
			current.next = list2;
		}
		return headResultList.next;
	}

}
