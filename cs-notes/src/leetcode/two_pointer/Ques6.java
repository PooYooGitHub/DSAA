package leetcode.two_pointer;

/**
 * author:
 * data:2024/3/15 18:40
 * function:
 * time:18 min
 */
public class Ques6 {
      class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }

    public class Solution {
        public boolean hasCycle(ListNode head) {
            ListNode h1=head;
            ListNode h2=head;
            while(h2!=null&&h2.next!=null&&h2.next.next!=null){
                h1=h1.next;
                h2=h2.next.next;
                if (h1==h2){
                    return true;
                }
            }
            return false;
        }
    }
}
