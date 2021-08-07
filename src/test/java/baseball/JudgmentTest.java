package baseball;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

class JudgmentTest {
    Judgment judgment;

    @BeforeEach
    void init() {
        judgment = new Judgment();
    }

    @ParameterizedTest
    @MethodSource("provided")
    @DisplayName("스트라이크와 볼의 개수를 판단한다")
    void judgement(String input, String answer, int ballCount, int strikeCount){

        //given
        List<Integer> inputList = new ArrayList<>();
        for(String inputNumber : input.split(",")){
            inputList.add(Integer.valueOf(inputNumber));
        }

        List<Integer> answerList = new ArrayList<>();
        for(String answerNumber : answer.split(",")){
            answerList.add(Integer.valueOf(answerNumber));
        }

        //when
        judgment.judge(answerList, inputList);

        Ball ball = judgment.getBall();
        Strike strike = judgment.getStrike();

        //then
        assertThat(ball.getBall()).isEqualTo(ballCount);
        assertThat(strike.getStrike()).isEqualTo(strikeCount);
    }

    //입력, 정답, 볼개수, 스트라이크 개수
    private static Stream<Arguments> provided(){
        return Stream.of(
            Arguments.of("7,2,5", "7,2,4,", 0, 2),
            Arguments.of("1,2,3", "1,2,3,", 0, 3),
            Arguments.of("1,2,3", "3,2,1,", 2, 1),
            Arguments.of("1,2,3", "4,2,3,", 0, 2)

        );
    }

}