package com.company;

public class ToCheckElementsOfArray {
    public String toCheckArray(int[] arr,int num){
        int k = 0;
        boolean flag=true;
    for (int i=0;i<arr.length;i++){
        if (num==arr[i]){
            k= i+1;
            flag=false;
            break;
        }
    }

    if (!flag)
    return String.valueOf(k);
    else return "There isn't this element";
    }
}
