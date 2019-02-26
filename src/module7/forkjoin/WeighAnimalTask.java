package module7.forkjoin;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class WeighAnimalTask extends RecursiveTask<Double> {
    private int start;
    private int end;
    private Double[] weights;

    public WeighAnimalTask(Double[] weights, int start, int end) {
        this.start = start;
        this.end = end;
        this.weights = weights;
    }

    protected Double compute() {
        if (end - start <= 3) {
            double sum = 0;
            for (int i = start; i < end; i++) {
                weights[i] = (double) 10;
                System.out.println("Animal Weighed: " + i);
                sum += weights[i];
            }
            return sum;
        } else {
            int middle = start + ((end - start) / 2);
            System.out.println("[start=" + start + ",middle=" + middle + ",end=" + end + "]");
//            RecursiveTask<Double> otherTask = new WeighAnimalTask(weights, start, middle);
//            otherTask.fork();
//            return new WeighAnimalTask(weights, middle, end).compute() + otherTask.join();
            return new WeighAnimalTask(weights, middle, end).fork().join() +
                    new WeighAnimalTask(weights, start, middle).fork().join();
        }
    }

    public static void main(String[] args) {
        Double[] weights = new Double[10];

        ForkJoinTask<Double> task = new WeighAnimalTask(weights, 0, weights.length);
        ForkJoinPool pool = new ForkJoinPool();
        Double sum = pool.invoke(task);
        System.out.println("Sum: " + sum);

        int[] array = {1, 2, 3, 4, 9};
//        Arrays.binarySearch()
        System.out.println(binarySearch(array, 4, 0, array.length - 1));
    }


    private static int binarySearch(int[] arr, final int x, int l, int r) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;

    }
}
