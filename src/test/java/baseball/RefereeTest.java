package baseball;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

class RefereeTest {

    Referee referee;
    InputView inputView;

    @BeforeEach
    void init() {
        referee = new Referee();
        inputView = new InputView();
    }


    @ParameterizedTest
    @MethodSource("provided")
    @DisplayName("Strike 개수를 판단하여 게임의 종료여부를 알 수 있다.")
    void result(int strikeCount, boolean flag) {
        //given
        Strike strike = new Strike(strikeCount);

        //when
        boolean result = referee.result(inputView, strike);

        //then
        assertThat(result).isEqualTo(flag);
    }

    private static Stream<Arguments> provided() {
        return Stream.of(
            Arguments.of(3, true),
            Arguments.of(2, false),
            Arguments.of(1, false)
        );
    }

}