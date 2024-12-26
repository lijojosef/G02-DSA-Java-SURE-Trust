package com.lijo.basics;

public class Conditionals {
    public static void main(String[] args) {
        int salary = 25400;

        // simple if statment:
        /*if (salary > 1000){
            salary = salary + 2000;
        }
        else{
            salary += 1000; //salary = salary + 1000;
        }

        System.out.println("new salary = " + salary);*/


        //multiple if statments
        if (salary > 10000){
            salary = salary + 2000;
        }
        else if(salary > 20000){
            salary += 3000;
        }
        else{
            salary += 1000; //salary = salary + 1000;
        }
    }
}
