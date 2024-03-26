# lambda 表达式
## 0. 概述
```text
为了搞懂
    1. 给arrays.sort()方法传参
        //创建二维数组列表
        List<int[]> list = new ArrayList<>();
        //按照数组的第二个元素排序
        list.sort((a, b) -> a[1] - b[1]);
    2. 创建大顶堆 
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
```

## 1. 什么是 lambda 表达式
```text
lambda 表达式是一个匿名函数，可以理解为一段可以传递的代码。
```
## 2. 为什么要使用 lambda 表达式
```text
1. 代码更简洁   
2. 代码更易读
3. 代码更易维护
```
## 3. lambda 表达式的语法
```text
1. 语法格式
    (parameters) -> expression
    或
    (parameters) -> { statements; }
2. 参数
    可以是零个、一个或多个参数
    参数的类型可以明确声明，也可以根据上下文推断
3. 箭头符号
    箭头符号将参数列表和 lambda 表达式的主体分开
4. 主体
    包含在 lambda 表达式中的代码
```
* 说明

  * 最原始的写法

    * `Comparator` 是一个接口，接口中有一个抽象方法 `compare`，这里使用匿名内部类的方式实现接口中的抽象方法
    * 
    ```java
      Comparator<Integer> comparator = new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
      return Integer.compare(o1, o2);
      }
      };
      System.out.println(comparator.compare(1, 2));
      // 输出 -1
      }
	
	
	
	* 使用 lambda 表达式
	
	  * 前提条件：接口中**只有**一个抽象方法（函数式接口，@FunctionalInterface修饰）。所以可以只保留参数列表和方法体，去掉方法名和返回值类型。如果只有返回值，可以去掉大括号和 return。
	    比如`Comparator<Integer> comparator = (o1,o2) -> Integer.compare(o1, o2);
	       ;`。参数列表的类型是通过前面的`<Integer>`来推断的
	
	    * ```java
	      //推断
	      int[] a=new int[]{1,2,3,4};
	      //上述代码可以简化写成
	      int[] array={1,2,3,4}
	      
	      ```
	    
	  * ```java
	    Comparator<Integer> comparator = (o1,o2) -> {
	              return Integer.compare(o1, o2);
	         };
	          System.out.println(comparator.compare(1, 2));
	      // 输出 -1
	     
	    ```
	  
	    
	  
	    
	

## 4. lambda 表达式的使用
```text
1. 作为参数传递给方法
2. 作为返回值返回给方法
3. 作为局部变量使用
```
## 回归问题
### 给`arrays.sort()`方法传参

* 说明
  * 升序排列用`(o1,o2) -> o1[0]-o2[0]` 降序就用`(o1,o2) -> o2[0]-o1[0]`,后面谁减谁是可以实现降序还是升序是java8约定的，记住就行

* 实现

  * ```java
    //创建二维数组
            int[][] arr = new int[][]{{1,2},{3,4},{5,6}};
            //按照数组的第一个元素降序排列
            Arrays.sort(arr, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    //返回值为正数时，o1在o2后面；返回值为负数时，o1在o2前面；返回值为0时，o1和o2相等，数组顺序不变
                    return o2[0]-o1[0];
                }
            });
            //用lambda表达式实现
            Arrays.sort(arr, (o1, o2) -> o2[0]-o1[0]);
            //输出排序后的数组
            for (int[] ints : arr) {
                System.out.println(Arrays.toString(ints));
            }
    ```



### 创建大顶堆

