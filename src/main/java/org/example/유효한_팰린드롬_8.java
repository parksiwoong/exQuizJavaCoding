package org.example;

import java.util.Locale;
import java.util.Scanner;

/** 8. 유요한 팰린드롬
 *
 *
 * @설명: 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.'
        문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES" 아니면 "NO"를 출력하는 프로그램 작성
        단 회문을 검사 할때 알파뱃만 가지고 회문을 검사하며, 대소문자를 구분하지 않음
 * @입력: 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
 * @출력: 첫 번째 줄에 팰린드롬인지의 결과를 YES또는 NO 로 출력합니다.
 * */
public class 유효한_팰린드롬_8 {

    public String solution(String s){
        String answer = "NO";
        s = s.toUpperCase().replaceAll("[^A-Z]","");
        String tmp = new StringBuilder(s).reverse().toString();
        if(s.equals((tmp))) answer="YES";
        System.out.println(s);

    return answer;
    }

    public static void main(String[] args) {
        유효한_팰린드롬_8 T = new 유효한_팰린드롬_8();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
