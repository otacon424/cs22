package chapter8;

import javax.swing.text.Position;
import java.util.ArrayList;

//Node structure
class Node {
    int data;
    Node left;
    Node right;

    Node(int v)
    {
        data = v;
        left = null;
        right = null;
    }
} //end Node


public class exercise4 {
    static void postOrder(Node node, ArrayList<Integer> res) {
        if (node == null) {
            return;
        }

        postOrder(node.left, res);
        postOrder(node.right, res);
        res.add(node.data);
    }//end postOrder

    static void preOrder(Node node, ArrayList<Integer> res)
    {
        if(node == null)
        {
            return;
        }

        res.add(node.data);

        preOrder(node.left, res);
        preOrder(node.right, res);

    }//end preOrder

    static void inOrder(Node node, ArrayList<Integer> res)
    {
        if(node == null)
        {
            return;
        }

        inOrder(node.left, res);

        res.add(node.data);

        inOrder(node.right, res);
    }//end inOrder

    public static void main(String[] args)
    {
        Node root = new Node(19);
        root.left = new Node(47);
        root.right = new Node(63);
        root.left.left = new Node(23);
        root.left.right = new Node(-2);
        root.left.right.left = new Node(55);
        root.right.right = new Node(94);
        root.right.right.right = new Node(28);

        ArrayList<Integer> result = new ArrayList<>();
        System.out.println("inOrder");
        inOrder(root, result);
        for(int value: result)
        {

            System.out.println(value + " ");}

//        System.out.println("PreOrder");
//        preOrder(root, result);
//
//        for(int valu : result)
//        {
//
//            System.out.println(valu + " ");}

//        System.out.println("Post Order");
//        postOrder(root, result);
//
//        for(int val : result)
//            System.out.println(val + " ");
    }

}
