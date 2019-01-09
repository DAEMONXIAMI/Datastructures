package main.link;

//单向链表
public class LinkList {
    private Node first =null;//指向链表中的第一个链接点

    //向尾部插入一个节点
    public void insert(int info){
        Node stat = first;
        if (stat == null){
            first = new Node(info);
        }
        while (stat.next !=null){
            stat = stat.next;
        }
        stat.next = new Node(info);

    }
    //删除一个节点
    public Boolean delete(int info){
        Node stat = first;
        if(stat ==null) return false;
        if(stat.info == info){
            stat
        }
    }

    //根据查找一个节点，返回一个布尔值

    //打印所有节点
}
