package test;

import main.Array.OrderArray;
import main.sort.*;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Stack;


public class TestClass {
   public static void main(String[] args){

       long startTime = System.currentTimeMillis();
       /*要测试的程序
        */
       //test1();
       long endTime = System.currentTimeMillis();
       System.out.println("程序运方法行的时间是："+(endTime - startTime)+"毫秒" );
   }

    @Test
    public  void test1(){

        int array[] = {6,5,1,26,6,6,5,8,2,4,55,6,0};
        Quick quick = new Quick();
        quick.sort2(array);
        for(int a :array)
        System.out.print(a+" ");

   }

    @Test
    public void test2() {
        String s = "a";
        String t = "b";
        System.out.println(isAnagram(s,t));
    }
    public boolean isAnagram(String s, String t) {
        char[] cs = s.toCharArray();
        char[] ct = s.toCharArray();
        Arrays.sort(cs);
        Arrays.sort(ct);
        return String.valueOf(cs).equals(String.valueOf(ct));
    }
}
