package Day_1;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int size = 10;
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
        }
        System.out.println(Arrays.toString(numbers));
        int value = 10;
        int pos = binarySearch(numbers, value);
        if (pos != -1) {
            System.out.println("Element found at " + pos + " index");
        }
        else{
            System.out.println("element not found");
        }
    }

    public static int binarySearch(int[] array,int value){
        int pos=-1;
        int beg=0;
        int end=array.length-1,mid;
        while(beg<=end){
            mid=(beg+end)/2;
            if(array[mid]==value){
                pos=mid;
            }
            else if(array[mid]>value){
                end=mid-1;
            }
            else{
                beg=mid+1;
            }
        }
      return pos;
    }
}
