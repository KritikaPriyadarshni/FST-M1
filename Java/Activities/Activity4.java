package activities;

import java.util.Arrays;

public class Activity4 {

    static void ascendingSort(int array[]){
        int size = array.length, i;        //size = 7
        for (i=1; i<size; i++) {            // i=1,
            int key = array[i];             // key = array[1] = 3
            int j = i-1;                    // j = 0

            while (j > 0 && key < array[j]){
                array[j+1] = array[j];
                --j;

            }
            array[j + 1] = key;                         //key =3



        }
    }






    public static void main (String[] args){
        int[] arr = {1,3,6,2,8,4,9};
        ascendingSort(arr);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr));

    }
}
