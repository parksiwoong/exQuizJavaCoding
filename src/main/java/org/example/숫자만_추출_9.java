package org.example;

import java.util.Scanner;

/**
 * 9_숫자만 추출
 *
 * @설멍: 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
        만약 "tge0a1h205er"에서 숫자만 추출하면 0,1,2,0,5 이고 이것을 자연수를 만들면 1205이 됩니다.
        추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
* @입력: 첫줄에서 숫자가 썩인 문자열이 주어집니다. 문자열의 길이는 100을 넘지 않습니다.
 * @출력: 첫 줄에 자연수를 출력합니다.
 * @예시: g0en2T0s8eSoft 출력: 208 */
public class 숫자만_추출_9 {

         public int soultion(String s){

              //아스키넘버로 하는 방법
                int answer= 0;
                for(char x : s.toCharArray()){
                        if(x>=48 && x<=57) answer = answer * 10+(x-48);
                }
            //스트링
              String answer2 = "";
                for(char x : s.toCharArray()){
                    if(Character.isDigit(x)) answer2 +=x;  //isDigit 숫자냐? 확인할때
                }

                //return answer; //아스키넘버
             return Integer.parseInt(answer2);
         }

        public static void main(String[] args) {
                숫자만_추출_9 T = new 숫자만_추출_9();
                Scanner kb = new Scanner(System.in);
                String str = kb.next();
                System.out.println(T.soultion(str));
        }
}
