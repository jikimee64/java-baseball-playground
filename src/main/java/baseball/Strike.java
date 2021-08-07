package baseball;

public class Strike {
    int strike;

    public Strike() {
    }

    public Strike(int strike) {
        this.strike = strike;
    }

    public int getStrike() {
        return strike;
    }

    public int plusStrike(){
        return strike++;
    }
}