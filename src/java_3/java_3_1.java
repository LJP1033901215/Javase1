package java_3;

import java.util.Scanner;

public class java_3_1 {
    public static void main(String[] args){
        Scanner name = new Scanner(System.in);
        int score=68;
        String mark = name2(score);
        System.out.println("考试成绩如何："+mark);
    }
    public static String name2(int x){
        if (x>=60){
            return "及格";
        }


        return  "不及格";
    }
}

