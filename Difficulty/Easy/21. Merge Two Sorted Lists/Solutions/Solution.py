class ListNode:
    def __init__(self, data):
        self.data = data
        self.next = None
        
class Solution:
    def solution(list1 : ListNode, list2 : ListNode) -> ListNode:
        lst = temp = ListNode(0)
        
        while list1 and list2:
            if list1.data < list2.data:
                temp.next = list1
                list1 = list1.next
            else:
                temp.next = list2
                list2 = list2.next
            temp = temp.next
        if list1:
            temp.next = list1
        if list2:
            temp.next = list2
        return lst.next