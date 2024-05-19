package org.johnwick182.tdd;

public class ReverseArray {
    public int[] reverseArray(int[] array) {
        int i = 0;
        int j = array.length - 1;

        while (i < j) {
            int aux = array[i];
            array[i] = array[j];
            array[j] = aux;
            i++;
            j--;
        }
        return array;
    }

}
