package main.Array;
//有序数组。从小到大递增排列
public class OrderArray implements Array{
    private int[] orderArray;
    private int length = 0;

    public OrderArray(int max){
        orderArray = new int[max];
    }
    public OrderArray(int[] orderArray){
        this.orderArray=orderArray;
        this.length = orderArray.length;
    }

    //用二分查找法定位元方法素，存在返回下标，不存在返回-1；
    @Override
    public int find(String element) {
        return 0;
    }
    public int find(int element) {
        while (length !=0){
            //有两个以上元素
            while (length >1){
                int left = 0;
                int right = length-1;
                int mid = (left + right)/2;
                while(left <= right) {
                    if(element == orderArray[mid]) return mid;
                    else if(element > orderArray[mid]) {
                        left = mid+1;
                        mid = (left + right)/2;
                    }
                    else if(element < orderArray[mid]){
                        right = mid-1;
                        mid = (left + right)/2;
                    }
                }
                return -1;
            }
            //只有一个元素，判断是否和第一个元素相等
           if(orderArray[0]==(element))
               return 1;
           else return -1;
        }
        return -1;
    }



    @Override
    public void insert(String element) {

    }

    @Override
    public void delete(String element) {

    }

    @Override
    public void display() {

    }
}
