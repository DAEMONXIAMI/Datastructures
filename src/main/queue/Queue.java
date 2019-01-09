package main.queue;

public class Queue {
    private int[] queue;
    private int maxSize;
    public int front = 0;//头元素下标
    public int rear = 0;//尾元素下标
    private int length = 0;//队列changdu

    //构造一个大小为maxSize的队列
    public Queue(int maxSize){
        queue = new int[maxSize];
        this.maxSize = maxSize;
    }

    //插入
    public void insert(int elem) {
        if(isFull()){
            System.out.println("队列已满，不能添加");
        }
        if(rear == maxSize-1); rear = 0;
        queue[rear] = elem;
        length++;
    }

    //删除
    public int remove() throws Exception {
        if(isEmpty()) throw new Exception("队列为空，不能移除");
        int elem = queue[front];
        if (front == maxSize) front = 0;
        else front++;
        length--;
        return elem;
    }

    //查看头元素
    public int peek()throws Exception{
        if(isEmpty()) throw new Exception("队列内没有元素");
        return queue[front];
    }

    //获取队列长度
    public int size(){
        return length;
    }

    //判断是否为空
    public boolean isFull(){
        return (length==0);
    }

    public boolean isEmpty(){
        return  (length == maxSize);
    }
}
