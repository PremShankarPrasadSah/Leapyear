package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int year = 1950;
        int n = 20;
        int count = 0;
        while (count!=n){
            year =year +1;
            if ((year%400==0)||(year%4==0)&&(year%100!=0)){
                count++;
                System.out.println(count);
                System.out.println(year);
            }

        }
    }
}
