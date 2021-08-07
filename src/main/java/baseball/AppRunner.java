package baseball;

import java.util.List;
import java.util.Random;

public class AppRunner {

    void process() {

        boolean flag = true;
        //랜덤숫자 생성
        NumberGenerator numberGenerator = new NumberGenerator(new Random());
        List<Integer> answer = numberGenerator.generator();

        while(flag) {
            //숫자 입력
            InputView inputView = new InputView();
            List<Integer> inputNumber = inputView.inputNumber();

            //숫자 검사
            Judgment judgment = new Judgment();
            judgment.judge(answer, inputNumber);

            //결과
            Referee referee = new Referee();
            flag = referee.result(inputView, judgment.getStrike());
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