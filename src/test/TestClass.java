package test;

import main.Array.OrderArray;
import main.sort.*;
import org.junit.Test;


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

        int array[] = {6,5,1,26,6,6,5,8,2,4,55,6,0};
        Quick.sort(array);
        for(int a :array)
        System.out.print(a+" ");

   }
}
