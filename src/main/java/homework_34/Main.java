package homework_34;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Long> nums = List.of(1L, 2L, 3L, 5L);

        NumberUtils NumberUtils = new NumberUtils();
        Long sum = NumberUtils.getSum(nums);
        List<Long> multiplied = NumberUtils.multiplyOddNumber(nums);

        System.out.println("Sum = " + sum);                   // Sum = 11
        System.out.println("Multiplied odd numbers = " + multiplied); // [2, 6, 10]
    }
}

