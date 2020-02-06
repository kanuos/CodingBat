package com.company;

public class Warmup_1 {
//    method to check whether you can sleep
    public boolean sleepIn(boolean weekday, boolean vacation){
        boolean canSleep = false;
        if(!weekday || vacation)
            canSleep = true;

        return canSleep;
    }
//  given an int return the absolute difference between n and 21 except return double the absolute
//    difference if n is over 21
    public short diff21(int n){
        if (n <=21)
            return (short)Math.abs(n - 21);
        else
            return (short)((n -21) * 2);
        }
//  given an int return true if it is within 10 of 100 or 200.
    public boolean nearHundred(int n){
        return (Math.abs(n - 100) <= 10 || Math.abs(n-200) <= 10);
    }
//  given a non-empty string and an int n, return a new string where the char at index n has been removed
    public String missingChar(String word, int index){
        if (index < 0 || index > word.length())
            return "Invalid Index";
        StringBuilder result = new StringBuilder();
        for (short i = 0; i < word.length(); i++){
            if (i != index)
                result.append(word.charAt(i));
        }
        return result.toString();
    }
//    given a string, take the last char and return a new sting with the last char added at the front
//    and back, so "cat" yields "tcatt.
    public String backgAround(String word){
        String result = "";
        char lastChar = word.charAt(word.length() - 1);
        return lastChar + word + lastChar;
    }
//  Given a string, return true if the string starts with "hi" and false otherwise
    public boolean startHi(String word){
        return word.startsWith("hi");
    }
//  we'll say that a number is "teen" if i is in the range 13..19 inclusive, Given 3 int values
//  return true if 1 or more of them are teen.
    public boolean hasTeen(int num1, int num2, int num3){
        return (num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19) || (num3 >= 13 && num3 <= 19);
    }
//  return true if the given string begins with "mix", except the 'm' can be anything so "pix"...
    public boolean mixStart(String word){
        word = word.trim();
        return (word.charAt(1) == 'i' && word.charAt(2) == 'x');
    }
// Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the
// event of a tie. Note that Math.abs(n) returns the absolute value of a number.
    public int close10(int first, int second){
        int firstCompare = Math.abs(first - 10);
        int secondCompare = Math.abs(second - 10);
        if (firstCompare == secondCompare)
            return 0;
        return firstCompare > secondCompare ? second : first;
    }
// Return true if the given string contains between 1 and 3 'e' chars
    public boolean stringE(String string){
        byte countE = 0;
        for (byte i =0; i< string.length(); i++){
            if (string.charAt(i) == 'e')
                countE++;
        }
        return countE >= 1 && countE <= 3;
    }
// Given a non-empty string and an int N, return the string made starting with char 0,
// and then every Nth char of the string. So if N is 3, use char 0,3,6...
    public String everyNth(String string, int N){
        StringBuilder result = new StringBuilder();
        for (byte i=0; i <string.length(); i+= N)
            result.append(string.charAt(i));
        return result.toString();
    }
// We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
// We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are
// in trouble.
    public boolean monkeyTrouble(boolean monkeyA, boolean monkeyB){
//        return !(monkeyA ^ monkeyB);
        return monkeyA == monkeyB;
    }
//We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
// We are in trouble if the parrot is talking and the hour is before 7 or after 20.
// Return true if we are in trouble.
    public boolean parrotTrouble(boolean talking, int hour){
        return talking && (hour < 7 || hour > 20);
    }
//  Given 2 int values, return true if one is negative and one is positive.
//  Except if the parameter "negative" is true, then return true only if both are negative.
    public boolean posNeg(int a, int b, boolean negative){
        if (negative){
            return a < 0 && b < 0;
        }
        return (a < 0 && b > 0) || (a > 0 && b < 0);
    }
// Given a string, return a new string where the first and last chars have been exchanged.
    public String frontBack(String string){
        if (string.length() <= 1)
            return string;
        String result = string.substring(1, string.length() - 1);
        char firstChar = string.charAt(0);
        char lastChar = string.charAt(string.length() - 1);

        return lastChar + result + firstChar;
    }
//    Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
    public boolean or35(int num){
        return (num %3 == 0 || num %5 == 0);
    }
// Given two temperatures, return true if one is less than 0 and the other is greater than 100.
    public boolean icyHot(int temp1, int temp2){
        return (temp1 <0 && temp2 > 100) || (temp1 >100 & temp2 <0);
    }
//  We'll say that a number is "teen" if it is in the range 13..19 inclusive.
//  Given 2 int values, return true if one or the other is teen, but not both.
    public boolean loneTeen(int age1, int age2){
        boolean firstTeen = age1 >= 13 && age1 <= 19;
        boolean secondTeen = age2 >= 13 && age2 <= 19;
        return firstTeen ^ secondTeen;  // first X-OR second
    }
//  Given a string, return a string made of the first 2 chars (if present),
//  however include first char only if it is 'o' and include the second
//  only if it is 'z', so "ozymandias" yields "oz".
    public String startOz(String word){
        String result = "";
        if(word.startsWith("oz"))
            result += "oz";
        else if(word.charAt(0) == 'o')
            result += "o";
        else if(word.charAt(1) == 'z')
            result += "z";
        return result;
    }
//  Given 2 int values, return true if they are both in the range 30..40
//  inclusive, or they are both in the range 40..50 inclusive.
    public boolean in3050(int v1, int v2){
        return (v1 >= 30 && v1 <= 40 && v2 >= 30 && v2 <= 40) || (v1 >= 40 && v1 <= 50 && v2 >= 40 && v2 <= 50);
    }
//  Given two non-negative int values, return true if they have the same last digit.
//  Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
    public boolean lastDigit(int num1, int num2){
        return num1 % 10 == num2 % 10;
    }
//  Given two int values, return their sum.
//  Unless the two values are the same, then return double their sum.
    public int sumDouble(int num1, int num2){
        if (num1 == num2)
            return (num1 + num2) * 2;
        return num1 + num2;
    }
//  Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
    public boolean makes10 (int num1, int num2){
        return (num1 == 10 || num2 == 10) || (num1 + num2 == 10);
    }
//  Given a string, return a new string where "not " has been added to the front.
//  However, if the string already begins with "not", return the string unchanged.
//  Note: use .equals() to compare 2 strings.
    public String notString(String string){
        string = string.trim();
        if (string.startsWith("not"))
            return string;
        return "not "+ string;
    }
//  Given a string, we'll say that the front is the first 3 chars of the string.
//  If the string length is less than 3, the front is whatever is there.
//  Return a new string which is 3 copies of the front.
    public String front3(String string){
        String baseChars = "";
        if (string.length() < 3)
            baseChars = string.substring(0,string.length());
        else
            baseChars = string.substring(0,3);
        return baseChars+baseChars+baseChars;
    }
//    Given a string, take the first 2 chars and return the string with the 2 chars
//    added at both the front and back, so "kitten" yields"kikittenki".
//    If the string length is less than 2, use whatever chars are there.
    public String front22(String string){
        String endChars = "";
        if (string.length() < 2)
            endChars = string;
        else
            endChars = string.substring(0,2);
        return endChars+string+endChars;
    }
//  Given 2 int values, return true if either of them is in the range 10..20 inclusive.
    public boolean in1020(int num1, int num2){
        return (num1 >= 10 && num1 <= 20) || (num2 >= 10 && num2 <= 20);
    }
//  Given a string, if the string "del" appears starting at index 1, return a string where that
//  "del" has been deleted. Otherwise, return the string unchanged.
    public String delDel(String string){
        String resultant = "";
        if (string.contains("del")){
            int location = string.indexOf("del");
            return string.substring(0, location) + string.substring(location + 3, string.length());
        }
        return string;
    }
//  Given three int values, a b c, return the largest.
    public int intMax(int num1, int num2, int num3){
        return Math.max(num3, Math.max(num1, num2));
    }
// Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
// or return 0 if neither is in that range.
    public int max1020(int num1, int num2){
        if ((num1 >= 10 && num1 <= 20) || (num2 >= 10 && num2 <= 20))
            return Math.max(num1, num2);
        return 0;
    }
//  Given a string, return a new string where the last 3 chars are now in upper case.
//  If the string has less than 3 chars, uppercase whatever is there.
//  Note that str.toUpperCase() returns the uppercase version of a string.
    public String endUp(String string){
        if (string.length() < 3)
            return string.toUpperCase();
        String lastChars = string.substring(string.length() - 3);
        return string.replace(lastChars, lastChars.toUpperCase());
    }



    public static void main(String[] args) {
        Warmup_1 obj = new Warmup_1();

        System.out.println(obj.endUp("hello"));
        System.out.println(obj.endUp("hi there"));
        System.out.println(obj.endUp("hi"));

    }
}
