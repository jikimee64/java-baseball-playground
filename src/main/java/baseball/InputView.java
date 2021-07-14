package baseball;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class InputView {
    private static final String INPUT = "숫자를 입력해 주세요 : ";
    private static final int MAX_NUMBER = 3;
    private static final Scanner scanner = new Scanner(System.in);

    //TODO: 테스트코드 불가능..?
    public Set<Integer> inputNumber(){
        int inputNumber = scanner.nextInt();
        Set<Integer> integers = setNumber(inputNumber);
        while(checkInputNumberSize(integers) ){
            inputNumber = scanner.nextInt();
        }
       return setNumber(inputNumber);
    }

    private Set<Integer> setNumber(int inputNumber){
        Set<Integer> set = new HashSet<>();
        while(inputNumber > 0){
            set.add(inputNumber % 10);
            inputNumber = inputNumber / 10;
        }
        return set;
    }

    private boolean checkInputNumberSize(Set<Integer> integers){
        if(integers.size() != MAX_NUMBER){
            System.out.println("3자리의 숫자 혹은 중복되지 않는 숫자를 입력해주세요.");
            return true;
        }
        return false;
    }

}