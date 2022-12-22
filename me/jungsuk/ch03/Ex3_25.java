package me.jungsuk.ch03;

import java.util.Scanner;

public class Ex3_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = ' ';

        System.out.printf("문자를 하나 입력하세요.>");

        String input = scanner.nextLine();
        ch = input.charAt(0);

        if('0' <= ch && ch <= '9') {
            System.out.printf("입력하신 문자는 숫자입니다.%n");
        }
        if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
            System.out.printf("입력하신 문자는 영문자입니다.%n");
        }
    }
}
//실행결과1
//문자를 하나 입력하세요.>7
//입력하신 문자는 숫자입니다.
//실행결과2
//문자를 하나 입력하세요.>a
//입력하신 문자는 영문자입니다.