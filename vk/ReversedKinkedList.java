package vk;


public class ReversedKinkedList {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        while (current != null) {
            next = current.next; // Store the next node
            current.next = prev; // Reverse the pointer of the current node
            // Move pointers one position ahead
            prev = current;
            current = next;
        }
        // After loop, 'prev' will be pointing to the new head
        return prev;
    }
}
