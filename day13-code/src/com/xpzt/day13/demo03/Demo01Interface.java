package com.xpzt.day13.demo03;

import java.util.ArrayList;
import java.util.List;
/*java.util.List是ArrayList所实现的接口*/

public class Demo01Interface {

    public static void main(String[] args) {
        //左边是接口名称，右边是实现类名称，这就是多态写法
        List<String> list = new ArrayList<>();

        List<String> result = addNames(list);
        System.out.println(result);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static List<String> addNames(List<String> list) {
        list.add("玛尔扎哈");
        list.add("迪丽热巴");
        list.add("哈妮克孜");
        return list;
    }
}
