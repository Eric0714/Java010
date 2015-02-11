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

        //打印等腰三角形
        /*for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 9 + i; j++) {       //首先找出j的取值范围(一般均是i的函数)
                if (j <= 10 - i) {                  //接着找出j在什么情况下打印什么(通常也是i的函数)
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }*/

        //打印等腰三角形的另一种写法                   //对于二维图形的打印一般均有这么两种写法
        /*for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

        //三重循环打图形
        /*for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 3; j++) {
                for (int k = 1; k <= 4; k++) {
                    System.out.print("*");
                }
                System.out.print("!");
            }
            System.out.println();
        }*/
        //上面的code可以简化写成：
        /*for (int i = 0; i < 2; i++) {
            for (int j = 1; j <= 15; j++) {
                if (j % 5 == 0)
                    System.out.print("!");
                else
                    System.out.print("*");
            }public class Strange {
    public static final int MAX = 5;

    //当每行包含三个符号时，if的复杂度增加
        /*int n=4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=4*n-2 ; j++) {
                if (j<=2*i-2){
                    System.out.print("\\");
                }else if (j>=4*n+1-2*i && j<=4*n-2){
                    System.out.print("/");
                }else
                    System.out.print("!");
            }
            System.out.println();
        }*/

        //Fibonacci数列
        /*int result=0;
        int n=12;
        int small=1, big=1;
        if (n<=2){
            result=1;
        }else {
            for (int i =3; i <= n; i++) {                //i用来计下当前index，small记录较小的数，big记录较大的数
                result=small+big;
                small=big;                              //每次算完之后small移向big,big移向result的位置，result移向下一个位置
                big=result;
            }
        }
        System.out.println(result);*/

        //三重循环打印重复数字
        /*int n=5;
        for (int i = 1; i <= n; i++) {
            for (int k = 9; k >=0; k--) {
                for (int l = 1; l <= n; l++) {
                    System.out.print(k);
                }
            }
            System.out.println();
        }*/

        /*for (int i = 1; i <= 4; i++) {
            for (int k = 9; k >0; k--) {
                for (int l = 1; l <= k; l++) {
                    System.out.print(k);
                }
            }
            System.out.println();
        }*/

        //打印矩形中的等边三角形
        /*for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=11 ; j++) {
                if (j<=6-i){                            //考虑两边的边界比考虑中间的边界要容易
                    System.out.print("-");
                }else if (j>=6+i){
                    System.out.print("-");
                }else {
                    System.out.print(2 * i - 1);
                }
            }
            System.out.println();
        }*/

        //二维数组XOXO初始化笨办法
        /*char[][] board=new char[8][8];
        for (int row = 0; row <8 ; row++) {
            for (int cell = 0; cell <8 ; cell++) {
                if (row%2==0){
                    if (cell%2==0){
                        board[row][cell]='X';
                    }else {
                        board[row][cell]='O';
                    }
                }else {
                    if (cell%2==0){
                        board[row][cell]='O';
                    }else {
                        board[row][cell]='X';
                    }
                }
            }
            System.out.println();
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }*/

        //二维数组初始化聪明解法
        /*int n=8;
        char[][] board=new char[n][n];
        for (int row = 0; row < n; row++) {
            for (int cell = 0; cell < n; cell++) {
                board[row][cell]= (row+cell)%2==0?'X':'O';
            }
        }
        for (int row = 0; row < n; row++) {
            String rowString = new String(board[row]);
            System.out.println(rowString);
        }*/

        //二维数组的理解
        /*int n=3;
        int[][] myArray = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                myArray[i][j]=i+j;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(myArray[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {         //二堆数组中，第一维数组里存的是地址(数组类型变量)，每一个地址都指向一个第二维的数组，二维数组的本质是“数组的数组”
            System.out.println(myArray[i]);
        }
        System.out.println(myArray);*/

        //使用字符数组按单词反转字符串(上课后自己练习写的)
        /*String string = "this is a correct but not an excellent code";
        char[] charArray = string.toCharArray();
        System.out.println(charArray);        //字符数组可以通过数组类型变量直接访问(注意与上题的不同)
        Reverse.reverse(charArray, 0, charArray.length - 1);    //需要调用reverse函数
        System.out.println(charArray);
        int start = 0;
        int end;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' ') {
                end = i;
                Reverse.reverse(charArray, start, end - 1);
                start = end + 1;
            }
        }
        Reverse.reverse(charArray, start, charArray.length - 1);
        System.out.println(charArray);*/
        //老师的解法
        /*int startIndex = 0;
        int endIndex = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' ') {
                endIndex = i - 1;
                Reverse.reverse(charArray, startIndex, endIndex);
                startIndex = i + 1;
            } else if (i == charArray.length - 1) {
                endIndex = i;
                Reverse.reverse(charArray, startIndex, endIndex);
                startIndex = i + 1;
            }
        }
        System.out.println(charArray);*/

         //''和""造成数据类型不同，因而操作也不同
        /*System.out.print(1 + 'x' + 2 + "=" + 1 * 2 + '\t');
        System.out.println(1 + "x" + 2 + "=" + 1 * 2 + '\t');
        System.out.println('x');
        System.out.println('x'+'y');*/

        //foreach用法，迭代变量是数组元素的一个副本
        /*int[] myArray = new int[10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i]=i*10;
        }
        for (int finger : myArray){
            System.out.println(finger);
        }
        for (int item:myArray){
            item--;
        }
        for (int e:myArray){
            System.out.println(e);
        }*/
        //foreach用法，当数组元素为引用类型变量时的不同
        /*Student[] students = new Student[10];
        for (int i = 0; i < 10; i++) {
            students[i]=new Student();
            students[i].score=i*10;
        }
        for (Student finger : students){
            finger.score=finger.score+1;
        }
        for (Student finger : students){
            System.out.println(finger.score);
        }*/
        //引用变量初始赋值时只能用for的index用法，不能用foreach赋值
        /*int n=4;
        Student[] students = new Student[n];
        *//*for (Student item : students){
            item = new Student();   //虽然看似为每个数组元素都创建了一个实例并赋值，但实际上只是为数组元素的copy创建了实例，创建出的实例无法传给真正的数组元素
            item.score=100;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(students[i].score);
        }*//*
        for (int i = 0; i < n; i++) {
            students[i]=new Student();  //当需要访问真正的数组元素时，必须要用for的index用法，基本类型的数组也是一样
            students[i].score=i*10;
        }
        for (Student e : students){
            System.out.println(e.score);
        }*/
    }
}
/*class Reverse{
    public static void reverse(char[] charArray, int start, int end){
        while (start<end){
            char temp;
            temp=charArray[start];
            charArray[start]=charArray[end];
            charArray[end]=temp;
            start++;
            end--;
        }
    }
}*/

/*class Student{
    public int score;
}*/
