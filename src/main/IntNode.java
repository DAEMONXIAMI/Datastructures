package main;

public class IntNode {
    public Integer info;//标号,从0开始
    public int value;//值
    public IntNode nextIntNode; //下一个节点

    //构造方法，每次给出下一个节点的值
    public IntNode(int value){
        if(info == null) {
            info = 0;

        }
    }
}
