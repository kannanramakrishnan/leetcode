class DeleteMiddleNode {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next == null)
        return null;

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = head;

        while(fast!=null && fast.next!=null)
        {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        prev.next = slow.next;

        return head;
        
    }
}
