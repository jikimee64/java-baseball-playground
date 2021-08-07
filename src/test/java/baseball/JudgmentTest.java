package baseball;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class JudgmentTest {
    Judgment judgment;

    @BeforeEach
    void init() {
        judgment = new Judgment();
    }

    @ParameterizedTest
    @CsvSource(value = {"1,2,3:1,2,3:true", "1,2,3:3,2,1:false", "1,2,3:4,2,3:false"}, delimiter = ':')
    @DisplayName("스트라이크면 true를, 아니면 false를 반환한다")
    void judgement(String input, String answer, boolean flag){

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
        boolean result = judgment.judge(answerList, inputList);

        //then
        assertThat(result).isEqualTo(flag);
    }

}