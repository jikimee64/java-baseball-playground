package baseball;

public class Ball {
    int ball;

    public Ball() {
    }

    public Ball(int ball) {
        this.ball = ball;
    }

    public int getBall() {
        return ball;
    }

    public int plusBall() {
        return ball++;
    }

    public int minusBall() {
        return ball--;
    }
}