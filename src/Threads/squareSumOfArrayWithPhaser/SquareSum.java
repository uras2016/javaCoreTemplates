package Threads.squareSumOfArrayWithPhaser;

public interface SquareSum {
    long getSquareSum(int[] values, int numberOfThreads) throws InterruptedException;
}