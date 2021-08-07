package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private static final String INPUT = "숫자를 입력해 주세요 : ";
    private static final int MAX_NUMBER = 3;
    private static final Scanner scanner = new Scanner(System.in);

    public void inputRetryOrEnd(){
        int inputNumber = scanner.nextInt();

        if(inputNumber == 1){
            Application.main(new String[0]);
        }

        if(inputNumber == 2){
            System.exit(0);
        }
    }

    //TODO: 테스트코드 불가능..?
    public List<Integer> inputNumber(){
        int inputNumber = scanner.nextInt();
        List<Integer> integers = setNumber(inputNumber);
        while(checkInputNumberSize(integers) ){
            inputNumber = scanner.nextInt();
        }
       return setNumber(inputNumber);
    }

    private List<Integer> setNumber(int inputNumber){
        List<Integer> list = new ArrayList<>();
        while(inputNumber > 0){
            list.add(inputNumber % 10);
            inputNumber = inputNumber / 10;
        }
        return list;
    }

    private boolean checkInputNumberSize(List<Integer> integers){
        if(integers.size() != MAX_NUMBER){
            System.out.println("3자리의 숫자 혹은 중복되지 않는 숫자를 입력해주세요.");
            return true;
        }
        return false;
    }

}