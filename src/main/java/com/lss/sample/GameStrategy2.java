package com.lss.sample;

/**
 * @author lss
 * @date 2018/06/21
 */
public class GameStrategy2 implements ThreeAndFiveGame{

    public void print(int num) {
        int single = num % 10;
        int ten = num / 10;
        /**
         * num is divisible by 3
         */
        boolean three = (num % 3 == 0) ;
        /**
         * 3 is in num
         */
        boolean inThree = ((ten == 3) || (single == 3));
        /**
         * num is divisible by 5 or 5 is in num
         */
        boolean five = (num % 5 == 0) ;
        /**
         * 5  is in num
         */
        boolean inFive = ((ten == 5) || (single == 5));

        if ((three || inThree) && (five || inFive)) {
            System.out.println("FizzBuzz");
        } else if (three || inThree) {
            System.out.println("Fizz");
        } else if (five || inFive) {
            System.out.println("Buzz");
        } else {
            System.out.println(num);
        }
    }
}
