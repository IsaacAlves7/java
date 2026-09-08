import java.util.Arrays;

public class ReverseArray {
public static void reverseArray(int[] arr){
    int start = 0;
    int end = arr.length - 1;
    int temp;

    while (start < end) {
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}

}
