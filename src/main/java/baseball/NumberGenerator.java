package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberGenerator {

    List<Integer> list = new ArrayList<>();
    Random random;

    public NumberGenerator(Random random) {
        this.random = random;
        list.add(this.random.nextInt(9)+1);
    }

    public List<Integer> generator() {
        boolean flag = true;
        while (flag) {
            int number = random.nextInt(9) + 1;
            flag = checkDuplication(list, number);
            flag = checkMaxSize(list);
        }
        return list;
    }

    private boolean checkDuplication(List<Integer> list, int number){
        if(!list.contains(number)){
            list.add(number);
        }
        return true;
    }

    private boolean checkMaxSize(List<Integer> numbers){
        if(numbers.size() >= 3){
            return false;
        }
        return true;
    }

}