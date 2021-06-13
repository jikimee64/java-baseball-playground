package study;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    @DisplayName("1,2을 ','로 split 했을 때 1과 2로 잘 분리되는지 확인")
    void split(){
        String actual = "1,2";
        String[] split = actual.split(",");

        assertThat(split).contains("1");
        assertThat(split).contains("2");
        assertThat(split).containsExactly("1", "2"); //순서까지 체크

    }

    @Test
    @DisplayName("1을 ','로 split 했을 때 1만 포함하는 배열이 반환되는지 확인")
    void split2(){
        String actual = "1";
        String[] split = actual.split(",");

        assertThat(split).contains("1");
    }

    @Test
    @DisplayName(" '(1,2)' 값이 주어졌을 때 String의 substring() 메소드를 활용해 ()을 제거하고 "
        + " '1,2'를 반환하도록 구현")
    void substring(){
        String actual = "(1,2)";
        String substring = actual.substring(1, actual.length()-1);

        assertThat(substring).isEqualTo("1,2");
    }

    @Test
    @DisplayName(" 'abc' 값이 주어졌을 때 String의 chatAt() 메소드를 활용해 특정 위치의 문자를 가져오는 "
        + "학습 테스트를 구현 ")
    void chatAt(){
        String actual = "abc";

        char one = actual.charAt(0);
        char two = actual.charAt(1);
        char three = actual.charAt(2);

        assertThat(one).isEqualTo('a');
        assertThat(two).isEqualTo('b');
        assertThat(three).isEqualTo('c');

    }

    @Test
    @DisplayName("위치 값을 벗어나면 StringIndexOutOfBoundsException이 발생하는 부분에 대한 테스트 ")
    void chatAt_Error(){
        String actual = "abc";

        assertThatThrownBy( () -> {
            char one = actual.charAt(actual.length());
        }).isInstanceOf(IndexOutOfBoundsException.class);
    }


}

