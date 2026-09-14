
class ListNode {
    @SuppressWarnings("unused")
    int data;
    ListNode next;

    @SuppressWarnings("unused")
    ListNode(int value) {
        this.data = value;
    }
}

class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) {
                return true;
            }
        }
        return false;
    }
}