#  Java概述



## 什么是程序

> 计算机执行某些操作或解决某个问题而**编写的一系列有序指令的集合**



## 历史

92年 Sun 公司创建 Java 语言，95年正式发布第一个版本，09年 Oracle 公司收购，11年发布Java7



## 特性

- 面向对象（OOP）

- 健壮性：强类型机制、异常处理、垃圾自动收集

- 跨平台性：编译好的 .class 文件可以在多个操作系统运行

- 解释性语言（了解）



## 运行机制及运行过程

**.java文件（）👉 javac 编译👉 .class 文件（字节码文件）👉 java 运行（ .class 加载到 jvm）**👉**结果**

### **JVM**

- **Java核心机制** - Java虚拟机（JVM）（Java Virtual Machine） 

- JVM 负责执行指令，管理数据、内存、寄存器，包含在 ==JDK== 中

- Java虚拟机机制屏蔽了底层运行平台的差别，实现了“一次 ==编译==，到处 ==运行==”

### **JRE**

- Java Runtime Environment，Java运行环境

- JRE = JVM + Java核心类库（类）

### **JDK**

- Java Develoment Kit，==Java 开发工具包==

- JDK = JRE + java开发工具



## 开发注意

- 源文件以.java为扩展名。源文件的基**本组成部分是类（class）**

- 执行入口main（）

- 严格区分**大小写**

- 每个与语句以 ; 结束

- **大括号成对**出现

- **一个源文件中只能有一个 public 类**

- **public 类名与源文件名一致**

- **非 public 的 main 方法**

  

## 编写规范

- **类，方法使用文档注释**
- **非javadoc注释**，是对代码的说明（**给程序的维护者**）
- **tab 整体移动**
- **运算符两边给空格**
- **源码文件**使用 **utf-8** 编码
- 行宽字符**不超80**
- 代码风格：**行尾**（推荐）、**次行**



## 注释

单行注释 // 

多行注释 ==不能嵌套== /*  */

javadoc文档注释 /**    */

注释内容可以被 JDK 提供的 javadoc 所解析,生成一套以网页文件形式体现的该程序的说明文档，一般写在类

<img src="C:\Users\16271\AppData\Roaming\Typora\typora-user-images\image-20220329140126433.png" alt="命令"  />



## DOS（了解）

补充：相对路径、绝对路径

相对路径：从当前所在目录开始定位，形成的路径

绝对路径：从顶级目录（盘符）开始定位，形成的路径

![](https://img-blog.csdnimg.cn/e99f2f1ca7c9417999d92e1a96cb943a.gif)

查看所有子级目录：tree



# 环境搭建

## 环境变量作用

为了在dos的任意目录，可以使用java和javac命令



## 环境变量配置

JAVA_HOME = 指向JDK的主目录

Path = %JAVA_HOME%\bin



# 变量

> 变量是程序的基本组成单位

## +号的使用

1. 两边都是数值型，做加法运算
2. 两边有一个为字符串，做拼接运算
3. 运算顺序：从左到右



## 数据类型 

bit：计算机中最小存储单位

byte（字节）：计算机中基本存储单元

1 byte = 8 bit

<img src="https://img-blog.csdnimg.cn/c149aa67c3f54ac1b7355fa578f5c99d.gif" style="zoom: 67%;" />

<img src="https://img-blog.csdnimg.cn/cf1ec28944bf4d578313ec896bbd0e18.gif" style="zoom:67%;" />

<img src="https://img-blog.csdnimg.cn/49ff71c5292f49e1a1608ceffb5f332d.gif"  />



## 数值型变量声明的细节

- 声明 float 后加 f 或 F ， 声明 long 后加 l 或 L

- “**保小不保大**”：整形常量默认为 int；整形常声明为 int，不足以表示大数，才用 long



## 浮点型的一些说明

1. 浮点数 = 符号位 + 指数位 + 尾数位

2. 尾数部分可能丢失，造成精度损失（小数都是近似值）

3. 浮点型常量默认为 bouble

4. ==两种表示形式==：

   - 十进制数形式：如：5.12	512.0f	.512（必须有小数点）

   - 科学计数法形式：如：5.12e2(5.12 * 10的二次方)	5.12E-2（5.12 / 10的二次方）

5. 通常情况下，应使用 double，它比 float 更精确

6. 浮点数陷阱：2.7 和 8.1 / 3 比较

   > 对运算结果是小数的进行判断应注意，小数都是近似值
   >
   > 恰当的做法为：判断两个数差值的绝对值是否在某个范围👇

```java
double num1 = 2.7;
double num2 = 8.1 / 3;
if(Math.abs(num1 - num2) < 0.00001) {
    System.out.println("相等~");
}
```



## 字符型的本质

**存储**：字符 👉 码值 👉 二进制 👉 存储

**读取**：二进制 👉 码值 👉 字符 👉 显示

![](C:\Users\16271\AppData\Roaming\Typora\typora-user-images\image-20220330112151460.png)



## 布尔类型

> boolean类型数据 ==只允许取值 true 和 false==，无 null，占用1个字节

适用于**逻辑运算**



## 数据类型转换



### 自动类型转换

自动：

- char 👉 int 👉 long 👉 float 👉 double

- byte、short 👉 int 👉 long 👉 float 👉 double

#### 注意和细节

1. 混合运算时，系统先自动将所有数据转换为容量最大的那种数据类型，然后再计算

   ```java
   int n1 = 10;
   float d1 = n1 + 1.1; // 错误 => 结果是 double
   //正确👇
   float d1 = n1 + 1.1F;
   double d1 = n1 + 1.1;
   ```

2. 大精度转小精度会报错

3. byte、short、char 之间不会相互自动转换

4. **byte、short、char** 三者可以计算，在 **计算时首先转换为 int**

   ```java
   byte b1 = 1;
   byte b2 = 2;
   byte b3 = b1 + b2; // 错误: b1 + b2 => int
   ```

5. boolean 不参与类型的自动转换



### 强制类型转换

强制：（data type）变量

注：==可能造成精度降低或溢出==

```java
int i = (int)1.9;
System.out.println(i); // 精度降低

int j = 100;
byte b = (byte)j;
System.out.println(b); // 数据溢出
```

#### 细节

1. 数据：==大 ——> 小==
2. 强转符号只针对于最近的操作数有效，往往使用小括号提升优先级



### 基本数据类型和String类型的转换

基本  =>  String：基本类型值 + " "

```java
int n1 = 100;
String s1 = n1 + "";
```



String  =>  基本：基本类型包装类调用parseXX方法

```java
//String->对应的基本数据类型
String s1 = "123";
int num1 = Integer.parseInt(s1);
double num2 = Double.parseDouble(s1);
boolean b = Boolean.parseBoolean("true");
char c = s1.charAt(0); // c = 1
```

#### 细节

- 确保格式正确，如果把"hello"，转成整数就会报错（异常处理详细讲）

# 运算符

> 运算符是一种特殊的符号，用以表示数据的运算、赋值和比较等



## 算术运算符

> 算术运算符是对数值类型的变量进行运算的

- 加减乘（与数学相同）、除、取模（取余）、自增自减（两种不同方法）、字符串相加

### 除法（ / ）

==与数学不同==，只取整数部分，舍弃小数部分，如：10 / 4 = 2



### 取模（ % ）

```java
// % 的本质：a % b = a - a / b * b;
System.out.println(10 % 3); // 1
System.out.println(-10 % 3); // -1
System.out.println(10 % -3); // 1
System.out.println(-10 % -3); // -1

// -10.5 % 3 => a - (int)a / b * b;
System.out.println(-10.5 % 3); // -1.5 (近似值)
```



### 自增（ ++ ）

前++：++i 先自增后赋值

后++：i++ 先赋值后自增

```java
int i = 8;
int j = ++i; // i = i + 1, j = i;
int m = 8;
int n = m++; // n = m, m = m + 1;
System.out.println(j+","+n); // 9,8
```

![](C:\Users\16271\AppData\Roaming\Typora\typora-user-images\image-20220331141400707.png)



## 关系（比较）运算符

> 关系运算符的结果都是boolean型，只有true或false

- ==、!=、<、>、<=、>=、instanceof（检查是否是类的对象）



## 逻辑运算符

> 用于连接多个条件（多个关系表达式），最终结果也是boolean值

- 短路与 &&，短路或 ||，取反 ！

- 逻辑与 &，逻辑或 |，逻辑异或 ^

**短路**现象：当第一个条件符合时，第二个条件不进行判断，==效率高==



## 赋值运算符

> 将某个运算后的值，赋给指定的变量

基本：=	int a = 10；

复合：+=、-=、*=、/=、%=等

```java
// += 举例，其他同理
int a = 10;
a += 10; // a = a + 10;
```

### 细节

1. 运算顺序从右往左

2. 赋值运算符**左边只能是变量**

3. 复合赋值运算符会进行 ==类型转换==

   ```java
   byte b = 3;
   b = b + 2; // 报错
   b += 2; // b = (byte)(b + 2);
   b++; // b = (byte)(b + 1);
   ```



## 三元运算符

> 判断 ? 表达式1 : 表达式2 ；
>
> 若判断为真，返回表达式1的值，为假则返回表达式2的值

### 细节

1. 表达式1和表达式2要为可以赋给接收变量的类型（或可以自动转换 / 强制转换）

   ```java
   int a = 1;
   int b = 2;
   int c = a > b ? (int)1.1 : (int)2.2; // 强制转换
   double d = a > b ? a : b + 1; // int -> double
   ```

2. 三元运算符可以转成 if-else 语句



### 练习

```java
//三个数的最大值
int n1 = 100;
int n2 = 200;
int n3 = 300;
//思路
//1.先得到两个中的最大数，保存到 max1
//2.然后用 max1 和剩下一个数比较，保存到 max2

int max1 = n1 > n2 ? n1 : n2;
int max2 = max1 > n3 ? max1 : n3;

//后边可以用更好方法，如排序
```



## 运算符优先级

> 优先级则为运算顺序
>
> **只有单目运算符、赋值运算符是从右往左运算的**

<img src="C:\Users\16271\AppData\Roaming\Typora\typora-user-images\image-20220401125637495.png"  />



# 标识符

> 给变量、方法和类等命名时使用的字符序列称为标识符
>
> 凡是可以自己起名字的地方都叫标识符

## 标识符命名规则==（必须遵守）==

1. 由26个英文字母大小写，0-9，_ 或 $  组成
1. 数字不能开头
1. 不可以使用关键字和保留字，但能包含
1. 严格区分大小写，长度无限制
1. 不能包含空格



## 标识符命名规范

- 包名：所有字母全小写，如：xxyy
- 类名、接口名：所有单词的首字母大写，如XxYy（大驼峰）
- 变量名、方法名：第二个单词开始每个单词的首字母大写，如：xxYyZz（小驼峰，简称驼峰法）
- 常量名：所有字母都大写，单词键用下划线连接，如：XXX_YYY



# 关键字和保留字

## 关键字

<img src="C:\Users\16271\AppData\Roaming\Typora\typora-user-images\image-20220401185942215.png"  />

<img src="C:\Users\16271\AppData\Roaming\Typora\typora-user-images\image-20220401190044068.png"  />



## 保留字

![](C:\Users\16271\AppData\Roaming\Typora\typora-user-images\image-20220401190146234.png)



# 键盘输入语句

> 扫描器（对象）：Scanner

## 方法

1. 引入 Scanner	**import java.util.Scanner;**或 **import java.util.*;**

2. 创建 Scanner 对象

   ```java
   Scanner sc = new Scanner(System.in); // sc 为 Scanner类的对象
   
   // 当程序执行到 next 方法时，会等待用户输入
   int a = sc.nextInt(); // 接收用户输入
   ```



# 进制

> 对于整数，有四种表示方式 
>
> - 二进制：0，1，满2进1。以 0b 或 0B 开头。
> - 十进制：0-9，满10进1。
> - 八进制：0-7，满8进1.以数字0开头表示。
> - 十六进制：0-9及A(10)-F(15)，满16进1.以 0x 或 0X 开头表示。此处A-F不区分大小写

## 进制转换（基本功）

### 其它 **->** 十

==按权展开求和==

#### 二转十

> 每位 * 2的（位数-1）次方，然后求和

#### 八转十

> 每位 * 8的（位数-1）次方，然后求和

#### 十六转十

> 每位 * 16的（位数-1）次方，然后求和



### 十 **->** 其它

==短除法==

#### 十转二

> 不断除2，直到商为0，然后将每步的余数倒过来

#### 十转八

> 不断除8，直到商为0，然后将每步的余数倒过来

#### 十转十六

> 不断除16，直到商为0，然后将每步的余数倒过来



### 二 **->** 八、十六

==先分组，再转换==

#### 二转八

> 从低位开始，每三位一组，转成对应八进制

#### 二转十六

> 从低位开始，每四位一组，转成对应十六进制



### 八、十六 -> 二

> 二转八 / 十六的逆转



# 位运算

## 原码、反码、补码

对于有符号而言：

1. **最高位是符号位**（0 ->0，1-> -）
2. **正数“三码合一”**
3. **负数反码**：符号位不变，其它位按位取反（0 ->1，1->0）
4. **负数补码 = 反码 +1**
5. **0 的反码、补码都是 0**
6. java中的数都是有符号的
7. **计算机以 ==补码的方式== 来运算**
8. **运算结果看 ==原码==**

## 位运算详解

![](C:\Users\16271\AppData\Roaming\Typora\typora-user-images\image-20220401205511486.png)

![](C:\Users\16271\AppData\Roaming\Typora\typora-user-images\image-20220401205551732.png)

![](C:\Users\16271\AppData\Roaming\Typora\typora-user-images\image-20220401205956785.png)



# 程序控制结构

## 顺序控制

> 程序从上到下逐行执行，中间没有任何判断和跳转



## 分支控制

> 让程序有选择的执行

### 单分支 if

![](C:\Users\16271\AppData\Roaming\Typora\typora-user-images\image-20220402114125693.png)



### 双分支 if-else

```java
if(){
    
}
else{
    
}
```

![](C:\Users\16271\AppData\Roaming\Typora\typora-user-images\image-20220402114429031.png)



### 多分支

```java
if(){
    
}
else if(){
    
}
else{
    
}
```

> 特别说明：1.多分支可以没有else，如果所有条件表达式都不成立，则没有执行入口
>
> 2.如果有else，条件都不成立时则默认执行else

![](C:\Users\16271\AppData\Roaming\Typora\typora-user-images\image-20220402115255823.png)



### 嵌套分支

> 在一个分支结构中完整的嵌套了另一个分支结构。规范：不要超过3层（可读性不好）

```java
if(){
    if(){
        //if-else...
    }else{
        //if-else...
    }  
}
```



### switch分支结构

```java
switch(表达式){
    case 常量1:
        语句块1;
        break;
    case 常量n:
        语句块n;
        break;
    default：
        default语句块;
        break;
}
```

#### 细节

1. 表达式数据类型和case后的常量**类型一致**，或是**可以自动转换**成可以比较的
2. swtich（表达式）中表达式的返回值必须是：==byte，short，int，char，enum（枚举），String==
3. **case返回值必须是常量**或**常量表达式**
4. default可有可无
5. 如果没有break，会一直执行，直到遇到break为止



### swtich 和 if 的选择

1. 判断的具体值不多，且符合byte、short、int、char、enum、String，建议用**switch**
2. **区间**判断，**结果为boolean**类型，用 **if**



## 循环控制

### for循环

> for (循环变量初始化；循环条件；循环变量迭代) {
>
> ​	循环操作（语句）；
>
> }

#### **执行循序**

> 循环变量初始化👉循环条件👉循环操作👉循环变量迭代

#### 流程图

![](C:\Users\16271\AppData\Roaming\Typora\typora-user-images\image-20220402124655351.png)

#### 细节

1. 循环条件返回boolean类型
2. 循环变量初始化和迭代可以放在 for 条件外，如：for(；循环条件；)
3. for(；；) 死循环 + break

#### 编程思想（例题）

> 1.化繁为简：将复杂的需求，拆解成简单的需求，逐步完成
>
> 2.先死后活：先考虑固定的值，再转换成可灵活变化的值

```java
//输出1-100中所有7的倍数的整数，并统计个数，求出总和
//思路分析
//化繁为简：(1)输出1-100所有整数
//		(2)7的倍数
//		(3)定义count变量统计个数
//		(4)定义sum变量求和
//先死后活：(1)输出范围改变 start end
//		(2)倍数改变 multiple
int count = 0; // 计数
int sum = 0; // 求和
int start = 1;
int end = 100;
int multiple = 7; // 倍数
for (int i = start; i <= end; i++){
    if(i % multiple == 0){
    	System.out.println(i);
        count++;
        sum += i;
    }
}
```





### while循环 （与for类似）

> while (循环条件) {
>
> ​	循环体(语句)；
>
> ​	循环变量迭代；
>
> }

#### 执行循序

循环条件👉循环体👉循环变量迭代

#### 流程图

![](C:\Users\16271\AppData\Roaming\Typora\typora-user-images\image-20220402132445073.png)





### do...while循环

> do{
>
> 循环体(语句)；
>
> 循环变量迭代；
>
> }while(循环条件)；

#### 执行顺序

先执行，再判断

#### 流程图

![](C:\Users\16271\Pictures\Saved Pictures\1648914625857.png)

#### 细节

- 最后有一个；分号

- 至少执行一次





### 多重循环

> 循环嵌套，一般使用两层，太多影响可读性
>
> **实质**：内层循环当成外层循环的循环体（内层循环为false时跳出内层）
>
> 循环次数 = 内层次数 * 外层次数

#### 九九乘法表

```java
// 九九乘法表
// 1 * 1 = 1
// 1 * 2 = 2  2 * 2 = 4
// ...
// 内层 * 外层 = 结果
public class MultiplicationTables{
	public static void main(String[] args){
		for (int i = 1; i <= 9; i++){
			for (int j = 1; j <= i; j++){
				System.out.print(j + "*" + i + "=" + (i * j) + '\t');
			}
			System.out.println();
		}
	}
}
```

#### 金字塔

```java
// 打印金字塔
//     *      第一层：四个空格
//    ***     第二层：三个空格
//   *****    第三层：两个空格
//  *******   第四层：一个空格
// *********  第五层：零个空格
//
// 思路分析：
//  1.打印矩形(5 * 5)，确定层数
//  2.打印直角三角形，确定*数
//  3.打印每行空格，空格数 = 总层数 - 当前层数
// 先死后活：
//  层数做变量
import java.util.Scanner;

public class Pyramid{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入金字塔的总层数：");
		int layer = sc.nextInt(); // 总层数
		for (int i = 1; i <= layer; i++){ // i表示金字塔层数
			
			for (int k = 1; k <= layer - i; k++){ // k表示每层空格数
				System.out.print(" ");
			}

			for (int j = 1; j <= 2 * i - 1; j++){ // j表示每层的*数
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
```

#### 空心金字塔

```java
// 打印空心金字塔
//     *     第一层：一个* 开头三个空格
//    * *    第二层：两个* 开头两个空格
//   *   *   第三层：两个* 开头一个空格
//  *******  第四层：七个* 开头零个空格
// 思路分析:
//  1.层数
//  2.每层开头空格数 = 总层数 - 当前层数
//  3.控制每层打印*数：除最后一层外，当前层第一位和最后一位打印*，其他打印空格
// 先死后活：
//  层数做变量
import java.util.Scanner;

public class HollowPyramid{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
         int layer = sc.nextInt();
         for (int i = 1; i <= layer; i++){ // i表示层数
			// 每层开头空格数
			for (int k = 1; k <= layer - i; k++){
				System.out.print(" ");
			}
			// 控制每层打印*数
			for (int j = 1; j <= 2 * i - 1; j++){
				
				// 只有第一位和最后一位打印*,最后一层全部打印*
				if (j == 1 || j == 2 * i - 1 || i == layer){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			// 每层打印完后换行	
			System.out.println();	
		}
	}
}
```

#### 空心菱形

```java
// 打印空心菱形
//   *    第一层：1个* 2个空格
//  * *   第二层：3个* 1个空格
// *   *  第三层：5个* 0个空格
//  * *   第四层：3个* 1个空格
//   *    第五层：1个* 2个空格
public class HollowDiamond{
	public static void main(String[] args) {
		// 上半部分
		for (int i = 1; i <= 3; i++) {
			// 空格
			for (int j = 1; j <= 3 - i; j++)
				System.out.print(" ");
			// *
			for (int k = 1; k <= 2 * i - 1; k++) {
				if(k == 1 || k == 2 * i - 1) {
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		// 下半部分
		for (int i = 2; i >= 1; i--) {
			// 空格
			for (int j = 1; j <= 3 - i; j++) {
				System.out.print(" ");
			}
			// *
			for (int k = 1; k <= 2 * i - 1; k++) {
				if(k == 1 || k == 2 * i - 1) {
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
```



## 跳转控制语句

> break、continue

### break

> 跳出当前层循环 或 结束case语句

```java
// 用 for + break 实现登录验证
// 有三次机会，如果用户名为“丁真”，密码为“666”提示登录成功，否则提示用户名或密码错误，还有几次机会
import java.util.Scanner;

public class Break {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 3; i++) {
			
			System.out.print("用户名：");
			String username = sc.next();
			
			System.out.print("密码：");
			String password = sc.next();
			
			if(username.equals("丁真") && password.equals("666")) {
				System.out.println("登录成功");
				break;
			}else {
				System.out.println("用户名或密码错误，还有" + (3 - i) + "次机会");
			}
		}
	}
}
```



### continue

> 跳出该次循环



### return

> return使用在方法，表示跳出所在的方法
>
> 如果用在主方法，退出程序



# 数组

> 数组：一组数据
>
> 存放多个同一类型的数据，是引用类型



## 一维数组的使用

### 步骤

声明and开辟空间👉元素赋值👉使用

### 1.动态初始化（声明并创建）

> 数据类型 数组名 [ ] = new 数据类型[ 大小 ] 
>
> int[ ] a = new int [2]; // 创建一个数组，存放2个int

### 1.5动态初始化（先声明再创建）

> int [ ]  a;
>a = new  int [2];

### 2.静态初始化

> int []  a = { 0,1,2 };



## 细节

- 数值型默认值 0 或 0.0，char默认 \u0000，boolean默认 false，String默认 null
- 数组下标(索引)从0开始
- 数组型数据是对象（object）



## 数组的赋值机制

> 引用赋值：数组在默认情况下是以引用传递，赋的值是地址

![](C:\Users\16271\AppData\Roaming\Typora\typora-user-images\image-20220406225408269.png)



## 数组常见算法

### 拷贝

```java
int[] arr1 = {1, 2, 3};
int[] arr2 = new int[arr1.length];
// 遍历arr1，对应元素拷贝到arr2
for (int i = 1; i < arr1.length; i++) {
    arr2 [i] = arr1[i];
}
```



### 翻转

```java
int[] arr = {1, 2, 3, 4, 5, 6};
// a[0] 和 a[5] 交换
// a[1] 和 a[4] 交换
// a[2] 和 a[3] 交换
// 交换了3次，arr.length / 2 次，a[i] 和 a[arr.length - 1 - i]交换
int temp = 0; // 临时变量用于交换
int len = arr.length;
for (int i = 1; i <= len / 2; i++) {
    temp = arr[len - 1 - i];
    arr[len - 1 - i] = arr[i];
    arr[i] = temp;
}
```



### 扩容

```java
int[] arr = {1, 2, 3};
// 创建新数组
int[] arrNew = new int[arr.length + 1];
// 遍历 arr数组，将元素拷贝到 arrNew
for (int i = 1; i < arr.length; i++) {
    arrNew[i] = arr[i];
}
// 将新元素添加到 arrNew
arrNew[arrNew.length - 1] = 4;
// arr 指向 arrNew
arr = arrNew;
```



### 缩减

```java
// 数组缩减
// 当缩减到最后一个元素时，提示结束
import java.util.Scanner;

public class ArrayReduce {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 数组初始化
			int[] arr = {1, 2, 3, 4};
		do {
			// 创建新数组，拷贝缩减一次后的 arr数组
			int[] arrNew = new int[arr.length - 1];
			for (int i = 0; i < arr.length - 1; i++) {
				arrNew[i] = arr[i];
			}
			// 输出缩减一次后的数组
			System.out.println("===缩减后的数组===");
			arr = arrNew;
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
             // 询问用户是否继续缩减
			System.out.println("还需要继续缩减吗？ y/n");	
			char key = sc.next().charAt(0);
			if(key == 'n') {
				break;
			}
			if(arr.length == 1) {
				System.out.println("元素不足，缩减结束...");
				break;
			}
		}while(true);
	}
}
```



### 冒泡排序

> 冒泡排序（Bubble Sorting）：像气泡一样一个一个冒出来
>
> 原理：将最大的数排在最后，次大的放在倒数第二位，以此类推
>
> 如果前边的数大于后边的数，就交换
>
> **缺点**：特殊情况下，一次就排好顺序，也会继续循环

```java
// 冒泡排序
public class BubbleSort {
	public static void main(String[] args) {
         int temp = 0;
		int[] arr = {2, 4, 1, 5, 3};
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				// 相邻元素比较
				if(arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
```



### 查找

```java
// 顺序查找
// 查找名字并输出下标
import java.util.Scanner;

public class SeqSearch {
	public static void main(String[] args) {
		// 定义一个字符串数组
		String[] names = {"老二","老六","老八"};
		Scanner sc = new Scanner(System.in);
		
		// 输入名字
		System.out.println("请输入名字");
		String findName = sc.next();
		
		// 遍历数组，逐一比较
		int index = -1;
		for (int i = 0; i < names.length; i++) {
			// equals 字符串比较
			if(findName.equals(names[i])) {
				System.out.println("恭喜你找到" + findName);
				System.out.println("下标 = " + i);
				index = i;
				break;
			}
		}
		
		if(index == -1) {
			System.out.println("哦~没找到");
		}
	}
}
```



## 二维数组

> 一维数组为元素的一维数组，即二维数组
>
> int[ ] [ ] arr = new int [一维长度] [二维长度];（二维长度 = 一维每个元素的长度）

### 原理

![image-20220408135257461](C:\Users\16271\AppData\Roaming\Typora\typora-user-images\image-20220408135257461.png)



### 关于使用的例题

> 打印如下：
> 1
> 2 2 
> 3 3 3

```java
public class TwoDimensionalArray {
	public static void main(String[] args) {
		int[][] arr = new int[3][]; // 创建二维数组，确定一维个数
		for (int i = 0; i < arr.length; i++) { // 遍历arr每一维数组
			// 给每个数组开辟空间，否则均为null
			arr[i] = new int[i + 1];
			// 遍历一维数组，并给每个元素赋值
			for (int j = 0; j < arr[i].length; j++) {
			arr[i][j] = i + 1;
			}
		}
		// 遍历arr输出
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
```



### 杨辉三角

```java
// 打印十行杨辉三角
// 1
// 1	1
// 1	2	1
// 1	3	3	1
// 1	4	6	4	1
// n行有n个数，首尾都是1，除首尾外每个数 = 上一行同一列数 + 上一行上一列数
public class YangHui {
	public static void main(String[] args) {
		// 行数确定，列数等于行数
		int[][] arr = new int[10][];
		for (int i = 0; i < arr.length; i++) { // 遍历二维数组第一维
			// 给每个一维数组（行）开辟空间
			arr[i] = new int[i];
			// 给每个一维数组（行）赋值
			for (int j = 0; j < arr[i].length; j++) {
				if(j == 0 || j == i - 1) { // 每行首尾都是1
					arr[i][j] = 1;
				}else {
					arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
				}
			}
		}
		// 输出杨辉三角
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
```



### 特殊声明

> int [ ]x,y[ ] x是int类型一维数组，y是int类型二维数组



