package chapter6;

import java.util.ArrayList;
import java.util.*;
//Node structure
class Node {
    char data;
    Node left;
    Node right;

    Node(char v)
    {
        data = v;
        left = null;
        right = null;
    }
} //end Node

public class exercise1 {

    public static void main(String[] args)
    {
        Stack<String> s = new Stack<String>();
        Queue<String> q = new LinkedList<String>();

        s.push("how");
        s.push("are");
        s.push("you");
        while(!s.isEmpty())
        {
            q.add(s.pop());
        }
        System.out.println(q);
    }
}
