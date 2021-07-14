package baseball;

public class Ball {
    int ball;

    public Ball(int ball) {
        this.ball = ball;
    }

    public int plusBall() {
        return ball++;
    }
}