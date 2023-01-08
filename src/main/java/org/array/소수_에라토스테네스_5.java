package org.array;

import java.util.ArrayList;
import java.util.Scanner;


/** 소수(에라토스테네스체)
 *
 * 소수를 구하는 방법중에선 에라토스테네스체가 제일 빠르다 . (제곱수보다 빠름)
 *
 * 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
 * 만약 20이 되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개 입니다.
 * 제한시간은 1초입니다.
 *
 * @입력설명: 첫줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
 * @출력설명: 첫 줄에 소수으 개수를 출력합니다.
 *
 * @입력예제: 20
 * @출력예제: 첫 줄에 소수의 개수를 출력합니다.
 *
 */

public class 소수_에라토스테네스_5 {
    public int solution(int n){
        int answer = 0; //엔서로 카운팅할거
        int[] ch = new int[n+1] //인덱스 예를들어 20개면 21을 줘야 20까지 나옴
        for(int i=2; i<=n; i++){
            if(ch[i]==0){
                answer++;
                for(int j=i; j<=n; j=j+i) ch[j]=1;  //20넣으면 2
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        소수_에라토스테네스_5 T = new 소수_에라토스테네스_5();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }
}