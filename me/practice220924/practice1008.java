package me.practice220924;
//두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
//첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.

import java.util.Scanner;

public class practice1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println(a / b);
    }
}
