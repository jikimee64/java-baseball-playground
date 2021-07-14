package baseball;

public class Strike {
    int strike;

    public Strike(int strike) {
        this.strike = strike;
    }

    public int plusStrike(){
        return strike++;
    }
}