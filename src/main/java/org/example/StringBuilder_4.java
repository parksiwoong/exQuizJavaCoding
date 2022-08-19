package org.example;


import java.lang.reflect.Array;
import java.util.*;

//n개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램
//예시 dog  => god
public class StringBuilder_4 {
    public ArrayList<String> solution(int n, String[] str){
          ArrayList<String> answer = new ArrayList<>();
        /*for(String x : str){      //reverse로 뒤집는거 해봄
            String tmp = new StringBuilder(x).reverse().toString(); //x의 단어로 스트링빌더로 하나의 단어를 만들어줌, reverse는 하나하나 뒤집음 , toString으로 객체화 시켜줌
            answer.add(tmp);
        }*/
        for(String x : str){
                char[] s = x.toCharArray(); //문자 배열화
                int lt=0, rt=x.length()-1;
                while (lt < rt){
                    char tmp=s[lt];
                    s[lt]=s[rt];
                    s[rt]=tmp;
                    lt++;
                    rt--;
                }
                String tmp = String.valueOf(s); //스트링화 다시 시켜야함 valueof가 s를 스트링화 시켜줌 valueof는 스테틱으로 선언된 클래스다
                answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args){
        StringBuilder_4 T = new StringBuilder_4();
        Scanner kb = new Scanner(System.in);
        //Scanner in = new Scanner(System.in);
//        int input1 = in.nextInt();
//        int input2 = in.nextInt();

        int n = kb.nextInt();
        String[] str = new String[n];
        for(int i = 0 ; i < n; i++){
            str[i]= kb.next();
        }
        for(String x : T.solution(n, str)){
            System.out.println(x);
        }
    }
}
