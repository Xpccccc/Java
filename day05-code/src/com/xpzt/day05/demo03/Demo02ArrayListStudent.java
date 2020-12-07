package com.xpzt.day05.demo03;

import java.util.ArrayList;

/*自定义四个学生对象，添加到集合，并遍历
 * */
public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student one = new Student("迪丽热巴", 20);
        Student two = new Student("古力娜扎", 22);
        Student three = new Student("丁真", 27);
        Student four = new Student("哈妮克孜", 40);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        for (int i = 0; i < list.size(); i++) {
            //list.get(i)是Student类型
            System.out.println("我叫："+list.get(i).getName()+", 年龄"+list.get(i).getAge());
        }
    }
}
