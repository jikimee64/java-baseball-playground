package answer;

/**
 * 이거 비추
 * 래퍼 클래스 이용 (BallNumber) 원시값 포창
 */
public class ValidationUtils {

    public static final int MIN = 1;
    public static final int MAX = 9;

    public static boolean validNo(int no) {
        return no >= MIN && no <= MAX;
    }
}

