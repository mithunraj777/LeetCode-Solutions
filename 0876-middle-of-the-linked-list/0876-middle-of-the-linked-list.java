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
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        ListNode t=head;
        int pos = 0;
        while(t.next!=null){
            t=t.next;
            pos++;
        }
        int l=pos/2;
        if(pos%2==0){
            for (int i = 0; i <l; i++) {
                temp = temp.next;
            }
        }
        else{
            for (int i = 0; i <l+1; i++) {
                temp = temp.next;
            }
        }
        return temp;
    }
}