package org.waspec;

import com.sun.javafx.scene.paint.GradientUtils;
import com.sun.org.apache.xpath.internal.SourceTree;
import sun.awt.TracedEventQueue;
import sun.reflect.annotation.ExceptionProxy;

import javax.swing.tree.TreeNode;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.Buffer;
import java.sql.*;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;

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
            BufferedReader buffer = new BufferedReader(fileReader);  //主要是BufferedReader和BufferedWriter
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Sum.txt"), "utf-8")); //将结果写入文件
            while (true) {
                String line = buffer.readLine();
                System.out.println(line);
                if (line==null){
                    break;
                }else {
                    writer.write(line+'\n');   //写入时必须转成字符串，否则会得到错误结果
                }
            }
            buffer.close();
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

        //连接到mysql，读出world.country表中的Name栏，并且结果写入一个文件
        /*Connection connection =null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "163w5002cy");
            System.out.println(connection);
            if (connection!=null){
                System.out.println("Connection established!");
                System.out.println(connection);
                Statement myStatement =  connection.createStatement();
                ResultSet resultSet = myStatement.executeQuery("select * from world.country");
                FileWriter fileWriter = new FileWriter("C:\\Country.txt");
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                while (resultSet.next()){
                    String name = resultSet.getString("Name");
                    System.out.println(name);
                    bufferedWriter.write(name);
                    //bufferedWriter.write("\r\n");    //在文件中必须是\r\n，\r回车(把光标扔到这一行开头)，\n换行
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
                connection.close();
            }
        }catch (ClassNotFoundException  e){
            System.out.println("Mysql JDBC driver not found.");
        }catch (SQLException e){
            System.out.println("SQL Exception!");
        }catch (IOException e){
            System.out.println("IO Exception.");
        }*/

        //继承
        /*Teacher teacher = new Teacher();
        teacher.teach();
        teacher.sleep();*/
        //方法覆盖
        /*ComputerTeacher computerTeacher = new ComputerTeacher();
        computerTeacher.teach();*/
        //多态
        /*Teacher teacher = new ComputerTeacher();     //父类变量可以引用子类的实例，ComputerTeacher也是Teacher，一定可以调到Teacher的所有方法
        teacher.teach();
        Human human = new Human();
        human.sleep();
        human = new Teacher();
        human.sleep();
        human = new ComputerTeacher();  //ComputerTeacher是Human这个类的间接派生类
        human.sleep();*/

        //抽象类
        /*Teacher teacher = new EnglishTeacher();
        teacher.age =20;
        teacher.speak();*/

        //匿名类  当强行实例化抽象类和接口时，会自动创建一个匿名类
        /*Teacher teacher = new Teacher() {
            @Override
            public void teach() {
                System.out.println("I can teach all.");
            }
        };    //必须要加;作为一个完整的语句
        teacher.teach();
        Class myClass = teacher.getClass();
        System.out.println(myClass);      //不是teacher类型，是匿名类型

        Human human = new Human() {
            @Override
            public void think() {
                System.out.println("Who am I");
            }
        };
        human.think();
        Class someClass = human.getClass();
        System.out.println(someClass);    //编译器将这个匿名类命名为Main$1，如果欺负编译器提前准备一个叫作Main$1的类，那编译器会把匿名类的名字改成Main$2*/

        //接口，抽象类，具体类综合应用
        /*American american = new American();
        american.greeting();
        american.setAge(20);
        System.out.println(american.getAge());

        Chinese chinese = new Chinese();
        chinese.greeting();
        chinese.setAge(20);
        System.out.println(chinese.getAge());

        ABC abc = new ABC();
        abc.greeting();
        abc.setAge(20);
        System.out.println(abc.getAge());*/

        //getClass()返回的是变量所引用的实例的类型
        /*Men chineseMen = new ChineseMen();
        System.out.println(chineseMen.getClass());*/

        //List<E>的使用
        /*List<Student> studentList = new ArrayList<Student>();  //就算替换成LinkedList，逻辑也完全不用改，面向接口编程的好处
        studentList.add(new Student(1));
        studentList.add(new Student(2));
        studentList.add(new Student(3));
        studentList.remove(new Student(2));   //这里删除的是引用着一个新的实例的元素(虽然这个实例中id为2)，而这个元素在 List里根本就不存在。但是如果这里是Integer类型的元素的话，Integer在比较的时候其实比较的是它引用的对象的值（语法糖），是特例
        System.out.println(studentList.size());
        System.out.println(studentList.get(0).id);   //List是0基的
        studentList.add(1, new Student(100));   //插入
        studentList.set(1, new Student(200));   //改
        for (Student s : studentList){      //迭代用foreach性能更高
            System.out.println(s.id);
        }
        Student studentToDelete=null;
        int idToBeDelete=200;
        for (Student s : studentList){
            if (s.id == idToBeDelete){
                studentToDelete = s;
                break;
            }
        }
        studentList.remove(studentToDelete);
        for (Student s:studentList){
            System.out.println(s.id);
        }*/

        //Set<E>的使用
        /*Set<Student> studentSet = new HashSet<Student>();
        studentSet.add(new Student(1));
        studentSet.add(new Student(2));
        studentSet.add(new Student(2));   //这里是两个不同的实例，所以虽然它们的id的值一样，但是仍然是不同的元素
        System.out.println(studentSet.size());

        Student student = new Student(4);
        studentSet.add(student);
        studentSet.add(student);
        System.out.println(studentSet.size());*/

        //Stack的应用
        /*Stack<Student> studentStack = new Stack<Student>();
        Student student1 = new Student(1);
        Student student2 = new Student(2);
        Student student3 = new Student(3);
        studentStack.push(student1);
        studentStack.push(student1);   //可以存在重复元素
        studentStack.push(student2);
        studentStack.push(student3);
        System.out.printf("Top student's id is: %d\n", studentStack.peek().id);
        System.out.printf("Student stack's size is: %d\n", studentStack.size());
        System.out.printf("Popped student's id is: %d\n", studentStack.pop().id);
        System.out.printf("Now student stack's size is: %d\n", studentStack.size());

        studentStack.add(1, new Student(4));   //因为Stack派生自List，所以List里的方法也可以用，但是正常情况下基本没人用
        for (Student student : studentStack){       //迭代时是按照加入元素的先后顺序进行迭代(List)
            System.out.print(student.id + " ");
        }
        System.out.println();

        int index = studentStack.search(student2);
        System.out.printf("the index of the searched student is: %d\n",index);*/     //search方法是从栈顶开始数，并且是1基的。好处在于，pop这么多次就可以拿到这个元素

        //Queue不抛异常组
        /*Queue<Student> studentQueue = new LinkedList<Student>();    //一般就调用LinkedList的对象当作Queue来用
        Student student1 = new Student(1);
        Student student2 = new Student(2);
        Student student3 = new Student(3);
//        studentQueue.offer(student1);
//        studentQueue.offer(student2);
//        studentQueue.offer(student3);
        Student temp = studentQueue.peek();     //不抛异常。把peek换成poll也不抛异常
        if (temp!=null){
            System.out.println(temp.id);
        }else {
            System.out.println("The queue is empty.");
        }*/

        //Queue抛异常组
        /*Queue<Student> studentQueue = new LinkedList<Student>();
        Student student1 = new Student(1);
        Student student2 = new Student(2);
        Student student3 = new Student(3);
//        studentQueue.add(student1);
//        studentQueue.add(student2);
//        studentQueue.add(student3);
        try {
            Student temp = studentQueue.element();     //抛异常。换成remove也会抛异常
            System.out.println(temp.id);
        }catch (NoSuchElementException e){
            System.out.println("This queue is empty.");
        }
        //或者把上面的写法改成
        if (studentQueue.isEmpty()){
            System.out.println("This queue is empty.");
        }else {
            Student temp = studentQueue.element();
            System.out.println(temp.id);
        }*/

        //二叉树的深度优先遍历和广度优先遍历
        //Node root = Node.buildATree();
        //Node.BFT(root);
        //Node.inorderDFT(root);
        //Node.inorderDFT(root,0);
        //Node.preorderDFT(root);
        //Node.postorderDFT(root);

        //将sortedArray转成一棵平衡检索二叉树
        /*int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TreeNode root = SortedArray.buildTreeNode(intArray);
        TreeNode.BFT(root);*/

        //Map的应用
        /*Map<Integer, Student> students = new HashMap<Integer, Student>();  //Java里的所有集合都只能容纳引用类型，不能容纳基本类型
        for (int i = 0; i < 50; i++) {
            Student student = new Student();
            student.id = i+1;
            student.name = String.format("Student_%d", student.id);
            students.put(student.id, student);             //不要用List来存，检索时效率太低(不在里面的时候效率最低)，而Map里的key就保证了检索时效率很高
        }
        System.out.println(students.size());
        Integer targetID = 34;
        System.out.println(students.get(targetID).name);
        //不要写成下面这样
        List<Student> studentList = new ArrayList<Student>();
        for (int i = 0; i < 50; i++) {
            Student student = new Student();
            student.id = i+1;
            student.name = String.format("Student_%d", student.id);
            studentList.add(student);
        }
        Integer targetId = 50;
        for (Student s:studentList){       //检索时每一个都要迭代到，效率低，不在里面的时候效率最低
            if (s.id==targetId){
                System.out.println(s.name);
                break;
            }
        }*/

        //Graph的深度优先遍历
        /*Node graph = Node.buildAGraph();
        Node.DFT(graph);
        Set<Node> accessedNodes = new HashSet<Node>();
        Node.DFT(graph, accessedNodes); //这里可以直接写成Graph.DFT(graph, new HashSet<Node>())*/
        //Graph的广度优先遍历
        /*Node start = Node.buildBFTGraph();
        Node.BFT1(start);
        Node.BFT2(start);*/

        //反射
        //什么不是反射？
        //早绑定
        /*Student student = new Student();   //new操作符创建出了一个真实的Student的实例
        student.speak();*/                   //这个真实的实例调用这个类中的方法当然没有问题
        //不完整的反射(因为仍然使用了Student这个类)
        /*try {
            Student student = Student.class.newInstance();   //把Student当数据类型用来创建实例，此时并没有用new来创建实例
            student.speak();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/
        //完整的反射(完全没有去碰Student这个类)
        //晚绑定
        /*try {
            Class reflectedClass = Class.forName("org.waspec.Student");   //在包里拿到Student这个类的镜像。如果这个类不存在时会抛异常
            Object object = reflectedClass.newInstance();       //通过拿到的类的镜像来创建一个实例，此时这个实例不知道自己到底是什么类型，只能用Object来引用它。如果这个类是接口或者是抽象类则无法创建实例，抛异常
            //调用不带参数的方法
            Method reflectedMethod1 = reflectedClass.getDeclaredMethod("speak");  //在这个类的镜像里搜索是否有speak这个方法。如果找不到这个方法时会抛异常
            reflectedMethod1.invoke(object);   //告诉方法应该和哪个对象绑定
            //调用带参数的方法(自己研究出来的)
            Method reflectedMethod2 = reflectedClass.getDeclaredMethod("add",int.class, int.class);
            System.out.println(reflectedMethod2.invoke(object, new Integer(33), new Integer(67)));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }*/

        //反射的真正威力
        //程序的主体是固化在机器芯片上的，是不能动的，所以程序的架构只有改成反射的架构才能实现其扩展性(extensibility)
        /*InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        while (true){     //只要电池有电就应该一直运行程序
            //初级程序员的写法
            *//*try {
                String choice = bufferedReader.readLine();
                if (choice.equals("cat")){       //字符串的比较要用equal这个方法，不能用"=="
                    Cat cat = new Cat();       //cat的作用域只限于这个block
                    cat.speak();
                }else if (choice.equals("dog")){
                    Dog dog = new Dog();
                    dog.speak();
                }else if (choice.equals("duck")){
                    Duck duck = new Duck();
                    duck.speak();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }*//*

            //中级程序员的写法
            *//*try {
                String choice = bufferedReader.readLine();
                Animal animal=null;       //面向接口编程
                if (choice.equals("cat")){
                    animal = new Cat();
                }else if (choice.equals("dog")){
                    animal = new Dog();
                }else if (choice.equals("duck")){
                    animal = new Duck();
                }
                animal.speak();
            } catch (IOException e) {
                e.printStackTrace();
            }*//*

            //高级程序员的写法
            *//*try {
                String className = bufferedReader.readLine();
                String classFullName = String.format("org.waspec.%s", className);   //程序具有了无限的可扩展性。虽然主程序被固化在芯片上不能改，但是动物声音的包却可以无限扩展
                Class reflectedClass = Class.forName(classFullName);
                Animal animal = (Animal)reflectedClass.newInstance();       //反射和面向接口编程相结合   用接口对实例进行强制类型转换
                animal.speak();
            } catch (IOException e) {
                System.out.println("亲，出错了哟");
            } catch (ClassNotFoundException e) {
                System.out.println("亲，出错了哟哟");
            } catch (InstantiationException e) {
                System.out.println("亲，出错了哟哟哟");
            } catch (IllegalAccessException e) {
                System.out.println("亲，出错了哟哟哟哟");
            }*//*
        }*/

        //单线程
        /*Thread mainThread = Thread.currentThread();     //获得当前线程
        System.out.println(mainThread.getName());      //打印出线程的名字
        try {
            Thread.sleep(500);         //让线程睡500毫秒
            System.out.println("Wake up!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        //多线程
        /*Thread thread1 = new Thread(new ThreadWrapper());
        thread1.setName("Foo");
        Thread thread2 = new Thread(new ThreadWrapper());
        thread2.setName("Bar");
        thread1.start();
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();*/

        //事件处理
        Child child = new Child();
        child.name = "Jim";
        child.guardian = new Parent();
        child.cry();

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Who do you want to select as guardian? Parent? Grandparent?");
        try {
            String choice = bufferedReader.readLine();
            String fullClassName = String.format("org.waspec.%s", choice);
            Class reflectedClass = Class.forName(fullClassName);
            Child newChild = new Child();
            newChild.name = "Jim";
            newChild.guardian = (Guardian)(reflectedClass.newInstance());
            newChild.cry();
        } catch (IOException e) {
            System.out.println("出错了");
        } catch (ClassNotFoundException e) {
            System.out.println("出错了");
        }catch (InstantiationException e ){
            System.out.println("出错了");
        }catch (IllegalAccessException e ){
            System.out.println("出错了");
        }

    }
}
interface Guardian{
    void takeCare(String name);
}

class Child{                //事件拥有者
    public String name;
    public Guardian guardian;        //利用接口进行松耦合
    public void cry(){
        System.out.println("Waaaaaa...");
        if (this.guardian!=null){
            this.guardian.takeCare(this.name);
        }
    }
}

class Parent implements Guardian{              //事件响应者
    @Override
    public void takeCare(String childName){
        System.out.println(childName+ ", don't cry");
    }
}

class Grandparent implements Guardian{
    @Override
    public void takeCare(String childName) {
        System.out.println(childName + ", do you want delicious snack?");
    }
}

//多线程
/*class ThreadWrapper implements Runnable {
    @Override
    public void run() {        //创建支线程的入口点
        say();
    }

    public static void say() {
        for (int i = 0; i < 5; i++) {
            String message = String.format("%s say %d", Thread.currentThread().getName(), i);
            System.out.println(message);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}*/

//反射
/*class Student{
    public int id;
    public String name;
    public void speak(){
        System.out.println("Hello");
    }
    public int add(int a, int b){
        return a+b;
    }
}*/

//反射的真正威力
/*interface Animal{      //公开经第三厂商的API
     void speak();
}

class Cat implements Animal{
    public void speak(){
        System.out.println("Meow...meow...");
    }
}

class Dog implements Animal{
    public void speak(){
        System.out.println("Wang...wang...");
    }
}

class Duck implements Animal{
    public void speak(){
        System.out.println("Gua...gua...");
    }
}*/

//八皇后问题尝试
class EightQueens {
    public static void solve8Queens() {
        char[][] charArray = new char[8][8];
        //准备好填充了空格的字符数组用来表示一个空白数组
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                charArray[i][j] = ' ';   //第一步把所有的行和列打成空格
            }
        }
        //第一重扫描代表第一个皇后可以放的位置
        for (int i1 = 0; i1 < 8; i1++) {
            for (int j1 = 0; j1 < 8; j1++) {
                //将皇后的位置标成Q
                charArray[i1][j1] = 'Q';
                //第二重扫描检查第二个皇后可以放的位置
                for (int i2 = 0; i2 < 8; i2++) {
                    for (int j2 = 0; j2 < 8; j2++) {
                        //放上第一个皇后后不available的位置全部标成*
                        if (!isAvaialbe(i1, j1, i2, j2) && charArray[i2][j2] != 'Q') {
                            charArray[i2][j2] = '*';
                        }


                    }
                }
            }
        }
        //打印出最后得到的结果
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.println(charArray[i][j]);
            }
        }
    }

    //判断当前位置是否处在皇后的同行同列或对角线上
    public static boolean isAvaialbe(int queeni, int queenj, int i, int j) {
        if (i == queeni)
            return false;
        if (j == queenj)
            return false;
        if (queeni - i == queenj - j)
            return false;
        if (queeni - i == j - queenj)
            return false;
        return true;
    }
}

//图(Graph)
/*class Node{
    public Node(int payload) {
        this.payload = payload;
        this.children = new HashSet<Node>();  //在创建节点的时候就同时把children的集合创建出来，避免Set为null的情况出现，比较安全，但是Set里面可以一个元素都没有
    }

    public int payload;
    public boolean isAccessed;     //图只比二叉树多了一个isAccessed的属性
    public Set<Node> children;     //Set是无序的，所以打印出来的顺序跟加入的顺序无关，而且每次运行可能打出不一样的结果。如果把Set改成List，就是有序的。不过对图来说，顺序已经不是那么重要了

    //构造出一张无向图(for DFT)
    public static Node buildAGraph(){
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        //构造无向图
        node1.children.add(node2);
        node1.children.add(node3);
        node2.children.add(node1);
        node2.children.add(node4);
        node2.children.add(node5);
        node3.children.add(node1);
        node3.children.add(node4);
        node3.children.add(node5);
        node4.children.add(node2);
        node4.children.add(node3);
        node4.children.add(node5);
        node5.children.add(node2);
        node5.children.add(node3);
        node5.children.add(node4);

        return node1;
    }
    //图的深度遍历(允许用isAccessed)
    public static void DFT(Node node){    //图的DFT不存在前序中序后序的问题
        System.out.println(node.payload);
        node.isAccessed = true;
        for (Node child : node.children){   //每次构造节点时都创建了一个Set，所以不用担心为null会抛异常
            if (child.isAccessed==false){
                DFT(child);
            }
        }
    }
    //图的深度遍历(不允许用isAccessed)
    public static void DFT(Node node, Set<Node> accessedNodes){    //多层递归共用从顶层传下来的集合时要把这个集合变成方法参数传进去
        System.out.println(node.payload);
        accessedNodes.add(node);
        for (Node child : node.children){
            if (!accessedNodes.contains(child)){
                DFT(child, accessedNodes);
            }
        }
    }

    //构造出一张有向图(for BFT)
    public static Node buildBFTGraph(){
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        //构造有向图
        node1.children.add(node2);
        node1.children.add(node3);
        node2.children.add(node4);
        node2.children.add(node5);
        node3.children.add(node5);
        node4.children.add(node3);
        node4.children.add(node5);

        return node1;
    }
    //图的广度遍历(自己写的允许用isAccessed的版本)
    public static void BFT1(Node start){
        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(start);
        start.isAccessed = true;
        while (queue.peek()!=null){
            Node temp = queue.poll();
            System.out.println(temp.payload);
            for (Node child : temp.children){
                if (child.isAccessed==false){
                    queue.offer(child);
                    child.isAccessed = true;
                }
            }
        }
    }
    //图的广度优先遍历(不允许用isAccessed)   将两种不同的集合用在了一起
    public static void BFT2(Node start){
        Queue<Node> queue = new LinkedList<Node>();
        Set<Node> accessedNodes = new HashSet<Node>();
        queue.offer(start);
        accessedNodes.add(start);
        while (!queue.isEmpty()){
            Node current = queue.poll();
            System.out.println(current.payload);
            for (Node child : current.children){    //注意这里遍历的是current.children里的元素
                if (!accessedNodes.contains(child)){
                    queue.offer(child);
                    accessedNodes.add(child);   //把节点拉到Queue的同时就要把它加到accessedNodes这个集合里，否则同一个节点会被重复拉入多次
                }
            }
        }
    }
     //图的广度优先遍历(不允许用isAccessed)的另一种写法
     public static void BFT3(Node node){
        Set<Node> accessedNodes = new HashSet<Node>();
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(node);
        while (!queue.isEmpty()){
            Node accessingNode = queue.poll();
            if (accessedNodes.contains(accessingNode)){
                continue;
            }
            System.out.println(accessingNode.payload);
            accessedNodes.add(accessingNode);
            for (Node child : accessingNode.children){
                queue.add(child);
            }
        }
    }
}*/

//Map的应用
/*class Student{
    public Integer id;
    public String name;
}*/

//将sortedArray转成一棵平衡检索二叉树
/*class SortedArray {
    public static TreeNode buildTreeNode(int[] intArray) {

        int rootIndex = (intArray.length-1)/2;
        TreeNode root = new TreeNode(intArray[rootIndex]);
        if (intArray.length==1){
            return root;
        } else if (intArray.length==2){
            root.rightChild = new TreeNode(intArray[1]);
            return root;
        }else {
            int leftArrayLength = rootIndex;
            int[] leftArray = new int[leftArrayLength];  //leftArray的长度跟rootIndex的值是一样的
            for (int i = 0; i < rootIndex; i++) {
                leftArray[i] = intArray[i];
            }
            root.leftChild = buildTreeNode(leftArray);
            int rightArrayLength = intArray.length-1-rootIndex;
            int[] rightArray = new int[rightArrayLength];
            for (int j = 0; j < rightArrayLength; j++) {
                rightArray[j] = intArray[rootIndex+1+j];
            }
            root.rightChild = buildTreeNode(rightArray);
            return root;
        }
    }
}

class TreeNode {
    public TreeNode(int payload) {
        this.payload = payload;
    }

    public int payload;
    public TreeNode leftChild;
    public TreeNode rightChild;

    public static void BFT(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (queue.peek() != null) {
            TreeNode temp = queue.poll();
            System.out.println(temp.payload);
            if (temp.leftChild!=null){       //只有在leftChild不为空时才把它的子树拉进queue，否则队列会提前出现null值，提早结束
                queue.offer(temp.leftChild);
            }
            if (temp.rightChild!=null){
                queue.offer(temp.rightChild);
            }
        }
    }
}*/

//二叉树的深度优先遍历（DFT）和广度优先遍历（BFT）
/*class Node {
    public Node(int payload) {
        this.payload = payload;
    }

    public int payload;
    public Node leftChild;
    public Node rightChild;

    public static Node buildATree() {
        Node root = new Node(1);
        root.leftChild = new Node(2);
        root.rightChild = new Node(3);
        root.leftChild.leftChild = new Node(4);
        root.leftChild.rightChild = new Node(5);
        root.rightChild.leftChild = new Node(6);
        root.rightChild.rightChild = new Node(7);
        return root;
    }

    //二叉树广度优先遍历算法   利用Queue这种数据结构
    public static void BFT(Node root) {
        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(root);
        while (queue.peek() != null) {
            Node temp = queue.poll();
            System.out.println(temp.payload);
            if (temp.leftChild!=null) {
                queue.offer(temp.leftChild);
            }
            if (temp.rightChild!=null) {
                queue.offer(temp.rightChild);
            }
        }
    }

    //二叉树中序深度优先遍历算法
    public static void inorderDFT(Node root) {
        if (root.leftChild != null) {
            inorderDFT(root.leftChild);
        }
        System.out.println(root.payload);
        if (root.rightChild != null) {
            inorderDFT(root.rightChild);
        }
    }

    //二叉树中序深度优先遍历算法的另一种写法
    public static void inorderDFT(Node root, int level) {
        if (root==null){
            return;
        }
        level++;
        inorderDFT(root.leftChild, level);
        System.out.printf("%d on level %d\n", root.payload, level);
        inorderDFT(root.rightChild, level);
    }

    //二叉树前序深度优先遍历算法
    public static void preorderDFT(Node root) {
        System.out.println(root.payload);
        if (root.leftChild != null) {
            preorderDFT(root.leftChild);
        }
        if (root.rightChild != null) {
            preorderDFT(root.rightChild);
        }
    }

    //二叉树后序深度优先遍历算法
    public static void postorderDFT(Node root) {
        if (root.leftChild != null) {
            postorderDFT(root.leftChild);
        }
        if (root.rightChild != null) {
            postorderDFT(root.rightChild);
        }
        System.out.println(root.payload);
    }
}*/

//List<E>, Set<E>，Stack和Queue的应用
/*class Student{
    public Student(int id) {
        this.id = id;
    }

    public int id;
}*/


//getClass()返回的是变量所引用的实例的类型
/*interface Men{
    void eat();
}

class ChineseMen implements Men{
    @Override
    public void eat() {
        System.out.println("We eat rice.");
    }
}*/

//接口可以extends接口，具体类可以extends抽象类，抽象类和具体类可以implements接口
/*interface Human{
    void speak();
}

interface Teacher extends Human{
    void teach();
}

class ChineseTeacher implements Teacher{
    @Override
    public void teach() {
        System.out.println("I can teach Chinese.");
    }

    @Override
    public void speak() {
        System.out.println("Who I am.");
    }
}*/


//接口，抽象类，具体类综合应用
/*interface Human{
    void greeting();
    void setAge(int age);
    int getAge();
}

class American implements Human{
    private int age;

    @Override
    public void greeting() {
        System.out.println("Hello");
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int getAge() {
        return this.age;
    }
}


abstract class ChineseBase implements Human{
    protected int age;     //注意字段的访问权限，如果是private，则它的派生类里虽然有这个字段，但是却无法访问

    @Override
    public void greeting() {
        System.out.println("你好");
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public abstract int getAge();
}

class Chinese extends ChineseBase{
    @Override
    public int getAge() {
        return this.age+1;
    }
}

class ABC extends ChineseBase{
    @Override
    public int getAge() {
        return this.age;
    }
}*/


///抽象类，抽象类和接口，匿名类
/*interface Human{
    void think();
}

abstract class Teacher {   //抽象类不完全实现，不能实例化
    public abstract void teach();      //抽象类里有没有实现的方法
    public int age;          //抽象类里可以有字段
    public void sleep(){      ///抽象类里可以有实现了的方法
        System.out.println("ZZzz...");
    }
    public void speak(){
        System.out.println(String.format("I'm %d years old.", this.age));
    }
}

class EnglishTeacher extends Teacher{      //派生自抽象类
    @Override
    public void teach(){
        System.out.println("I can teach English.");
    }
}

class ComputerTeacher extends Teacher{     //派生自抽象类
    @Override
    public void teach(){
        System.out.println("I can teach Java.");
    }
}*/

//继承和方法的覆盖
/*class Human{
    public int age;

    public void speak(){
        System.out.println("I'm happy to be human.");
    }

    public void sleep(){
        System.out.println("ZZZzzz...");
    }
}

class Teacher extends Human{
    public void teach(){
        System.out.println("I can teach.");
    }
}

class ComputerTeacher extends Teacher{
    @Override
    public void teach(){
        System.out.println("I can teach Java and C#.");
    }
    @Override
    public void sleep(){
        System.out.println("Huluu, huluu,...");
    }
}*/

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
