package test;

import main.Array.OrderArray;
import org.junit.jupiter.api.Test;

public class TestClass {
   public static void main(String[] args){

       long startTime = System.currentTimeMillis();
       /*要测试的程序
        */
       long endTime = System.currentTimeMillis();
       System.out.println("程序运方法行的时间是："+(endTime - startTime)+"毫秒" );
   }

    @Test
    public void test1(){

        int[] a = {0,1};
        OrderArray orderArray = new OrderArray(a);
        System.out.println(orderArray.find(1));

   }
}
