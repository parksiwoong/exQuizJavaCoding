package org.example;

/*문장 속 단어*/
/* 설명 */
/*한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성*/

/* 입력 */
/* 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다. */

/* 출력 */
/* 첫 줄에 가장 긴 단어를 출력한다 . 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞족에 위치한 단어를 답으로 합니다 */

/* 에시 */    /* it is time to study */
/*예시출력*/    /* study */
import java.util.Scanner;

public class sentenceInWord_3 {
    public String solution(String str){
        String answer = "";
        int m = Integer.MIN_VALUE; //가장 작은값으로 초기화
        String[] s = str.split(" ");
        for(String x : s){ // s라는 배열에 x배열순번 순차적으로 [0] [1] [2]..
            int len=x.length(); // 길이 구하고
            if(len>m){
                m = len ;
                answer = x ;
            }
            //System.out.println(x);
        }

        return answer;
    }

    public static void main(String[] args){
        sentenceInWord_3 T = new sentenceInWord_3();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine(); //한문장을 받는거
        System.out.println(T.solution(str));
    }
}
