package main.link;

public class Node {
    public int info;//当前节点的值
    public Node next;//指向下个节点的对象
    public Node(int i){
        this(i, null);
    }
    public Node(int i, Node next){
        info = i;
        this.next = next;
    }
}
