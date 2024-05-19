class MaximumTwinSum {
    public int pairSum(ListNode head) {
        if(head == null) {
            return 0;
        }

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next !=null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        int max=0;
        ListNode start = head;
        slow.next = reverse(slow.next);
        while(slow.next != null){
            max = Math.max(start.val+slow.next.val, max);
            slow = slow.next;
            start = start.next;
        }

        return max;
        
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = head;

        while(next != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
