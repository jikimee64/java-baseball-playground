package answer;


import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValidationUtilsTest {

    @Test
    @DisplayName("야구_숫자_1_9_검증")
    void invalid(){
        assertThat(ValidationUtils.validNo(9)).isTrue(); //경계값
        assertThat(ValidationUtils.validNo(1)).isTrue(); //경계값
        assertThat(ValidationUtils.validNo(0)).isFalse();
        assertThat(ValidationUtils.validNo(10)).isFalse();

    }


}
