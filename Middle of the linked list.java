class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode low = head;        
        ListNode high = head;
        if(head == null) return head;
        while(high!= null && high.next!=null){
            low = low.next;
            high = high.next.next;
        }
        return low;
    }
}
