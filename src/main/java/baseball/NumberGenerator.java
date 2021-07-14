package baseball;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class NumberGenerator {

    public Set<Integer> generator(Random random) {
        Set<Integer> list = new HashSet<>();
        while (checkMaxSize(list)) {
            int number = random.nextInt(9) + 1; //1 ~ 9
            list.add(number);
        }
        return list;
    }

    private boolean checkMaxSize(Set<Integer> numbers){
        if(numbers.size() != 3){
            return true;
        }
        return false;
    }

}