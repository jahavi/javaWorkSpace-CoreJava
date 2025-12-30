package com.day17.InterfaceAssignment;
public class MergeSort implements SortableDesc {
    public void sort(int[] arr){
        java.util.Arrays.sort(arr);
        for(int i=0;i<arr.length/2;i++){
            int t=arr[i]; arr[i]=arr[arr.length-1-i]; arr[arr.length-1-i]=t;
        }
    }
}
