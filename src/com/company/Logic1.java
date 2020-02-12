package com.company;

public class Logic1 {
//  When squirrels get together for a party, they like to have cigars.
//  A squirrel party is successful when the number of cigars is between 40 and 60, inclusive.
//  Unless it is the weekend, in which case there is no upper bound on the number of cigars.
//  Return true if the party with the given values is successful, or false otherwise.
    public boolean cigarParty(int cigarCount, boolean isWeekend){
        boolean success = false;
        if (isWeekend){
            return cigarCount > 40;
        }
        return cigarCount >= 40 && cigarCount <= 60;
    }
//  You are driving a little too fast, and a police officer stops you. Write code to compute the result,
//  encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less,
//  the result is 0. If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more,
//  the result is 2.Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
    public byte caughtSpeeding(int speed, boolean birthdayToday){
        if (birthdayToday){
            if (speed >= 66 && speed <= 85)
                return (byte)1;
            else if (speed > 85)
                return (byte)2;
        }
        else{
            if (speed >= 61 && speed <= 80)
                return (byte)1;
            else if (speed > 80)
                return (byte)2;
        }
        return (byte)0;
    }
//  The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6.
//  Or if their sum or difference is 6. Note: the function Math.abs(num) computes the absolute value of a
//  number.
    public boolean love6(int a, int b){
        return (a == 6 || b == 6) || Math.abs(a -b) == 6 || (a + b == 6);
    }
//  Return true if the given non-negative number is 1 or 2 more than a multiple of 20.
    public boolean more20(int number){
        return Math.abs( 20 - number) == 1 || Math.abs(20 - number) == 2;
    }
//    Given a non-negative number "num", return true if num is within 2 of a multiple of 10.
    public boolean nearTen(int num){
        if (num / 10 >= 1){
            int remainder = num % 10;
            if (remainder > 5)
                return Math.abs(10 - remainder) <= 2;
            return remainder <= 2;
        }
        return num <= 2 || num >= 8;
    }
//  We are having a party with amounts of tea and candy. Return the int outcome of the party encoded as
//  0=bad, 1=good, or 2=great. A party is good (1) if both tea and candy are at least 5. However, if either
//  tea or candy is at least double the amount of the other one, the party is great (2). However, in all cases,
//  if either tea or candy is less than 5, the party is always bad (0).
    public byte teaParty(int tea, int candy){
        if (candy >= 5 && tea >= 5){
            if ((candy >= 2*tea) || (tea >= 2*candy))
                return (byte)2;
            return (byte)1;
        }
        return (byte)0;
    }
//  Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
    public boolean twoAsOne(int a, int b, int c){
        return (( a == (b + c)) || ( b == (a + c)) || ( c == (b + a)));
    }
//  Given three ints, a b c, return true if two or more of them have the same rightmost digit.
    public boolean lastDigit(int a, int b, int c){
        return (a % 10 == b % 10) || (a % 10 == c % 10) || (b % 10 == c % 10);

    }
//  Given two int values, return whichever value is larger. However if the two values have the same
//  remainder when divided by 5, then the return the smaller value. However, in all cases, if the two
//  values are the same, return 0. Note: the % "mod" operator computes the remainder, e.g. 7 % 5 is 2.
    public short maxMod(int a, int b){
        if (a == b)
            return (short)0;
        if ( a % 5 == b % 5)
            return (short)Math.min(a,b);
        return (short)Math.max(a , b);
    }
//  You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs, which we'll call
//  ab, bc, and ac. Consider the sum of the numbers in each pair. If any pair sums to exactly 10, the result
//  is 10. Otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5. Otherwise
//  the result is 0.
    public short blueTicket(int a, int b, int c){
        int ab = a+b, ac = a+c, bc = b +c;
        if (ab == 10 || ac == 10 || bc == 10)
            return (short)10;
        else if (ab == ac + 10 || ab == bc + 10)
            return (short)5;
        return (short)0;
    }
//  You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness of
//  your clothes, in the range 0..10, and "date" is the stylishness of your date's clothes. The result
//  getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes. If either of you is very
//  stylish, 8 or more, then the result is 2 (yes). With the exception that if either of you has style of 2
//  or less, then the result is 0 (no). Otherwise the result is 1 (maybe).
    public short dateFashion(int you, int date){
        if (you <= 2 || date <= 2)
            return (short)0;
        else if(you >= 8 || date >= 8)
            return (short)2;
        return (short)1;
    }
//  Given 2 ints, a and b, return their sum.
//  However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.
    public short sortaSum(int a, int b){
        if (a + b >= 10 && a + b <= 19)
            return (short)20;
        return (short)( a + b);
    }
//  Given a number n, return true if n is in the range 1..10, inclusive. Unless outsideMode is true,
//  in which case return true if the number is less or equal to 1, or greater or equal to 10.
    public boolean in1To10(int n, boolean outsideMode){
        if (outsideMode)
            return n <= 1 || n >= 10;
        return n >= 1 && n <= 10;
    }
//  Return true if the given non-negative number is a multiple of 3 or 5, but not both.
    public boolean old35(int num){
        return (num % 3 == 0 || num % 5 == 0) && (num % 15 != 0);
    }
//  Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19
//  inclusive, are extra lucky. So if either value is a teen, just return 19.
    public byte teenSum(int a, int b){
        if (( a >= 13 && a <= 19) || ( b >= 13 && b <= 19))
            return (byte)19;
        return (byte)(a + b);
    }
//  Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return
//  "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the
//  string unchanged.
    public String fizzString(String string){
        String str = string.toLowerCase();
        if(str.charAt(0) == 'f' && str.charAt(str.length() -1) == 'b')
            return "FizzBuzz";
        else if (str.charAt(0) == 'f')
            return "Fizz";
        else if (str.charAt(str.length() - 1) == 'b')
            return "Buzz";
        else
            return str;
    }
//  Given three ints, a b c, return true if b is greater than a, and c is greater than b. However, with the
//  exception that if "bOk" is true, b does not need to be greater than a.
    public boolean inOrder(int a, int b, int c, boolean bOk){
        if (bOk)
            return c > b;
        return (b > a) && (c > b);
    }
//  Given three ints, a b c, return true if one of them is 10 or more less than one of the others.
    public boolean lessBy10(int a, int b, int c){
        return (a >= 10 + b) || (a >= 10 + c) || (b >= 10 + a) || (b >= 10 + c) || (c >= 10 + b) || (c >= 10 + a);
    }
//  You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2. If they are all
//  the value 2, the result is 10. Otherwise if they are all the same, the result is 5. Otherwise so long
//  as both b and c are different from a, the result is 1. Otherwise the result is 0.
    public int redTicket(int a, int b, int c){
        if ( a == 2 && b == 2 && c ==2)
            return 10;
        else if (a == b && a == c)
            return 5;
        else if (a != b && a != c)
            return 1;
        else
            return 0;
    }
//  Given two ints, each in the range 10..99, (2 digits) return true if there is a digit that appears in
//  both numbers, such as the 2 in 12 and 23.
    public boolean shareDigit(int a, int b){
        int a_tens = a / 10, a_ones = a % 10, b_tens = b / 10, b_ones = b % 10;
        if (b_ones == a_ones || b_ones == a_tens || b_tens == a_tens || b_tens == a_ones)
            return true;
        return false;
    }
//  The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature
//  is between 60 and 90 (inclusive). Unless it is summer, then the upper limit is 100 instead of 90.
//  Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.
    public boolean squirrelPlay(int temperature, boolean isSummer){
        if (isSummer)
            return temperature >= 60 && temperature <= 100;
        return temperature >= 60 && temperature <= 90;
    }
//  Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are
//  on vacation, return a string of the form "7:00" indicating when the alarm clock should ring. Weekdays,
//  the alarm should be "7:00" and on the weekend it should be "10:00". Unless we are on vacation -- then
//  on weekdays it should be "10:00" and weekends it should be "off".
    public String alarmClock(int day, boolean onVacation){
        if (onVacation)
            return "off";
        else if (day == 0 || day == 6)
            return "10:00";
        return "7:00";
    }
//  We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11.
//  Return true if the given non-negative number is special.
    public boolean specialEleven(int number){
        return number % 11 == 0 || number % 11 == 1;
    }
//  Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38
//  and 39 return true, but 40 returns false.
    public boolean less20(int num){
        return num % 20 == 19 || num % 20 == 18;
    }
//  Your cell phone rings. Return true if you should answer it. Normally you answer, except in the morning
//  you only answer if it is your mom calling. In all cases, if you are asleep, you do not answer.
    public boolean answerCell(boolean isMorning, boolean momCalling, boolean isSleeping ){
        if (isSleeping)
            return false;
        else if (isMorning){
            if (momCalling)
                return true;
            return false;
        }
        return true;
    }
//  Given an int n, return the string form of the number followed by "!". So the int 6 yields "6!". Except
//  if the number is divisible by 3 use "Fizz" instead of the number, and if the number is divisible by 5
//  use "Buzz", and if divisible by both 3 and 5, use "FizzBuzz"
    public String fizzString2(int number){
        if (number % 15 == 0)
            return "FizzBuzz!";
        else if (number % 5 == 0)
            return "Buzz!";
        else if (number % 3 == 0)
            return "Fizz!";
        else
            return number + "!";
    }
//  Given three ints, a b c, return true if they are in strict increasing order, such as 2 5 11, or 5 6 7,
//  but not 6 5 7 or 5 5 7. However, with the exception that if "equalOk" is true, equality is allowed,
//  such as 5 5 7 or 5 5 5.
    public boolean inOrderEqual(int a, int b, int c, boolean equalOK){
        if (equalOK)
            return a <= b && b <= c;
        return a < b && b < c;
    }
//  Return the sum of two 6-sided dice rolls, each in the range 1..6. However, if noDoubles is true, if
//  the two dice show the same value, increment one die to the next value, wrapping around to 1 if its
//  value was 6.
    public int withoutDoubles(int a, int b, boolean noDoubles){
        if(noDoubles){
            if (a == b){
                if (a == 6)
                    a = 1;
                else
                    b = 1;
                return a + b + 1;
            }
        }
        return a + b;
    }
//  You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from
//  each other, the result is 0. If all of the numbers are the same, the result is 20. If two of the
//  numbers are the same, the result is 10.
    public byte greenTicket(int a, int b, int c){
        if (a == b && b == c )
            return (byte)20;
        else if (a == b || b == c || a == c)
            return (byte)10;
        return (byte)0;
    }
// Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits
// as a. If the sum has more digits than a, just return a without b.
    public int sumLimit(int a, int b){
        String stringA =  String.valueOf(a);
        int result = a + b;
        if (String.valueOf(result).length() > stringA.length())
            return a;
        else
            return result;
    }





    public static void main(String[] args) {
        Logic1 obj =  new Logic1();
        System.out.println("sumLimit(2, 3) -> "+obj.sumLimit(2, 3));
        System.out.println("sumLimit(8, 3) -> "+obj.sumLimit(8, 3));
        System.out.println("sumLimit(8, 1) -> "+obj.sumLimit(8, 1));
    }
}





/*
* Test cases :
*
        System.out.println("greenTicket(1, 2, 3) -> "+obj.greenTicket(1, 2, 3));
        System.out.println("greenTicket(2, 2, 2) -> "+obj.greenTicket(2, 2, 2));
        System.out.println("greenTicket(1, 1, 2) -> "+obj.greenTicket(1, 1, 2));
        System.out.println("withoutDoubles(2, 3, true) -> "+obj.withoutDoubles(2,3,true));
        System.out.println("withoutDoubles(3, 3, true) -> "+obj.withoutDoubles(3,3,true));
        System.out.println("withoutDoubles(3, 3, false) -> "+obj.withoutDoubles(3,3,false));
        System.out.println("inOrderEqual(2, 5, 11, false) ->"+obj.inOrderEqual(2,5,11,false));
        System.out.println("inOrderEqual(5, 7, 6, false) ->"+obj.inOrderEqual(5,7,6,false));
        System.out.println("inOrderEqual(5, 5, 7, true) ->"+obj.inOrderEqual(5,5,7,true));
        System.out.println("fizzString2(1) -> "+obj.fizzString2(1));
        System.out.println("fizzString2(2) -> "+obj.fizzString2(2));
        System.out.println("fizzString2(3) -> "+obj.fizzString2(3));
        System.out.println("answerCell(false, false, false) -> "+obj.answerCell(false, false,false));
        System.out.println("answerCell(false, false, true) -> "+obj.answerCell(false, false,true));
        System.out.println("answerCell(true, false, false) -> "+obj.answerCell(true, false,false));
        System.out.println("less20(18) -> "+ obj.less20(18));
        System.out.println("less20(19) -> "+ obj.less20(19));
        System.out.println("less20(20) -> "+ obj.less20(20));
        System.out.println("specialEleven(22) -> " + obj.specialEleven(22));
        System.out.println("specialEleven(23) -> " + obj.specialEleven(23));
        System.out.println("specialEleven(24) -> " + obj.specialEleven(24));
        System.out.println("alarmClock(1, false) -> "+obj.alarmClock(1, false));
        System.out.println("alarmClock(5, false) -> "+obj.alarmClock(5, false));
        System.out.println("alarmClock(0, false) -> "+obj.alarmClock(0, false));
        System.out.println("squirrelPlay(70, false) -> "+ obj.squirrelPlay(70, false));
        System.out.println("squirrelPlay(95, false) -> "+ obj.squirrelPlay(95, false));
        System.out.println("squirrelPlay(95, true) -> "+ obj.squirrelPlay(95, true));
        System.out.println("shareDigit(12, 23) -> "+ obj.shareDigit(12, 23));
        System.out.println("shareDigit(12, 43) -> "+ obj.shareDigit(12, 43));
        System.out.println("shareDigit(12, 44) -> "+ obj.shareDigit(12, 44));
        System.out.println("redTicket(2,2,2) -> "+ obj.redTicket(2, 2, 2));
        System.out.println("redTicket(2,2,1) -> "+ obj.redTicket(2, 2, 1));
        System.out.println("redTicket(0, 0, 0) -> "+ obj.redTicket(0, 0, 0));
        System.out.println("lessBy10(1, 7, 11) -> "+ obj.lessBy10(1, 7, 11));
        System.out.println("lessBy10(1, 7, 10) -> "+ obj.lessBy10(1, 7, 10));
        System.out.println("lessBy10(11, 1, 7) -> "+ obj.lessBy10(11, 1, 7));
        System.out.println("inOrder(1, 2, 4, false) -> "+ obj.inOrder(1, 2, 4, true));
        System.out.println("inOrder(1, 2, 1, false) -> "+ obj.inOrder(1, 2, 1, false));
        System.out.println("inOrder(1, 1, 2, true) -> "+ obj.inOrder(1, 1, 2, true));
        System.out.println("fizzString(\"fig\") -> "+ obj.fizzString("fig"));
        System.out.println("fizzString(\"dib\") -> "+ obj.fizzString("dib"));
        System.out.println("fizzString(\"fib\") -> "+ obj.fizzString("fib"));
        System.out.println("teenSum(3, 4) -> "+obj.teenSum(3, 4));
        System.out.println("teenSum(10, 13) -> "+obj.teenSum(10, 13));
        System.out.println("teenSum(13, 2) -> "+obj.teenSum(13, 2));
        System.out.println("old35(3) -> "+obj.old35(3));
        System.out.println("old35(10) -> "+obj.old35(10));
        System.out.println("old35(15) -> "+obj.old35(15));
        System.out.println("cigarParty(30, false) -> " + obj.cigarParty(30, false));
        System.out.println("cigarParty(50, false) -> " + obj.cigarParty(50, false));
        System.out.println("cigarParty(70, true) -> " + obj.cigarParty(70, true));
        System.out.println("caughtSpeeding(60, false) -> " + obj.caughtSpeeding(60, false));
        System.out.println("caughtSpeeding(65, false) -> " + obj.caughtSpeeding(65, false));
        System.out.println("caughtSpeeding(65, true) -> " + obj.caughtSpeeding(65, true));
        System.out.println("love6(6, 4) -> "+ obj.love6(6, 4));
        System.out.println("love6(4, 5) -> "+ obj.love6(4, 5));
        System.out.println("love6(1, 5) -> "+ obj.love6(1, 5));
        System.out.println("more20(20) -> " + obj.more20(20));
        System.out.println("more20(21) -> " + obj.more20(21));
        System.out.println("more20(22) -> " + obj.more20(22));
        System.out.println("nearTen(12) -> " + obj.nearTen(12));
        System.out.println("nearTen(17) -> " + obj.nearTen(17));
        System.out.println("nearTen(19) -> " + obj.nearTen(19));
        System.out.println("nearTen(6) -> " + obj.nearTen(6));
        System.out.println("teaParty(6 , 8) -> "+ obj.teaParty(6, 8));
        System.out.println("teaParty(3 , 8) -> "+ obj.teaParty(3, 8));
        System.out.println("teaParty(20 ,6) -> "+ obj.teaParty(20, 6));
        System.out.println("twoAsOne(1, 2, 3) -> "+ obj.twoAsOne(1, 2, 3));
        System.out.println("twoAsOne(3, 1, 2) -> "+ obj.twoAsOne(3, 2, 1));
        System.out.println("twoAsOne(3, 2, 2) -> "+ obj.twoAsOne(3, 2, 2));
        System.out.println("lastDigit(23, 19, 13) -> "+ obj.lastDigit(23,19,13));
        System.out.println("lastDigit(23, 19, 12) -> "+ obj.lastDigit(23,19,12));
        System.out.println("lastDigit(23, 19, 3) -> "+ obj.lastDigit(23,19,3));
        System.out.println("maxMod5(2, 3) -> "+ obj.maxMod(2, 3));
        System.out.println("maxMod5(6, 2) -> "+ obj.maxMod(6, 2));
        System.out.println("maxMod5(3, 2) -> "+ obj.maxMod(3, 2));
        System.out.println("blueTicket(9, 1, 0) -> "+obj.blueTicket(9, 1, 0));
        System.out.println("blueTicket(9, 2, 0) -> "+obj.blueTicket(9, 2, 0));
        System.out.println("blueTicket(6, 1, 4) -> "+obj.blueTicket(6, 1, 4));
        System.out.println("dateFashion(5, 10) -> "+ obj.dateFashion(5, 10));
        System.out.println("dateFashion(5, 2) -> "+ obj.dateFashion(5, 2));
        System.out.println("dateFashion(5, 5) -> "+ obj.dateFashion(5, 5));
        System.out.println("sortaSum(3, 4) -> "+ obj.sortaSum(3,4));
        System.out.println("sortaSum(9, 4) -> "+ obj.sortaSum(9,4));
        System.out.println("sortaSum(10, 11) -> "+ obj.sortaSum(10,11));
        System.out.println("in1To10(5, false) -> "+obj.in1To10(5, false));
        System.out.println("in1To10(11, false) -> "+obj.in1To10(11, false));
        System.out.println("in1To10(11, true) -> "+obj.in1To10(11, true));
*
* */
