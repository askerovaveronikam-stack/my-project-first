package homework_34;

import java.util.ArrayList;
import java.util.List;

public class NumberUtils {

    // Метод для обчислення суми чисел
    public static Long getSum(List<Long> numbers) {
        Long sum = 0L;
        for (Long n : numbers) {
            sum += n;
        }
        return sum;
    }

    // Метод, що знаходить непарні числа, множить їх на 2 і повертає новий список
    public static List<Long> multiplyOddNumber(List<Long> numbers) {
        List<Long> result = new ArrayList<>();

        for (Long n : numbers) {
            if (n % 2 != 0) {            // непарне число
                result.add(n * 2);       // множимо на 2
            }
        }

        return result;
    }
}
