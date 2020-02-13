package com.company;

public class Logic2 {
//  We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each)
//  and big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given
//  bricks.
    public boolean makeBricks(int small, int big, int goal){
        int bigCalculated = big * 5;
        return (goal % (small + bigCalculated) == 0 || goal % bigCalculated == 0);
    }
//  Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in the range
//  13..19 inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens.
//  Write a separate helper "public int fixTeen(int n) {"that takes in an int value and returns that value
//  fixed for the teen rule. In this way, you avoid repeating the teen code 3 times (i.e. "decomposition").
//  Define the helper below and at the same indent level as the main noTeenSum().
    public int noTeenSum(int a, int b, int c){
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }
//  Helper fixTeen static method
    public static int fixTeen(int num){
        if (num >= 13 && num <= 19){
            if (num != 15 || num != 16)
                return 0;
        }
        return num;
    }
//  Given 2 int values greater than 0, return whichever value is nearest to 21 without going over.
//  Return 0 if they both go over.
    public int blackjack(int a, int b){
        if (a > 21){
            if ( b > 21)
                return 0;
            return b;
        }
        else if (b > 21)
            return a;
        else if (a == b)
            return 0;
        return (21 - a) > (21 - b) ? b : a;

    }
//  Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the
//  values, it does not count towards the sum.
    public int loneSum(int a, int b, int c){
        if (a == b && b == c)
            return 0;
        else if (a == b)
            return c;
        else if (b == c)
            return a;
        else if (a == c)
            return b;
        return a + b + c;
    }
//  For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or
//  more, so 15 rounds up to 20. Alternately, round down to the previous multiple of 10 if its rightmost
//  digit is less than 5, so 12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded
//  values. To avoid code repetition, write a separate helper "public int round10(int num) {" and call it 3
//  times. Write the helper entirely below and at the same indent level as roundSum().
    public int roundSum(int a, int b, int c){
        return round10(a) + round10(b) + round10(c);
    }
//  Helper method
    public static int round10(int num){
        int remainder = num % 10;
        int quotient = num / 10;
        if (remainder >= 5)
            return 10 * (quotient + 1);
        else
            return 10 * quotient;
    }
//  Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three
//  values are evenly spaced, so the difference between small and medium is the same as the difference
//  between medium and large.
    public boolean evenlySpaced(int a, int b, int c){
        int big = Math.max(a, Math.max(b, c));
        int small = Math.min(a, Math.min(b, c));
        int mid;
        if (big > a && a > small)
            mid = a;
        else if (big > b && b > small)
            mid = b;
        else
            mid = c;
        return (big - mid) == (mid - small);
    }
//  Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count
//  towards the sum and values to its right do not count. So for example, if b is 13, then both b and c do
//  not count.
    public int luckySum(int a, int b, int c){
        if (a == 13)
            return 0;
        else if (b == 13)
            return a;
        else if (c ==13)
            return a + b;
        return a + b + c;
    }
//  Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while
//  the other is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes the
//  absolute value of a number.
    public boolean closeFar(int a, int b, int c){
        int ab = Math.abs(a - b);
        int ac = Math.abs(a - c);
        int bc = Math.abs(b - c);
        return (ab <=1 && (ac >= 2 && bc >= 2)) || (ac <=1 && (ab >= 2 && bc >= 2));
    }
// We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars
// (5 kilos each). Return the number of small bars to use, assuming we always use big bars before small
// bars. Return -1 if it can't be done.
    public int makeChocolate(int small, int big, int goal){
        int bigSlab = big * 5;
        int smallNeeded = goal - bigSlab;
        if (smallNeeded == small)
            return small;
        else
            return smallNeeded - small;
    }

    public static void main(String[] args) {
        Logic2 obj = new Logic2();
    }

}


/*
* Test Cases:
*
        System.out.println("makeChocolate(4,1,9) -> "+ obj.makeChocolate(4, 1, 9));
        System.out.println("makeChocolate(4,1,10) -> "+ obj.makeChocolate(4, 1, 10));
        System.out.println("makeChocolate(4,1,7) -> "+ obj.makeChocolate(4, 1, 7));
        System.out.println("closeFar(1,2,10) -> "+obj.closeFar(1,2,10));
        System.out.println("closeFar(1,2,3) -> "+obj.closeFar(1,2,3));
        System.out.println("closeFar(4,1,3) -> "+obj.closeFar(4,1,3));
        System.out.println("luckySum(1,2,3) -> "+obj.luckySum(1,2,3));
        System.out.println("luckySum(1,2,13) -> "+obj.luckySum(1,2,13));
        System.out.println("luckySum(1,13, 3) -> "+obj.luckySum(1,13, 3));
        System.out.println("evenlySpaced(2,4,6) -> " + obj.evenlySpaced(2,4,6));
        System.out.println("evenlySpaced(4,6,2) -> " + obj.evenlySpaced(4,6,2));
        System.out.println("evenlySpaced(4,6,3) -> " + obj.evenlySpaced(4,6, 3));
        System.out.println("roundSum(16, 17, 18) -> "+obj.roundSum(16,17,18));
        System.out.println("roundSum(12, 13, 14) -> "+obj.roundSum(12,13,14));
        System.out.println("roundSum(6, 4, 4) -> "+obj.roundSum(6,4,4));
        System.out.println("roundSum(36, 24, 14) -> "+obj.roundSum(36,24,14));
        System.out.println("loneSum(1, 2, 3) -> "+obj.loneSum(1, 2, 3));
        System.out.println("loneSum(3, 2, 3) -> "+obj.loneSum(3, 2, 3));
        System.out.println("loneSum(3, 3, 3) -> "+obj.loneSum(3, 3, 3));
        System.out.println("blackjack(19, 21) -> "+obj.blackjack(19, 21));
        System.out.println("blackjack(21, 19) -> "+obj.blackjack(21, 19));
        System.out.println("blackjack(19, 22) -> "+obj.blackjack(19, 22));
        System.out.println("noTeenSum(1, 2, 3) ->"+ obj.noTeenSum(1, 2, 3));
        System.out.println("noTeenSum(2, 13, 1) ->"+ obj.noTeenSum(2, 13, 1));
        System.out.println("noTeenSum(2, 1, 14) ->"+ obj.noTeenSum(2, 1, 14));
        System.out.println("makeBricks(3, 1, 8) -> "+obj.makeBricks(3,1,8));
        System.out.println("makeBricks(3, 1, 9) -> "+obj.makeBricks(3,1,9));
        System.out.println("makeBricks(3, 2, 10) -> "+obj.makeBricks(3,2,10));
*
* */