package ds.java.programs;

import java.util.Arrays;

public class ExponentialSearch {

public static  void main(String[] args){

    int[] arr = {6,12,18,24,32,43,54,65,76,87,92,95,99};
    int length= (arr.length);
    int value = 99;
    int outcome = exponentialSearch(arr,length,value);
    System.out.println("Max Index = " + (length-1) );

    if(outcome<0){
       System.out.println( "Element is not present in the array");
    }else {
        System.out.println( "Element is  present in the array at index :"+outcome);
       }
    }
    
public static int exponentialSearch(int[] arr ,int length, int value ){

        /*if(arr[0]==value){
            return 0;
            }*/
        int i=1;
        while(i<length && arr[i]<=value){

            i=i*2;
        }
        return Arrays.binarySearch(arr,i/2,Math.min(i,length),value);
        }
}
