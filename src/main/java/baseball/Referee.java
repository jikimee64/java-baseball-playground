package baseball;

public class Referee {

    public boolean result(InputView inputView, Strike strike) {
        if (strike.getStrike() == 3) {
            OutputView.outPrint(OutputView.SYSTEM_END);
            OutputView.outPrintLn();
            OutputView.outPrint(OutputView.SYSTEM_REPLAY);
            inputView.inputRetryOrEnd();
            return false;
        }
        return true;
    }

}