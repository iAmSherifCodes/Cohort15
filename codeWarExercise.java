package codeWarExercise;

import java.util.Arrays;

public class codeWarExercise {
    public static void main(String[] args) {
        System.out.println();
        int[] numberList = {10,4,6,8,7,8};
        int oddNumber = getOdd(numberList);
        System.out.printf("The odd number in the list is %d",oddNumber);
        System.out.println();
        int anotherList[] = {1,3,5,7,9,4};
        int evenNo = getEven(anotherList);
        System.out.printf("The even number in the list is %d",evenNo);
        System.out.println();
    }

    public static int getOdd(int[] arr){
        Arrays.sort(arr);
        int oddNo = 0;
        for (int i : arr){
            if ( i % 2 == 1){
                oddNo = i ;
            }
        }
        return oddNo;
    }

    public static int getEven(int[] arr){
        Arrays.sort(arr);
        int evenNo = 0;
        for (int i : arr){
            if (i % 2 == 0){
                evenNo = i;
            }
        }
        return evenNo;
    }
}
