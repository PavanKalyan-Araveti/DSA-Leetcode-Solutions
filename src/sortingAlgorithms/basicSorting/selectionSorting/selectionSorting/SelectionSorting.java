package sortingAlgorithms.basicSorting.selectionSorting.selectionSorting;

import java.util.Arrays;

public class SelectionSorting {
    private static void selectionSort(int[] array) {
        for(int i = 0; i < array.length - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            if(i != minIndex){
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }


    public static void main(String[] args) {
        int[] array = { 2,3,4,1,6,5};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
