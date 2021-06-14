package study;

import static org.assertj.core.api.Assertions.assertThat;

import com.sun.tools.javac.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest {

    private List<String> operator = List.of("+", "-", "*", "/");

    @ParameterizedTest
    @CsvSource(value = {"2 + 3 * 4 / 2:10", "5 - 3 * 3 + 1:7"}, delimiter = ':')
    @DisplayName("1, 2, 3 값은 contains 메소드 실행결과 true, 4, 5 값을 넣으면 false 가 반환")
    void contains2(String input, int result) {

        String[] split = input.split(" ");
        int total = Integer.parseInt(split[0]);
        for (int i = 0; i < split.length; i++) {
            if (operator.contains(split[i])) { //연산자를 기준으로 다음 피연산자 까지 계산한다음 total에 누적
                total = calculate(split[i], total, split[i + 1]);
            }
        }

        assertThat(total).isEqualTo(result);

    }

    private int calculate(String operator, int prev, String now) {
        switch (operator) {
            case "+":
                return prev + Integer.parseInt(now);
            case "-":
                return prev - Integer.parseInt(now);
            case "*":
                return prev * Integer.parseInt(now);
            case "/":
                return prev / Integer.parseInt(now);
            default:
                return 0;
        }
    }
}