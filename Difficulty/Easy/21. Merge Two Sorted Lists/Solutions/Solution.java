class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int data) {
        this.val = data;
    }
}

class Solution {
    public static ListNode solution(ListNode list1, ListNode list2) {
        ListNode lst, temp;
        temp = new ListNode();
        lst = temp;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        if (list1 != null) {
            temp.next = list1;
        } else {
            temp.next = list2;
        }

        return lst.next;
    }
}