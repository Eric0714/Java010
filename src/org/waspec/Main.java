package org.waspec;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;
import java.nio.Buffer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.ExecutionException;

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

        //二维数组棋盘初始化笨办法
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
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }*/

        //二维数组棋盘初始化聪明解法
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
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println(board[i]);
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
        //用while会更容易理解一些
        /*int left=0;
        int right=0;
        while (right<charArray.length){
            if (charArray[right]==' '){
                Reverse.reverse(charArray,left,right-1);
                left=right+1;
            }
            right++;
        }
        Reverse.reverse(charArray,left,right-1);
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
        //数组初始赋值时只能用for的index用法，不能用foreach赋值(不管是基本类型的数组还是引用类型的数组)
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

        //把-6到38中的所有奇数放在一个数组中
        /*int n=0;
        for (int i = -6; i <=38; i++) {
            if (i%2==1||i%2==-1){
                n++;
            }
        }
        System.out.println(n);
        int[] odds = new int[n];
        int index=0;
        for (int i = -6; i <=38; i++) {
            if (i%2==1||i%2==-1){
                odds[index]=i;
                index++;
            }
        }
        for (int item : odds){
            System.out.println(item);
        }*/

        //switch语句的用法和陷阱
        /*int x=100;
        switch (x){
            default:                         //default可以位于任何地方，但一定是最后判断，但平时写代码时default一定放在最后
                System.out.println("????");
            case 99:
            case 98:
            case 97:
                System.out.println("就差一点儿");   //不加break的陷阱
            case 80:
                System.out.println("还差不少");
                break;
            case 60:
                System.out.println("刚刚及格");
                break;
            case 40:
                System.out.println("你爸电话");
                break;
        }*/

        //利用switch语句将数字分数转换成字母分数(0-40为D，41-60为C，61-80为B，81-100为A)
        /*int score=89;
        switch ((score-1)/20){    //不要忘了有整除  当没法一个个列举时，就要想办法把细碎的数进行分段
            case 0:              //这里不严谨，当score为-1到-18时也会打印出“D”，但这题如果用switch来写的话怎么着都会不严谨
            case 1:              //case语句里可以继续嵌套switch语句，但平时忌讳if套if,switch套switch
                System.out.println("D");
                break;
            case 2:
                System.out.println("C");
                break;
            case 3:
                System.out.println("B");
                break;
            case 4:
                System.out.println("A");
                break;
            default:
                System.out.println("Error");
                break;
        }*/

        //链表
        /*Node node = new Node(10);
        node.next=new Node(20);
        node.next.next=new Node(30);
        node.next.next.next=new Node(40);
        Node current = node;        //这里增加一个current变量，是为了不破坏原来的node变量。如果直接用node迭代，在循环结束后node失去了对整个链表的引用，整个链表就会成为垃圾
        do {
            System.out.println(current.payload);
            current = current.next;
        }while (current!=null);*/

        //二叉树
        /*TreeNode root=new TreeNode(100);
        root.leftChild=new TreeNode(200);
        root.rightChild=new TreeNode(300);
        System.out.println(root.leftChild.payload);
        System.out.println(root.rightChild.payload);*/

        //找出int类型数组中最长连续数的长度
        //上完课之后我自己思考得到的解法
        /*int[] intArray = {1, 1, 1, 2, 2, 3, 3, 3, 3, 3, 3};
        int start=0;
        int end=0;
        int length=0;
        while (end<intArray.length){
            if (intArray[end]==intArray[start]){
                end++;
            }else {
                if ((end-start)>length){
                    length=end-start;
                }
                start=end;
                end++;
            }
        }
        if ((end-start)>length) {      //如果end移动到最后一个数时还没有计数完毕，要在跳出循环后再判断一次最后一批数的长度
            length = end - start;      //一定不要漏掉考虑边界的情况
        }
        System.out.println(length);*/
        //老师的解法
        /*int[] intArray = {1, 1, 1, 2, 2, 3, 3, 3, 3, 3, 3};
        int result;
        if (intArray==null || intArray.length==0){
            result=0;
        }
        int startIndex=0;
        int endIndex=0;
        int delta=0;
        while (endIndex<intArray.length){
            int temp=0;
            if (intArray[endIndex]==intArray[startIndex]){      //endIndex每移动一次就判断一次，更新一次temp的值
                temp=endIndex-startIndex;  日    //老师的解法的好处是不需要单独考虑数组末尾的情况，因为每移动一次就更新了一次
                if (temp>delta){
                    delta=temp;
                }
            }else {
                startIndex=endIndex;
            }
            endIndex++;
        }
        result=delta+1;
        System.out.println(result);*/
        //自己复习时重写的方法
        /*int[] intArray = {1, 1, 1, 2, 2, 3, 3, 3, 4, 4};
        int leftIndex =0;
        int rightIndex =0;
        int maxLength=0;
        while (rightIndex<intArray.length){
            if (intArray[rightIndex]!=intArray[leftIndex]){
                int length=rightIndex-leftIndex;
                if (length>maxLength){
                    maxLength=length;
                }
                leftIndex=rightIndex;
            }else if (rightIndex==intArray.length-1){
                if (rightIndex-leftIndex+1>maxLength){
                    maxLength=rightIndex-leftIndex+1;
                }
            }
            rightIndex++;
        }
        System.out.println(maxLength);*/

        //泛型类
        /*Apple apple = new Apple();
        Box<Apple> box1= new Box<Apple>();
        box1.payload = apple;
        Cake cake = new Cake();
        Box<Cake> box2 = new Box<Cake>();
        box2.payload = cake;*/

        //Hanoi Tower(递归)
        /*int n=3;
        long result = Recursion.hanoi(n);
        System.out.println(result);*/

        //用公式，循环和递归三种方法算出从1加到n的和
       /* System.out.println(Recursion.add1(100));
        System.out.println(Recursion.add2(100));
        System.out.println(Recursion.add3(100));*/

        //方法重载
        /*Calculator calculator = new Calculator();
        int result=calculator.add(1, 2, 3);
        System.out.println(result);*/

        //构造器重载
        /*Student student = new Student(1, "Tim");
        System.out.printf("%s's ID is %d.\n", student.name, student.id);*/

        //接口
        /*Vehicle vehicle = new Truck();
        vehicle.run();
        Weapon myWeapon1 = new Tank();
        Weapon myWeapon2 = new RocketLauncher();
        myWeapon1.fire();
        myWeapon2.fire();*/

        //用方法来封装字段，用try catch来抓异常
        /*Student student = new Student();
        try {
            student.setAge(30);
            System.out.println(student.getAge());
            student.setAge(100);           //程序执行到这一步时抛出异常，其后的语句（在try中的语句）将不被执行，---阻止错误逻辑继续执行，虽然此时this.age还是30
            System.out.println(student.getAge());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }*/

        //不抛异常，用if else来代替会出现什么情况
        /*Student student = new Student();
        student.setAge(35);
        System.out.println(student.getAge());
        student.setAge(300);                             //此时值已经不对了，但是逻辑却还在继续往下跑。
        System.out.println(student.getAge());*/         //有异常时需要尽早把异常抛出来，否则bug就抓不到了

        //从屏幕接收输入    I/O这部分理解起来会比较辛苦，不需要具体理解，会用就行，真正用的时候还可以去google
        /*InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);
        while (true){
            try {
                System.out.println("Please input 2 integers:");
                String content1 = buffer.readLine();
                Integer integer1 = Integer.parseInt(content1);
                String content2 = buffer.readLine();
                Integer integer2 = Integer.parseInt(content2);
                Calculator calculator = new Calculator();
                int result = calculator.add(integer1, integer2);    //这里是一个语法糖，应该给int类型
                //int result = calculator.add(integer1.intValue(), integer2.intValue());
                System.out.println(String.format("%d+%d=%d\n", integer1, integer2, result));
                if (result==99){
                    System.out.println("Game Over.");
                    break;
                }
            }catch (IOException e){
                System.out.println("Input Device Error!");
            }catch (NumberFormatException e){
                System.out.println("Please input numbers only!");
            }
        }*/

        //从文件中读取   I/O这部分不需要具体理解，会用，会google就行
        /*try {
            FileReader fileReader = new FileReader("C:\\Numbers.txt");
            BufferedReader buffer = new BufferedReader(fileReader);
            Integer sum = 0;
            while (true) {
                String line = buffer.readLine();
                System.out.println(line);
                if (line==null){
                    break;
                }else {
                    sum += Integer.parseInt(line);
                }
            }
            System.out.println(sum);
            buffer.close();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Sum.txt"), "utf-8")); //将结果写入文件
            writer.write(sum.toString());   //写入时必须转成字符串，否则会得到错误结果
            writer.close();           //wirter必须close，否则无法写入
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found.");
        } catch (IOException e) {
            System.out.println("Reading Error.");
        }*/
        //自己写的从文件读入
        /*try {
            FileReader fileReader = new FileReader("C:/Numbers.txt");  //文件路径用/或\\都可，后者是windows用的，前者是linux和Unix用的
            BufferedReader buffer = new BufferedReader(fileReader);
            Integer sum =0;
            String line = buffer.readLine();
            while (line!=null){
                Integer integer = Integer.parseInt(line);
                sum += integer.intValue();
                line = buffer.readLine();
            }
            System.out.println(sum);
            buffer.close();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:/Sum.txt"), "utf-8"));
            writer.write(sum.toString());
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fine Not Found");
        } catch (IOException e) {
            System.out.println("Reading Error");
        }*/

        //检测IntelliJ是否能connnect到mysql
        Connection connection;
        try {
            connection = ConnectionConfig.getConnection();
            if (connection!=null){
                System.out.println("Connection established!");
                connection.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class ConnectionConfig{
    public static Connection getConnection(){
        Connection connection =null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "1234");
        }catch (ClassNotFoundException  e){
            System.out.println("Mysql JDBC driver not found.");
        }catch (SQLException e){
            System.out.println("SQL Exception!");
        }
        return connection;
    }
}

//流式I/O
/*class Calculator{
    public int add(int a, int b){
        return a+b;
    }
}*/


//用方法来封装字段
/*class Student{
    private int age;           //被封装的字段基本上都是private的

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if (age>=6 && age<=90){
            this.age = age;
        }else {
            String message = String.format("The age value %d is invalid.", age);
            throw new Exception(message);

        }
    }
}*/

//不抛异常，用if else来代替会出现什么情况
/*class Student{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>=6 && age<=90){
            this.age = age;
        }else {
            System.out.println("Your value is invalid.");
        }
    }
}*/

//接口
/*interface Vehicle {
    public abstract void run();
}

interface Weapon{
    public abstract void fire();
}

class Truck implements Vehicle {
    @Override
    public void run() {
        System.out.println("I'm running in the highway.");
    }
}

class Tank implements Vehicle, Weapon{
    @Override
    public void run() {
        System.out.println("I'm running in battlefield.");
    }

    @Override
    public void fire() {
        System.out.println("Bang!Bang!Bang!");
    }
}

class RocketLauncher implements Weapon{
    @Override
    public void fire() {
        System.out.println("3!2!1!Fire!");
    }
}*/

//构造器重载
/*class Student{
    public Student(int id) {
        this.id = id;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int id;
    public String name;
}*/

//方法重载
/*class Calculator{
    public int add(int a, int b){
        return a+b;
    }

    public double add(double a, int b){
        return a+b;
    }

    public double add(int a, double b){
        return a+b;
    }

    public int add(int x, int y, int z ){
        return x+y+z;
    }

    public double add(double a, double b){
        return a+b;
    }
}*/
//三种算出从1加到n的方法（公式，循环，递归）
//注意int类型的范围，所以n也需要被限定在一定的范围内(最好小于2的15次方)
/*class Recursion{
    public static int add1(int n){
        return (1+n)*n/2;
    }

    public static int add2(int n){
        int result=0;
        for (int i = 1; i <=n ; i++) {
            result += i;
        }
        return result;
    }

    public static int add3(int n){
        if (n==1){
            return 1;
        }else {
            return add3(n-1)+n;
        }
    }
}*/
//Hanoi Tower
/*class Recursion{
    public static long hanoi(int n){
        if (n==1){
            return 1;
        } else {
            return 2*hanoi(n-1)+1;     //写成2*hanoi(n-1)比hanoi(n-1)+hanoi(n-1)速度会快很多
        }
    }
}*/


//泛型类
/*class Apple{
}
class Cake{
}
class Box<P>{
    public P payload;
}*/

//二叉树
/*class TreeNode{

    public TreeNode(int payload) {
        this.payload = payload;
    }

    public int payload;
    public TreeNode leftChild;
    public TreeNode rightChild;
}*/

//链表
/*class Node{
    public Node(int payload) {
        this.payload = payload;
    }

    public int payload;
    public Node next;
}*/

//构造器(构造函数)
/*class Zombie{
    public Zombie(){
        this._age =500;
        this._damage =10;
    }

    public Zombie(int age, double damage) {
        this._age = age;
        this._damage = damage;
    }

    public int _age;
    public double _damage;
    public void study(){
        System.out.println("I love Java!");
    }
}*/


/*class Reverse{               //将字符数组部分元素翻转，在按单词翻转数组中用到
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

/*class Student{             //在二维数组中用到
    public int score;
}*/
