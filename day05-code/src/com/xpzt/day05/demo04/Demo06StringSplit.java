package com.xpzt.day05.demo04;

public class Demo06StringSplit {

    public static void main(String[] args) {
        //按照参数的规则，将字符串分成若干部分
        String[] split = "aaa,bbb,ccc".split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
        System.out.println("============");

        //如果按照英文句点 "."进行切分，必须写"\\."
        String[] split1 = "XXX.YYY.ZZZ".split("\\.");
        for (int i = 0; i < split1.length; i++) {
            System.out.println(split1[i]);
        }
    }
}
