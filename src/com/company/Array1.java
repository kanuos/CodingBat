package com.company;

import java.util.Arrays;

public class Array1 {
//    Given an array of ints, return true if 6 appears as either the first or last element in the array.
//    The array will be length 1 or more.
    public boolean firstLast6(int [] arr){
        return arr[0] == 6 || arr[arr.length - 1] == 6;
    }
//    Given 2 arrays of ints, a and b, return true if they have the same first element or they have the
//    same last element. Both arrays will be length 1 or more.
    public boolean commonEnd(int [] first, int [] second){
        return (first[0] == second[0]) || (first[first.length - 1] == second[second.length - 1]);
    }
//    Given an array of ints length 3, return a new array with the elements
//    in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
    public int [] reverse3(int[] array){
        int[] arr = new int [array.length];
        for (int i = array.length - 1; i >= 0 ; i--) {
            arr[array.length - 1 - i] = array[i];
        }
        return arr;
    }
//    Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
    public int [] middleWay(int[] first, int[] second){
        return new int [] {first[1], second[1]};
    }
//    Given an int array length 2, return true if it does not contain a 2 or 3.
    public boolean no23(int [] array){
        for (int item : array){
            if (item == 2 || item ==3)
                return false;
        }
        return true;
    }
//  Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0.
//  Return the changed array.
    public int [] fix23(int [] array){
        for(int i =0 ;i< array.length - 1; i++){
            if (array[i] == 2 && array[i + 1] == 3)
                array[i + 1] = 0;
        }
        return array;
    }
//  Given an array of ints of even length, return a new array length 2 containing the middle two elements from the
//  original array. The original array will be length 2 or more.
    public int[] makeMiddle(int[] arr){
        if (arr.length <= 2)
            return arr;
        int middle = arr.length / 2;
        return new int [] {arr[middle - 1], arr[middle]};
    }
//  Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the
//  array. The array length will be at least 3.
    public int [] midThree(int [] arr){
        if (arr.length <= 3)
            return arr;
        int middle = arr.length / 2;
        return new int [] {arr[middle - 1], arr[middle], arr[middle + 1]};
    }
//  We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. Return true if the given array
//  contains an unlucky 1 in the first 2 or last 2 positions in the array.
    public boolean unlucky1(int []array){
        for (int i=0; i< array.length - 1; i++){
            if (array[i] == 1 && array[i+1] == 3)
                return true;
        }
        return false;
    }
//    Given an array of ints, return true if the array is length 1 or more, and the first element and the
//    last element are equal.
    public boolean sameFirstLast (int [] arr){
        return (arr.length >= 1) && (arr[0] == arr[arr.length - 1]);
    }
//  Given an array of ints length 3, return the sum of all the elements.
    public int sum3(int [] array){
        int result = 0;
        for (int value : array) {
            result += value;
        }
        return result;
    }
//  Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all
//  the other elements to be that value. Return the changed array.
    public int [] maxEnd3(int [] array){
        int [] result = new int [array.length];
        int highestOfEnds = Math.max(array[0], array[array.length - 1]);
        for (int i = 0; i< array.length; i++){
            result[i] = highestOfEnds;
        }
        return result;
    }
//  Given an array of ints, return a new array length 2 containing the first and last elements from the original
//  array. The original array will be length 1 or more.
    public int [] makeEnds(int [] arr){
        return new int[] {arr[0], arr[arr.length - 1]};
    }
//  Given an int array, return a new array with double the length where its last element is the same as the original
//  array, and all the other elements are 0. The original array will be length 1 or more
    public int[] makeLast(int [] arr){
        int [] result = new int [arr.length * 2];
        result[result.length - 1] = arr[arr.length - 1];
        return result;
    }
//  Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.
    public int start1(int [] a, int [] b){
        int result = 0;
        if (a[0] == 1)
            result++;
        if (b[0] == 1)
            result++;
        return result;
    }
//  Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
    public int [] plusTwo(int [] a, int [] b){
        int [] result = new int [a.length + b.length];
        for (int i = 0; i< a.length; i++){
            result[i] = a[i];
        }
        for (int i = 0; i < b.length; i++){
            result[a.length + i] = b[i];
        }
        return result;
    }
//    Given an array of ints of odd length, look at the first, last, and middle values in the array and return the
//    largest. The array length will be a least 1.
    public int maxTriple(int [] arr){
        int max = arr[0];
        for (int i = 1; i< arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }
//  Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a
//  followed by the elements from b. The arrays may be any length, including 0, but there will be 2 or more elements
//  available between the 2 arrays.
    public int [] make2(int []a, int []b){
        if (a.length == 0)
            return new int[] {b[0], b[1]};
        else if (a.length == 1)
            return new int[] {a[0], b[0]};
        else
            return new int[] {a[0], a[1]};
    }
//  Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
    public char[] makePi(int num){
        String PI_STRING = Math.PI + "";
        char [] result = new char [num];
        int counter = 0, loopIndex = 0;
        while (counter < num){
           if (PI_STRING.charAt(loopIndex) != '.'){
               result[counter] = PI_STRING.charAt(loopIndex);
               counter ++;
           }
           loopIndex++;
        }
        return result;
    }
//  Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
    public int [] rotateLeft3(int [] arr){
        if (arr.length != 3)
            return new int [] {};
        return new int [] {arr[1], arr[2], arr[0]};
    }
//  Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2,
//  just sum up the elements that exist, returning 0 if the array is length 0.
    public int sum2(int [] arr){
        return arr[0] + arr[1];
    }
//  Given an int array length 2, return true if it contains a 2 or a 3.
    public boolean has23(int [] arr){
        if (arr.length != 2)
            return false;
        for (int item : arr){
            if (item == 2 || item == 3)
                return true;
        }
        return false;
    }
//  Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.
    public boolean double23(int [] arr){
        int twoCounter = 0, threeCounter = 0;
        for (int item : arr){
            switch (item){
                case 2: twoCounter++; break;
                case 3: threeCounter++; break;
                default:break;
            }
        }
        return threeCounter >= 2 || twoCounter >= 2;
    }
//  Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array.
//  Return the array which has the largest sum. In event of a tie, return a.
    public int[] biggerTwo(int [] a, int[] b){
        if (a.length != 2 || b.length!= 2)
            return new int [0];
        return new int[] {a[0]+a[1], b[0]+b[1]};
    }
//  Given an array of ints, swap the first and last elements in the array. Return the modified array.
//  The array length will be at least 1.
    public int[] swapEnds(int [] arr){
        int [] result = new int [arr.length];
        result[0] = arr[arr.length - 1];
        result[result.length - 1] = arr[0];
        for (int i = 1; i< arr.length - 1; i++){
            result[i] = arr[i];
        }
        return result;
    }
//  Given an int array of any length, return a new array of its first 2 elements. If the array is smaller than
//  length 2, use whatever elements are present.
    public int [] frontPiece(int [] arr){
        switch (arr.length){
            case 0:
            case 1:
            case 2: return arr;
            default: return new int[] {arr[0], arr[1]};
        }
    }
//  Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. If either
//  array is length 0, ignore that array.
    public int[] front11(int [] a, int [] b){
        if (a.length == 0 && b.length == 0)
            return new int [0];
        if (a.length >= 1){
            if(b.length >= 1)
                return new int[] {a[0], b[0]};
            return new int[] {a[0]};
        }
        return new int[] {b[0]};
    }

    public static void main(String[] args) {
//        Use this method to call the methods and pass arguments or you can create objects of the Array1 class and
//        instantiate anywhere inside this package.
    }
}


