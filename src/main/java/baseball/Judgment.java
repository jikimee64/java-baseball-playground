package baseball;

import java.util.List;

public class Judgment {

    Ball ball = new Ball(0);
    Strike strike = new Strike(0);

    public boolean judge(List<Integer> answer, List<Integer> inputNumber) {
        for (int inputIndex = 0; inputIndex < inputNumber.size(); inputIndex++) {
            ballCheck(inputNumber.get(inputIndex), answer);
            strikeCheck(inputNumber.get(inputIndex), answer, inputIndex);
        }

        if(strike.getStrike() == 3) {
            return true;
        }
        return false;
    }

    private void ballCheck(Integer inputNumber, List<Integer> answer) {
        if (answer.contains(inputNumber)) {
            ball.plusBall();
        }
    }

    private void strikeCheck(Integer inputNumber, List<Integer> answer, int inputIndex) {
        for (int answerIndex = 0; answerIndex < answer.size(); answerIndex++) {
            checkNumberAndIndex(inputIndex, answerIndex, inputNumber, answer.get(answerIndex));
        }
    }

    private void checkNumberAndIndex(int inputIndex, int answerIndex, Integer input, Integer answer) {
        if (inputIndex == answerIndex && input.compareTo(answer) == 0) {
            ball.minusBall();
            strike.plusStrike();
        }
    }

}