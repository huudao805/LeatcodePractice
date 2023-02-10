package sorting;

public class _21_MergeTwoSortedLists {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode head = null;
        ListNode temp = null;

        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                if(head == null) {
                    head = l1;
                    temp = l1;
                } else{
                    temp.next = l1;
                    temp = l1;
                }
                l1 = l1.next;
            } else {
                if(head == null) {
                    head = l2;
                    temp = l2;
                } else{
                    temp.next = l2;
                    temp = l2;
                }
                l2 = l2.next;
            }
            if(l1 != null) temp.next = l1;
            if(l2 != null) temp.next = l2;
        }
        return head;
    }

    public static void main(String[] args) {

    }
}
