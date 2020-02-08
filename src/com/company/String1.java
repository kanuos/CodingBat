package com.company;

public class String1 {
//    Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
    public String helloName (String name){
        return "Hello, "+name;
    }
//    Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>".
    public String makeOutWord(String out, String word){
        String startingOut = out.substring(0,2);
        String endingOut = out.substring(2,out.length());
        return startingOut+word+endingOut;
    }
//  Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
    public String firstHalf(String word){
        int halfway = word.length() / 2;
        return word.substring(0,halfway);
    }
//  Given 2 strings, return their concatenation, except omit the first char of each.
    public String nonStart(String first, String second){
        return first.substring(1) + second.substring(1);
    }
//  Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back.
    public char theEnd(String string, boolean front){
        return front ? string.charAt(0) : string.charAt(string.length() -1);
    }
//  Given a string, return true if it ends in "ly".
    public boolean endsLy(String word){
        return word.toLowerCase().endsWith("ly");
    }
//  Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and".
    public String middleThree(String word){
        int startIndex = (word.length() - 3)/2;
        int endIndex = (word.length() - 3)/2 + 3;
        return word.substring(startIndex, endIndex);
    }
//  Given 2 strings, a and b, return a new string made of the first char of a and the last char of b. If either string is length 0, use '@' for its missing char.
    public String lastChars(String first, String second){
        String result = "";
        if(first.length() == 0)
            first = "@";
        if(second.length()==0)
            second ="@";
        result += first.charAt(0);
        result += second.charAt(second.length() -1);
        return result;
    }
//  Given a string, if the string begins with "red" or "blue"
//  return that color string, otherwise return the empty string.
    public String seeColor(String string){
        if (string.startsWith("blue") || string.endsWith("blue"))
            return "blue";
        else if (string.startsWith("red") || string.endsWith("red"))
            return "red";
        return "";
    }
//  Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
//  The string may be any length. If there are fewer than 2 chars, use whatever is there
    public String extraFront(String string){
        String repeatBase = string.substring(0, Math.min(string.length(), 2));
        return repeatBase + repeatBase + repeatBase;
    }
//  Given a string and a second "word" string, we'll say that the word matches the string
//  if it appears at the front of the string, except its first char does not need to match exactly.
//  On a match, return the front of the string, or otherwise return the empty string.
//  So, so with the string"hippo" the word "hi" returns "hi" and "xip" returns "hip".
//  The word will be at least length 1.
    public String startWord (String base, String word){
        if (base.startsWith(word))
            return word;
        else{
            String baseFrom1 = base.substring(1);
            String wordFrom1 = word.substring(1);
            if(baseFrom1.startsWith(wordFrom1))
                return base.substring(0, word.length());
            return "";
        }
    }
//  Given two strings, a and b, return the result of putting them together in the order abba,
    public String makeAbba(String a, String b){
        return a.concat(b).concat(b).concat(a);
    }
//  Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
//  The string length will be at least 2.
    public String extraEnd(String string){
        if(string.length() <2)
            return "Length of string must be more than 2";
        String last2Chars = string.substring(string.length()-2);
        return last2Chars.concat(last2Chars).concat(last2Chars);
    }
//  Given a string, return a version without the first and last char, so "Hello" yields "ell".
//  The string length will be at least 2.
    public String withoutEnd(String string){
        if (string.length()<2)
            return "Error";
        return string.substring(1,string.length()-1);
    }
//  Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
//  The string length will be at least 2.
    public String left2(String string){
        return string.substring(2).concat(string.substring(0,2));
    }
//  Given a string, return a version without both the first and last char of the string.
//  The string may be any length, including 0.
    public String withoutEnd2(String string){
        if (string.length()<=2)
            return "";
        return string.substring(1,string.length()-1);
    }
//  Given a string and an int n, return a string made of the first and last n chars from the string.
//  The string length will be at least n.
    public String nTwice(String word, int n){
        if (n > word.length())
            return "Error!";
        String firstNChars = word.substring(0,n);
        String lastNChars = word.substring(word.length() -n);
        return firstNChars.concat(lastNChars);
    }
//  Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
//  such as with "badxxx" or "xbadxx" but not "xxbadxx".
//  The string may be any length, including 0. Note: use .equals() to compare 2 strings.
    public boolean hasBad(String string){
        return string.indexOf("bad") == 0 || string.indexOf("bad") == 1;
    }
//  Given two strings, append them together (known as "concatenation") and return the result.
//  However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
    public String conCat(String first, String second){
        if (second.length() < 1)
            return first;
        if (first.length() < 1)
            return second;
        if (first.charAt(first.length() - 1) == second.charAt(0))
            return first.concat(second.substring(1));
        return first.concat(second);
    }
//  Given a string, return true if the first 2 chars in the string also
//  appear at the end of the string, such as with "edited".
    public boolean frontAgain(String word){
        if (word.length() <=2)
            return true;
        String firstTwo = word.substring(0,2);
        String lastTwo = word.substring(word.length() - 2);
        return firstTwo.equals(lastTwo);
    }
//  Given a string, if a length 2 substring appears at both its beginning and end,
//  return a string without the substring at the beginning, so "HelloHe" yields "lloHe".
//  The substring may overlap with itself, so "Hi" yields "" Else return the original string unchanged.
    public String without2(String string){
        if (string.length()<=2)
            return "";
        String firstTwo = string.substring(0,2);
        if (string.endsWith(firstTwo))
            return string.substring(2);
        return string;
    }
//  Given a string, if the first or last chars are 'x', return the string without those 'x' chars,
//  and otherwise return the string unchanged.
    public String withoutX(String string){
        if (string.startsWith("x"))
            string = string.substring(1);
        if (string.endsWith("x"))
            string = string.substring(0, string.length() -1);
        return string;
    }
//   The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
//   In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
//   Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
    public String makeTags(String tag, String string){
        String startTag = "<";
        String endTag = ">";
        return startTag+tag+endTag+string+startTag+"/"+tag+endTag;
    }
//  Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
//  If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "".
//  Note that str.length() returns the length of a string.
    public String firstTwo(String string){
        if (string.length()<2)
            return string;
        return string.substring(0,2);
    }
//    Given 2 strings, a and b, return a string of the form short+long+short,
//    with the shorter string on the outside and the longer string on the inside.
//    The strings will not be the same length, but they may be empty (length 0).
    public String comboString(String one, String two){
        return one.length() > two.length() ? two+one+two : one+two+one;
    }
//  Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
//  The string length will be at least 2.
    public String right2(String string){
        if (string.length() <=2)
            return string;
        String last2Chars = string.substring(string.length() -2);
        String restChars = string.substring(0,string.length() -2);
        return last2Chars.concat(restChars);
    }
//  Given a string of even length, return a string made of the middle two chars,
//  so the string "string" yields "ri". The string length will be at least 2.
    public String middleTwo(String string){
        if(string.length() %2 != 0)
            return "Not even string";
        int middle = string.length() /2;
        return string.substring(middle -1, middle + 1);
    }
//  Given a string and an index, return a string length 2 starting at the given index. If the index is too big or too
//  small to define a string length 2, use the first 2 chars. The string length will be at least 2.
    public String twoChars (String string, int index){
        if(index <= 0 || string.length() /2 < index)
            return string.substring(0,2);
        return string.substring(index);
    }
//  Given a string, return a string length 2 made of its first 2 chars.
//  If the string length is less than 2, use '@' for the missing chars.
    public String atFirst(String string){
        switch (string.length()){
            case 0 : return "@@";
            case 1 : return string+"@";
            case 2 : return string;
            default:return string.substring(0,2);
        }
    }
//  Given a string of any length, return a new string where the last 2 chars, if present,
//  are swapped, so "coding" yields "codign".
    public String lastTwo(String string) {
        switch (string.length()) {
            case 0:
                return string;
            case 1:
                return string;
            case 2: {
                String res = "";
                res += string.charAt(1);
                res += string.charAt(0);
                return res;
            }
            default: {
                String last2Chars = string.substring(string.length() - 2);
                return string.substring(0, string.length() - 2) + last2Chars.charAt(1) + last2Chars.charAt(0);
            }
        }
    }
//  Given two strings, append them together (known as "concatenation") and return the result.
//  However, if the strings are different lengths, omit chars from the longer string so it is the same
//  length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.
    public String minCat(String one, String two){
        if (one.length() >= two.length())
            return one.substring(one.length() - two.length()).concat(two);
        return one.concat(two.substring(two.length() - one.length()));
    }
//  Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'.
//  The string may be any length. Harder than it looks.
    public String deFront(String string){
        String result = "";
        if(string.charAt(0) == 'a')
            result += string.charAt(0);
        if(string.charAt(1) == 'b')
            result += string.charAt(1);
        return result.concat(string.substring(2));
    }
//  Given a string, if one or both of the first 2 chars is 'x',
//  return the string without those 'x' chars, and otherwise return the string unchanged.
//  This is a little harder than it looks.
    public String withoutX2(String string){
        String result = "";
        for (int i=0; i< string.length(); i++){
            if ((i == 0 || i == 1 ) && string.charAt(i) == 'x'){
                continue;
            }
            result += string.charAt(i);
        }
        return result;
    }
}
