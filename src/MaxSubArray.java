import java.util.Arrays;

public class MaxSubArray {

    int[] arrayAll;

    public MaxSubArray(int[] arrayAll) {

        this.arrayAll = max(arrayAll);
    }

    public static int[] max(int[] arrayAll) {

        int answer = arrayAll[0];
        int left = 0;
        int right = 0;
        int sum = 0;
        int minusPosition = -1;

        for (int i = 0; i < arrayAll.length; i++) {

            sum += arrayAll[i];

            if (sum > answer) {
                answer = sum;
                left = minusPosition + 1;
                right = i;
            }

            if (sum < 0) {
                sum = 0;
                minusPosition = i;
            }
        }

        int[] ret = {left, right};
        return ret;
    }

    public static void forPrint(int arrayAll[]) {
        for (int element : arrayAll) {
            System.out.print(element + " ");
        }
    }

    @Override
    public String toString() {
        String count = "";
        for (int i = 0; i < arrayAll.length; i++) {
            count += arrayAll[i] + " ";
        }
        return count;
    }
}
