package baseball;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputView {

    private static final String INPUT = "숫자를 입력해 주세요 : ";
    private static final int MAX_NUMBER = 3;
    private static final Scanner scanner = new Scanner(System.in);
    List<Integer> integers = new ArrayList<>();

    public void inputRetryOrEnd() {
        int inputNumber = scanner.nextInt();

        if (inputNumber == 1) {
            Application.main(new String[0]);
        }

        if (inputNumber == 2) {
            System.exit(0);
        }
    }

    //TODO: 테스트코드 불가능..? scanner.nextInt()를 어떻게 해야할지..
    public List<Integer> inputNumber() {
        OutputView.outPrint(OutputView.INPUT_NUMBER);
        String inputNumber = scanner.next();
        integers = setNumber(inputNumber);
        while (checkInputNumberSize(integers)) {
            inputNumber();
        }
        return integers;
    }

    private List<Integer> setNumber(String inputNumber) {
        List<Integer> list = new ArrayList<>();
        String[] split = inputNumber.split("");
        for (String num : split) {
            list.add(Integer.valueOf(num));
        }
        return list.stream().distinct().collect(Collectors.toList());
    }

    private boolean checkInputNumberSize(List<Integer> integers) {
        if (integers.size() != MAX_NUMBER) {
            OutputView.outPrint(OutputView.NOT_DUPLICATION_AND_EMPTY);
            OutputView.outPrintLn();
            integers.clear();
            return true;
        }
        return false;
    }

}