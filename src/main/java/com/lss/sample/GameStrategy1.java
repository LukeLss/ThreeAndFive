package com.lss.sample;

/**
 * @author lss
 * @date 2018/06/21
 */
public class GameStrategy1 implements ThreeAndFiveGame{

    public void print(int num) {
        /**
         * num is divisible by 3
         */
        boolean three = (num % 3 == 0);
        /**
         * num is divisible by 5
         */
        boolean five = ((num % 5 == 0));

        if (three && five) {
            System.out.println("FizzBuzz");
        } else if (three) {
            System.out.println("Fizz");
        } else if (five) {
            System.out.println("Buzz");
        } else {
            System.out.println(num);
        }
    }
}
