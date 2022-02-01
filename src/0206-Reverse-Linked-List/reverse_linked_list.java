package 0206-Reverse-Linked-List;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class reverse_linked_list {
    public ListNode reverseList(ListNode head) {
        ListNode res = null;

        while(head != null){
            ListNode nex = head.next;
            head.next = res; //which is null at begining;
            res = head;
            head = nex;
        }

        return res;
    }
}
