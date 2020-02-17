package com.company;
import java.util.Arrays;
import java.util.regex.Pattern;

public class String2 {
//    Given a string, return a string where for every char in the original, there are two chars.
    public String doubleChar(String str){
        String result = "";
        for(int i=0; i < str.length(); i++){
            result += str.charAt(i);
            result += str.charAt(i);
        }
        return result;
    }
//    Return the number of times that the string "code" appears anywhere in the given string,
//    except we'll accept any letter for the 'd', so "cope" and "cooe" count.
    public int countCode(String str){
        int counter = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length() - 3; i++){
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3)=='e')
                counter ++;
        }
        return counter;
    }
//  Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
    public boolean bobThere(String str){
        return Pattern.matches("[a-z0-9]*b.b[a-z0-9]*", str);
    }
//  Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
//  You may assume that n is between 0 and the length of the string, inclusive.
    public String repeatEnd(String str, int n){
        String base = str.substring(str.length() - n, str.length());
        String result="";
        for (int i = 0; i< n; i++){
            result += base;
        }
        return result;
    }
//  Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear
//  somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().
    public boolean prefixAgain(String str, int n){
        String base = str.substring(0,n);
        if (str.indexOf(base, n) > -1)
            return true;
        return false;
    }
//  Returns true if for every '*' (star) in the string, if there are chars both immediately
//  before and after the star, they are the same.
    public boolean sameStarChar(String str){
        for (int i=1; i<str.length() - 1; i++){
            if(str.charAt(i) =='*' && str.charAt(i-1) == str.charAt(i + 1))
                return true;
        }
        return false;
    }
//  Return a version of the given string, where for every star (*) in the string the star and the chars immediately
//  to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
    public String starOut(String str){
        String result = "";
        if (str.charAt(0) !='*' && str.charAt(1) !='*')
            result += str.charAt(0);

        for (int i=1; i<str.length() - 1; i++){
            if (str.charAt(i-1) != '*' && str.charAt(i) !='*' && str.charAt(i+1)!= '*')
                result += str.charAt(i);
            else if(str.charAt(i) == '*')
                i++;
        }
        if (str.charAt(str.length() - 1) !='*' && str.charAt(str.length() -2) !='*')
            result += str.charAt(str.length() -1);
        return result;
    }
//  Return the number of times that the string "hi" appears anywhere in the given string.
    public int countHi(String str){
        int counter = 0;
        str = str.toLowerCase();
        for(int i=0; i <str.length() - 1; i++){
            if(str.charAt(i) =='h' && str.charAt(i+1)=='i')
                counter++;
        }
        return counter;
    }
//  Given two strings, return true if either of the strings appears at the very end of the other string, ignoring
//  upper/lower case differences (in other words, the computation should not be "case sensitive").
    public boolean endOther(String a, String b){
        a = a.toLowerCase();
        b = b.toLowerCase();
        return a.endsWith(b) || b.endsWith(a);
    }
//  We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere
//  later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's.
//  Return true if the given string is xy-balanced.
    public boolean xyBalance(String str){
        String xs = "", ys = "";
        for (int i=0; i< str.length(); i++){
            if (str.charAt(i) == 'x')
                xs += ""+i;
            else if(str.charAt(i)=='y')
                ys += ""+i;
        }
        if (xs.length() > ys.length())
            return false;
        for (int i=0; i< xs.length(); i++){
            if ((int)xs.charAt(i) > (int)ys.charAt(i)){
                return false;
            }
        }
        return true;
    }
//  Given a string and an int n, return a string made of the first n characters of the string, followed by the first
//  n-1 characters of the string, and so on. You may assume that n is between 0 and the length of the string,
//  inclusive (i.e. n >= 0 and n <= str.length()).
    public String repeatFront(String str, int n){
        String base = "";
        while (n>=1){
            base += str.substring(0,n);
            n--;
        }
        return base;
    }
//  Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars
//  to the left and right of the "xyz" must differ by at most one.
    public boolean xyzMiddle(String str){
        int length = str.length();
        int leftOfXYZ = str.indexOf("xyz");
        int rightOfXYZ = str.indexOf("xyz") + 3;
        return leftOfXYZ  == (length - rightOfXYZ) ||
                (leftOfXYZ + 1 == (length - rightOfXYZ) || leftOfXYZ -1 == (length - rightOfXYZ))  ;
    }
//  Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields
//  "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of
//  fewer than 3 chars at the end.
    public String oneTwo(String str){
        int subCount = 0;
        StringBuilder result = new StringBuilder();
        for (int i=0; i< str.length() - 2; i+= 3){
            String temp = "";
            temp += str.charAt(i + 1);
            temp += str.charAt(i + 2);
            temp += str.charAt(i);
            subCount++;
            result.append(temp);
        }
        if(str.length() > subCount*3){
            String remaining = str.substring(str.length()%3, str.length());
            result.append(remaining);
        }
        return result.toString();
    }
//  Given a string and a non-empty word string, return a version of the original String where all chars have been
//  replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.
    public String plusOut(String a, String b){
        String result = "";
        String [] wordsLengthB = a.split(b);
        for(String item : wordsLengthB){
            if(item.length() > 0){
                String replacement = "";
                for(int i=0; i< item.length(); i++){
                    replacement += "+";
                }
            result += replacement;
            }
            result += b;
        }
        if(a.endsWith(b))
            return result;
        return result.substring(0, result.length() - b.length());
    }
//  Return true if the string "cat" and "dog" appear the same number of times in the given string.
    public boolean catDog(String str){
        int catCount = 0, dogCount = 0;
        for (int i = 0; i< str.length() - 2; i++){
            if(str.charAt(i) == 'c' && str.charAt(i+1) == 'a' && str.charAt(i+2) =='t')
                catCount++;
            else if(str.charAt(i) == 'd' && str.charAt(i+1) == 'o' && str.charAt(i+2) =='g')
                dogCount++;
        }
        return catCount ==dogCount;
    }
//  Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a
//  period (.). So "xxyz" counts but "x.xyz" does not.
    public boolean xyzThere(String str){
        if(!str.contains("xyz"))
            return false;
        return !Pattern.compile("[a-z0-9]*\\.xyz[a-z0-9]*").matcher(str).matches();
    }
//  Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second
//  char of a, the second char of b, and so on. Any leftover chars go at the end of the result.
    public String mixString(String a, String b){
        String result = "";
        int loop = Math.min(a.length(), b.length());
        for (int i =0; i< loop; i++) {
            result += a.charAt(i);
            result += b.charAt(i);
            }
        if(a.length() > loop)
            result += a.substring(loop);
        else if (b.length() > loop)
            result += b.substring(loop);

        return result;
        }
//  Given two strings, word and a separator sep, return a big string made of count occurrences of the word,
//  separated by the separator string.
    public String repeatSeparator(String word, String sep, int count){
        String result = "" + word;
        for(int i=0; i< count - 1; i ++){
            result += sep + word;
        }
        return result;
    }
//  A sandwich is two pieces of bread with something in between. Return the string that is between the first and last
//  appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.
    public String getSandwich(String str){
        str = str.toLowerCase();
        int pattyStart = str.indexOf("bread");
        int pattyEnd = str.lastIndexOf("bread");
        if((pattyStart + 5 >= pattyEnd) || pattyStart == -1)        // pattyStart + 5 is the total length of "bread"
            return "";
        return str.substring(pattyStart + 5, pattyEnd);
    }
//  Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
//  Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
    public String zipZap(String str){
        return str.replaceAll("(?i:z.p)", "zp");        // ?i for case insensitive
    }
//  Given a string and a non-empty word string, return a string made of each char just before and just after every
//  appearance of the word in the string. Ignore cases where there is no char before or after the word, and a char
//  may be included twice if it is between two words.
    public String wordEnds(String string, String word){
        String [] subs = string.split(word);
        String result = "";
        if (subs[0].length() >0){
            result += subs[0].charAt(subs[0].length() - 1);
        }
        for (int i =1; i< subs.length; i++){
            if (subs[i].length() > 0){
                    result += subs[i].charAt(0);
                    result += subs[i].charAt(subs[i].length() - 1);
            }
        }
        if (!string.endsWith(word))
            result = result.substring(0, result.length() - 1);
        return result;
    }



    public static void main(String[] args) {
        String2 obj = new String2();

        System.out.println(obj.plusOut("12xy34", "xy"));
        System.out.println(obj.plusOut("12xy34", "1"));
        System.out.println(obj.plusOut("12xy34xyabcxy", "xy"));
    }
}
