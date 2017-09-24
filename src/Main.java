public class Main {

    public static void main(String[] args) {
        int[] arrayAll = {2, 2, 3, -1};
        int[] answer = MaxSubArray.max(arrayAll);
        MaxSubArray.forPrint(answer); // левый и правый индексы максимального подмассива
    }
}
