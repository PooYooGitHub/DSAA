package day3;

/**
 * author:
 * data:2024/3/17 13:23
 * function:
 * time:
 */
public class Ques5 {
     public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if (head==null||head.next==null){
                return head;
            }
            ListNode list=head;
            while (list.next!=null){
                if (list.val==list.next.val){
                    if (list.next.next!=null){
                        list.next=list.next.next;
                    }
                    else list.next=null;
                }
                list=list.next;
            }
            return null;
        }
    }
}
