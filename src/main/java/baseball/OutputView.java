package baseball;

public class OutputView {
    public static final String SYSTEM_END = "2개의 숫자를 모두 맞히셨습니다! 게임종료";
    public static final String SYSTEM_REPLAY = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    public static final String BALL = "볼";
    public static final String STRIKE = "스트라이크";

    public static void outPrint(String message){
        System.out.println(message);
    }
}