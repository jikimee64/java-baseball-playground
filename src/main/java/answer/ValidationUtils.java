package answer;

public class ValidationUtils {

    public static final int MIN = 1;
    public static final int MAX = 9;

    public static boolean validNo(int no) {
        return no >= MIN && no <= MAX;
    }
}

