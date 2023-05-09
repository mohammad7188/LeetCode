public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode low = head;
        ListNode high = head;
        while(high!=null && high.next!=null){
            low = low.next;
            high = high.next.next;
            if(low == high) break;
        }
        if(high == null || high.next == null) return null;
        low = head;
        while(high != low){
            low = low.next;
            high = high.next;
        }
        return low;
    }
}
