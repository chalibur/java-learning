
## 一、String 速查 6 条

1. String 不可变：每次“修改”都是产生新对象，循环里拼字符串别用 +，用 StringBuilder。
2. equals 比内容，== 比地址。字面量都在常量池里，所以 "abc" == "abc" 是 true，但别依赖这个，内容比较永远用 equals。
3. substring(begin, end) 包头不包尾：substring(1, 3) 取的是下标 1、2。
4. length() 是方法（字符串的），数组的 length 是属性，别混了。
5. StringBuilder：append 拼、toString 转回 String、reverse 反转。
6. 遍历字符串就靠 charAt(i) + length()：统计字符、反转、拼接都是这套。

## 二、多态—接口链 4 句

1. 编译看左边，运行看右边：父类引用调子类重写的方法，运行的是子类的实现。
2. 抽象类 = 没写完的骨架：抽共性、强制子类重写抽象方法、自己不能 new。
3. 接口 = 能力清单：一个类能实现多个接口，绕开单继承的限制。
4. final 锁的是指向不是内容：final StringBuilder 引用不能再指别人，但里面的内容还能 append。

## 三、自测

1. String s1 = "abc"; String s2 = "abc"; s1 == s2 的结果是？为什么？
2. "hello".substring(1, 3) 的结果是？
3. Animal a = new Dog(); a.eat() 运行的是谁的方法？编译时看谁？
4. 一句话说抽象类和接口的区别。
5. final StringBuilder sb = new StringBuilder("a"); sb.append("b"); 能编译吗？为什么？

答案：1. true，两个字面量在同一个常量池；2. "el"；3. 运行 Dog 的，编译看 Animal 有没有 eat；4. 抽象类是没写完的骨架管共性，接口是能力清单管“会什么”；5. 能，final 锁的是 sb 这个引用不能换对象，append 改的是对象内部。

## 四、顺序

4 道以上对就直接开干：先 20 分钟把 Test2 按 8 拆分、Test3 打乱、Test4 大整数加法这三件热身做了，再开第 12 章下一节。

Test2：长度正好是 8 的倍数时会多补 8 个 0，补 0 个数改成 (8 - 长度 % 8) % 8。
Test3：randomIndex 只在循环外生成了一次，要移进循环里每次重生成。
Test4：大整数相加（超出 int 范围的两个字符串相加），还没写。

