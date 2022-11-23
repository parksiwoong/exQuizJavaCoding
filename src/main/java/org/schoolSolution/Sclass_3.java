package org.schoolSolution;

public class Sclass_3 {
    public static void main(String[] args) {

        int p;

        int j = 0;
        for(p=1; p<=10; p++){
            if(p % 2 == 1 ){
                j += p;
            }else {
                j -= p;
            }
        }
        System.out.println(j  + "*******");

    }
}
