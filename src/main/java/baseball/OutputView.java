package baseball;

public class OutputView {
    public static final String NOT_DUPLICATION_AND_EMPTY = "3자리의 숫자 혹은 중복되지 않는 숫자를 입력해주세요.";
    public static final String INPUT_NUMBER = "숫자를 입력해주세요 : ";
    public static final String SYSTEM_END = "3개의 숫자를 모두 맞히셨습니다! 게임종료";
    public static final String SYSTEM_REPLAY = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    public static final String BALL = "볼";
    public static final String STRIKE = "스트라이크";

    public static void outPrint(String message){
        System.out.print(message);
    }

    public static void outPrintLn(){
        System.out.println();
    }
}