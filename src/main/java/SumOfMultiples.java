public class SumOfMultiples {

    public int sumOfMultiples3and5(int belowNumbers) {
        int sum = 0;

        for (int i = 0; i < belowNumbers; i ++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
