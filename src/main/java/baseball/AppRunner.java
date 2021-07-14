package baseball;

import java.util.Random;
import java.util.Set;

public class AppRunner {

    void process(){
        while(true){
        //랜덤숫자 생성
        NumberGenerator numberGenerator = new NumberGenerator();
        Set<Integer> generator = numberGenerator.generator(new Random());
        //숫자 입력
        InputView inputView = new InputView();
        Set<Integer> integers = inputView.inputNumber();
        //숫자 검사


        //결과

        //재시작 or 종료

        }
    }

    /**
     * true를 반환할경우 재시작,
     * @return
     */
    public boolean retryOrEnd(){
        return true;
    }

}