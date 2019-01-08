package main.Array;
//无序数组
public class NoOrderArray implements Array{
    private String[] noOrderArray;
    private int length = 0;

    //构造一个长度为max的数组，该数组长度是固定的，这也是数组和arrlylist的区别
    public NoOrderArray(int max){
        noOrderArray = new String[max];
    }

    @Override
    //重载一下find（）方法，能够根据给的方法的元素查找，不给元素怎么知道查什么
    public int find(String element) {
        while(length != 0){
            //int index = 0;
            for(int i=0; i<length; i++ ){
                if (noOrderArray[i].equals(element));
                return i;
            }
        }
        return -1;
    }

    @Override
    public void insert(String element) {
        noOrderArray[length] = element;
        length++;
    }

    //删除指定元素，即该元素后的所有元素下标减1
    @Override
    public void delete(String element) {
        int target = find(element);
        for(int i = target; i<length-1; i++){
            noOrderArray[i] = noOrderArray[++i];
        }
        length--;
    }

    @Override
    public void display() {
        for(int i=0; i<length; i++){
            System.out.println(noOrderArray[i]+ " ");
        }
    }
}
