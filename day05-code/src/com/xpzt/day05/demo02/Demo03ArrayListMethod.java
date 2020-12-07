package com.xpzt.day05.demo02;

import java.util.ArrayList;

//public boolean add(E e) - 添加
//public E get(int index) - 获取
//public E remove(int index) - 删除
//public int size() - 长度 - 元素个数
public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        boolean success = list.add("迪丽热巴");
        System.out.println(list);
        System.out.println("添加成功 " + success);
        list.add("古力娜扎");
        list.add("丁真");
        list.add("哈妮克孜");
        System.out.println(list);
        String nameOne = list.get(3);

        System.out.println("第三个索引是 ：" + nameOne);

        String nameTwo = list.remove(2);
        System.out.println("被删除的人是 ：" + nameTwo);
        System.out.println(list);

        int sz = list.size();
        System.out.println("总共" + sz + "个人");
    }
}
