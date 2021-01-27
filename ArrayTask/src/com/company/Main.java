package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        ToSortArray sort=new ToSortArray();
        ToFindMaximumNumberOfArray max=new ToFindMaximumNumberOfArray();
        ToCheckElementsOfArray check=new ToCheckElementsOfArray();
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            int randNum=1+rand.nextInt(100);
            arr[i]=randNum;
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int givenNumber=in.nextInt();
        System.out.println("Index of element:"+check.toCheckArray(arr,givenNumber));
        System.out.print("Sorting Array\n");
        sort.sorting(arr);
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nMaximum number of array: "+max.maximum(arr));
    }
}
