package org.schoolSolution;


public class Sclass_2 {
    public static void main(String[] args) {
        Test2 t = new Test2(100);
        for(t.i=1;t.i<=t.num; t.i++){
            t.sum+= t.i;
        }
        System.out.println(t.sum +"*****sum");
    }
}
class Test2 {
    int num,i;
    int sum = 0;
    Test2(){
        num = 10;
    }
    Test2(int a){
        num = a;
    }
}