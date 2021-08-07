package baseball;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.List;
import java.util.Random;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumberGeneratorTest {
    NumberGenerator numberGenerator;

    @BeforeEach
    void init(){
        numberGenerator = new NumberGenerator();
    }

    @Test
    @DisplayName("랜덤 3자리 숫자를 생성한다. 크기랑 중복값을 검사한다.")
    void generator(){
        Random random = new Random();
        List<Integer> generator = numberGenerator.generator(random);

        long count = generator.stream()
            .distinct()
            .count();

        assertThat(generator.size()).isEqualTo(3); //크기
        assertThat(count).isEqualTo(3); //중복검사
    }

}