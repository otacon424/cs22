/*
Exercise 3.2

Write a method transferFrom that accepts a second LinkedIntList as a parameter and that moves values from the second list to this list.
You are to attach the second list's elements to the end of this list. You are also to empty the second list. For example,
suppose two lists store these sequences of values:

list1: [8, 17, 2, 4]
list2: [1, 2, 3]

The call of list1.transferFrom(list2); should leave the lists as follows:

list1: [8, 17, 2, 4, 1, 2, 3]
list2: []

The order of the arguments matters; list2.transferFrom(list1); would have left the lists as follows:
list1: []
list2: [1, 2, 3, 8, 17, 2, 4]

Either of the two lists could be empty, but you can assume that neither list is null.
You are not to create any new nodes. Your method should simply change links of the lists to join them together.

Assume that you are adding this method to the LinkedIntList class as defined below:
public class LinkedIntList {
    private ListNode front;   // null for an empty list
    ...
}
Note: You only need to create a method and not a full program. You can use blueJ to test and ensure successful implementation but only submit the method.

Sample test:
test 1: [1, 2] transferFrom [3, 4]
value: front -> [1] -> [2] -> [3] -> [4] /
value: front /
result: pass
test #2: [3, 4] transferFrom [1, 2]
value: front -> [3] -> [4] -> [1] -> [2] /
value: front /
result: pass

 */
package chapter3;
import chapter3.LinkedIntList;
public class exercise2 {

    public static void main(String[] args)
    {
        LinkedIntList list1 = new LinkedIntList();
        list1.insert(1);
        list1.insert(2);
        list1.display();

        LinkedIntList list2 = new LinkedIntList();
        list2.insert(3);
        list2.insert(4);
        list2.display();

        list1.transferFrom(list2);
        list1.display();
        list2.display();

    }//end main
}
