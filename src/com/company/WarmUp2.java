package com.company;

public class WarmUp2 {

//  Given a string and a non-negative int n, return a larger string that is n copies of the original string.
    public String stringTimes (String word, int repeat){
        String result = "";
        for (short i = 0; i<repeat; i++){
            result += word;
        }
        return result;
    }
//  Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
    public boolean doubleX(String string){
        return string.contains("xx");
    }
//   Given an array of ints, return true if the sequence 1,2,3 appears in the array somewhere.
    public boolean array123(int []array){
        boolean flag = false;
        for(byte i=0; i< array.length - 2; i++){
            if (array[i] == 1 && array[i+1] == 2 && array[i+2] == 3){
             flag = true;
             break;
            }
        }
        return flag;
    }
//   Given a string, return a string made of chars at indexes 0,1 4,5 8,9 with alternative
    public String altParis(String string){
        String result = "";
        for(int i =0; i<string.length(); i+=4){
            result += string.charAt(i);
            result += string.charAt(i+1);
        }
        return result;
    }
//   Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
//   Return true if the array does not contain any triples.
    public boolean noTriples(int []array){
        boolean triple = false;
        for(int i =0; i< array.length - 2; i++){
            if( array[i] == array[i+1] && array[i] == array[i+2]){
                triple = true;
                break;
            }
        }
        return !triple;   // no triple is equivalent to ! triple
    }
//  Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or
//  whatever is there if the string is less than length 3. Return n copies of the front;
    public String frontTimes(String string, int repeat){
        String subs = "";
        if (string.length() < 3){
            subs = string;
        }
        else{
            subs = string.substring(0,3);
        }
        string = "";
        for (byte i = 0; i< repeat; i++){
            string += subs;
        }
        return string;
    }
//  Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
    public String stringBits(String string){
        String result = "";
        for (byte i=0; i< string.length(); i+=2){
            result += string.charAt((int)i);
        }
        return result;
    }
//  Given an array of ints, return the number of 9's in the array.
    public short arrayCount(short []array){
        short count9s = 0;
        for (byte i=0; i<array.length; i++){
            if (array[i] == 9)
                count9s ++;
        }
        return count9s;
    }
//    Suppose the string "yak" is unlucky. Given a string, return a version where all
//    the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.
    public String stringYak(String string){
        String result = "";
        String [] unYak = string.split("yak");
        for (String item : unYak){
            if(item.length() >1)
                result += item;
        }
        return result;
    }
// Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, followed by the value minus 1.
// Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.
    public boolean has271(int []array){
        for (byte i=0; i< array.length - 2; i++){
            if(array[i] == 2 && array[i+1] ==7 && array[i+2]==1)
                return true;
        }
        return false;
    }
//  Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
    public short countXX(String string){
        short xxCounter = 0;
        for (int i=0; i< string.length() - 1; i++){
            if (string.charAt(i) == 'x' && string.charAt(i+1) =='x')
                xxCounter++;
        }
        return xxCounter;
}
//  Given a non-empty string like "Code" return a string like "CCoCodCode".
    public String stringSplosion(String string){
        String result = "";
        for (int i=0; i< string.length(); i++){
            for (int j=0; j<=i; j++){
                result += string.charAt(j);
            }
        }
        return result;
    }
//  Given an array of ints, return true if one of the first 4 elements in the array is a 9.
//  The array length may be less than 4.
    public boolean arrayFront9(int [] array){
        for(int i=0; i<array.length; i++){
            if(array[i]==9 && i < 3)
                return true;
        }
        return false;
    }
//  Given a string, return a version where all the "x" have been removed.
//  Except an "x" at the very start or end should not be removed.
    public String stringX(String string){
        String result = "";
        for(int i=0; i< string.length(); i++){
            if (string.charAt(i) == 'x'){
                if (i==0 || i== string.length() -1)
                    result += string.charAt(i);
            }
            else
                result += string.charAt(i);
        }
        return result;
    }
//  Given an array of ints, return the number of times that two 6's are next to each other in the array.
//  Also count instances where the second "6" is actually a 7.
    public short array667(int []array){
        short Counter = 0;
        for (int i=0; i< array.length-1; i++){
            if(array[i] == 6 && (array[i + 1] == 6 || array[i + 1]== 7))
                Counter++;
        }
        return Counter;
    }
//
}
