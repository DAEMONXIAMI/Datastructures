package main.binaryTree;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;

//树的节点分装类
public class Node {
    int value;
    Node leftChild;
    Node rightChild;

    public Node(int value) {
        this.value = value;
    }

    //打印该节点的信息
    @Test
    public void displayNode() {
       // System.out.println("value=" + value);
        HashSet b = new HashSet();
        b.add(1);
        Iterator iterator = b.iterator();
        int i = (int) iterator.next();
        System.out.println(i);
    }
}
