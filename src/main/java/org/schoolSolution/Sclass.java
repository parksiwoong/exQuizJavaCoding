package org.schoolSolution;

public class Sclass {

    public static void main(String[] args) {
        int mark = 10;
        Test t =new Test(mark);
        t.show(mark-1);

    }
}

class Test{
    int[] numbers;
    Test(int a){
      numbers = new int[a];
      make();
    }
    void make(){
        int i;
        for(i=0; i<numbers.length; i++){
            numbers[i] =i*2;
        }

    }
    void show(int a){
        System.out.println(numbers[a] + "<<<<<<");
    }
}