package org.waspec;

public class Main {

    public static void main(String[] args) {
        // 算法题

        // 打印100以内所有奇数
        /*for (int i = 1; i <= 100; i++) {    //循环条件内只负责扫描全范围
            if (i % 2 == 1)                 //循环体内负责判断具体条件/实现定义
                System.out.println(i);      //for和if各司其职
        }*/

        //打印矩阵
        /*for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("@");
            }
            System.out.println();*/

        //打印三角形
        /*for (int i = 0; i < 10; i++) {        //外层循环负责行
            for (int j = 0; j <=i; j++) {     //内层循环负责列
                System.out.print("@");
            }
            System.out.println();             //外层循环折行
        }*/

        //打印九九乘法表
        /*for (int i = 1; i < 10; i++) {
            for (int j = 1; j <=i; j++) {      //双层循环控制的是结构
                System.out.print(j + "x" + i + "=" + i * j+"\t");
                System.out.printf("%dx%d=%d\t",j,i,i*j );  //具体打印的东西由表达式控制
            }
            System.out.println();
        }*/

        //另一个三角形
        /*int n=5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j<n-1-i){
                    System.out.print(" ");
                }else{
                    System.out.print("@");
                }
            }
            System.out.println();
        }*/

        //一个循环+一个数组   通过循环给数组赋值
        /*int[] myArray =  new int[10];
        for (int i = 0; i < 10; i++) {        //最容易犯的错是下标越界
            myArray[i]=i+1;
            System.out.println(myArray[i]);
        }*/

        //反转数组(解法一)
        /*int[] myArray={2,3,5,3,2,5,6,6,9,1};
        int n=10;
        for (int i = 0; i < n/2; i++) {
            int temp=myArray[i];
            myArray[i]=myArray[n-1-i];
            myArray[n-1-i]=temp;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(myArray[i]);
        }*/

        //反转数组(解法二)
        /*int[] myArray={2,3,5,3,2,5,6,6,9,1};
        int leftIndex = 0;
        int rightIndex = myArray.length-1;
        while (leftIndex<rightIndex){
            int temp=myArray[leftIndex];
            myArray[leftIndex]=myArray[rightIndex];
            myArray[rightIndex]=temp;
            leftIndex++;
            rightIndex--;
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }*/

        //做错的题
        /*for (int i = 1; i <= 3; i++)
            System.out.println("How many lines");
            System.out.println("are printed?");*/
    }
}
