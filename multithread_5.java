import java.util.ArrayList;
import java.util.List;

class PrimeSumCalculator {
    private static final int THREAD_COUNT = 4;

    public static void main(String[] args) {
        int limit = 1000;
        int sum = calculatePrimeSum(limit);
        System.out.println("Sum of prime numbers up to " + limit + ": " + sum);
    }

    private static int calculatePrimeSum(int limit) {
        List<PrimeSumThread> threads = new ArrayList<>();
        int step = limit / THREAD_COUNT;

        for (int i = 0; i < THREAD_COUNT; i++) {
            int start = i * step + 1;
            int end = (i == THREAD_COUNT - 1) ? limit : (i + 1) * step;
            PrimeSumThread thread = new PrimeSumThread(start, end);
            threads.add(thread);
            thread.start();
        }

        int sum = 0;
        for (PrimeSumThread thread : threads) {
            try {
                thread.join();
                sum += thread.getSum();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return sum;
    }

    private static class PrimeSumThread extends Thread {
        private int start;
        private int end;
        private int sum;

        public PrimeSumThread(int start, int end) {
            this.start = start;
            this.end = end;
            this.sum = 0;
        }

        public int getSum() {
            return sum;
        }

        @Override
        public void run() {
            for (int i = start; i <= end; i++) {
                if (isPrime(i)) {
                    sum += i;
                }
            }
        }

        private boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }
}
