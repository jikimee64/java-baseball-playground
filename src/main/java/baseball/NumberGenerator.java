package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberGenerator {

    public List<Integer> generator(Random random) {
        List<Integer> list = new ArrayList<>();
        int number = random.nextInt(9) + 1; //1 ~ 9
        while (checkMaxSize(list) && checkDuplication(list, number)) {
            list.add(number);
        }
        return list;
    }

    private boolean checkDuplication(List<Integer> list, int number){
        if(list.contains(number)){
            return true;
        }
        return false;
    }

    private boolean checkMaxSize(List<Integer> numbers){
        if(numbers.size() != 3){
            return true;
        }
        return false;
    }

}