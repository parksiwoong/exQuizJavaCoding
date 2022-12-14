package org.example;

import java.util.Scanner;

/**
 * @todo 중복문자제거
 *
 * @설명: 소문자로 된 한개의 문자열이 입력되면 중복된 문자열을 제거하고 출력하는 프로그램을 작성하세요.
 *          중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
 *
 * @입력: 첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.
 * @출력: 첫 줄에 중복문자가 제거된 문자열을 출력합니다.
 * @예시: ksekkeset 출력: kset
 * */
public class 중복문자제거_6 {

    /** 중복문자 제거할 메서드 */
    public String solution(String str){
        String answer = "";
        for(int i=0; i<str.length(); i++){
           // System.out.println(str[i]+ " " + i + " " + str.indexOf(str.charAt(i)));
            //charAt으로 처음인 i의 []자리와 그냥 i의 글자 [] 주소 자리와 같을때 보여줌
            if(str.indexOf(str.charAt(i))==i) answer += str.charAt(i); //charAt가 처음으로 발견될때 쓰는 내부함수
        }
        return answer;
    }

    public static void main(String[] args) {
        중복문자제거_6 T = new 중복문자제거_6();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
