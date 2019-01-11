package main.binaryTree;

//树的节点分装类
public class Node {
    int value;
    Node leftChild;
    Node rightChild;

    public Node(int value){
        this.value = value;
    }

    //打印该节点的信息
    public void displayNode(){
        System.out.println("value="+value);
    }
}
