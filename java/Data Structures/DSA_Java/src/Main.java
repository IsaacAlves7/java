import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        ReverseArray rArray = new ReverseArray();

        int[] arr = {1, 2, 3, 4, 5};

        rArray.reverseArray(arr);

        System.out.println(Arrays.toString(arr));


        long endTime = System.nanoTime() ;
        long totalTime = endTime - startTime;

        System.out.println("Total time taken: " + (float)totalTime/1000000 );

    }

}