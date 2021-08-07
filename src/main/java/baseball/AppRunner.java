package baseball;

import java.util.List;
import java.util.Random;

public class AppRunner {

    void process() {

        //랜덤숫자 생성
        NumberGenerator numberGenerator = new NumberGenerator();
        List<Integer> answer = numberGenerator.generator(new Random());

        //숫자 입력
        InputView inputView = new InputView();
        List<Integer> inputNumber = inputView.inputNumber();

        //숫자 검사
        Judgment judgment = new Judgment();
        boolean judge = judgment.judge(answer, inputNumber);

        //결과
        Referee referee = new Referee();
        boolean isSuccess = referee.result();

        //재시작 or 종료
        if (isSuccess) {
            OutputView.outPrint(OutputView.SYSTEM_END);
            OutputView.outPrint(OutputView.SYSTEM_REPLAY);
            inputView.inputRetryOrEnd();
        }

    }

    /**
     * true를 반환할경우 재시작,
     *
     * @return
     */
    public boolean retryOrEnd() {
        return true;
    }

}