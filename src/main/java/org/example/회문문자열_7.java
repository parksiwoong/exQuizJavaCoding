package org.example;

import java.util.Scanner;

/**
 * @todo 7. 회문 문자열
 *
 * @설명: 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
 * 문자열이 입력되면 해당 문자열이 회문 문자열이면"YES", 회문 문자열이 아니면 NO를 출력하는 프로그램을 작성하세요
 * 단 회문을 검사할 때 대소문자를 구분하지 않습니다.
 *
 * @입력: 첫줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
 * @출력: 첫 번재 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력합니다.
 * @예시: gooG  출력: YES
* */

public class 회문문자열_7 {

    public String solution(String obj) {
        String answer = "YES"; //YES NO 반환
        //1번째 방법
   /*     obj= obj.toUpperCase();
        int len = obj.length();
        for (int i = 0; i < len / 2; i++) {
            if(obj.charAt(i) != obj.charAt(len)){
                answer = "NO";
            }
        }*/

        //2번째 방법
        String tmp = new StringBuilder(obj).reverse().toString(); //뒤집기
        if(obj.equalsIgnoreCase(tmp)) //tmp 뒤집은거랑 obj랑 같냐 equals 뒤에 IgnoreCase 함수 붙으면 대소문자 구분 없이 해줌
        {
            answer  = "YES";
        }
        return answer;
    }
    public static void main(String[] args) {
        회문문자열_7 T = new 회문문자열_7();
        Scanner sc = new Scanner(System.in);
        String obj = sc.next();
        System.out.println(T.solution(obj));
    }
}
