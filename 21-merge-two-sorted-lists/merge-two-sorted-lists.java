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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // ListNode dummy = new ListNode(-1);
        // ListNode tail = dummy;

        // while (list1 != null && list2 != null) {
        //     if (list1.val <= list2.val) {
        //         tail.next = list1;   // splice node from l1
        //         list1 = list1.next;
        //     } else {
        //         tail.next = list2;   // splice node from l2
        //         list2 = list2.next;
        //     }
        //     tail = tail.next;
        // }

        // // Attach the remaining nodes, if any
        // if (list1 != null) {
        //     tail.next = list1;
        // } else {
        //     tail.next = list2;
        // }

        // return dummy.next;  // the merged list starts after the dummy node
            ListNode dummy=new ListNode(-1);
            ListNode tail=dummy;
            while(list1!=null&&list2!=null){
                if(list1.val<=list2.val){
                    tail.next=list1;
                    list1=list1.next;
                }
                else{
                    tail.next=list2;
                    list2=list2.next;
                }
                tail=tail.next;
            }
            while(list1!=null){
                tail.next=list1;
                list1=list1.next;
                tail=tail.next;
            }
            while(list2!=null){
                tail.next=list2;
                list2=list2.next;
                tail=tail.next;
            }
            return dummy.next;
    }

    }
