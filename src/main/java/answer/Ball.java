package answer;

import java.util.Objects;

public class Ball {

    private final int position;
    private final int ballNo;
    //private final BallNumber ballNo; //Wrapper 클래스 이용

    public Ball(int position, int ballNo) {
        this.position = position;
        this.ballNo = ballNo;
        //this.ballNo = new BallNumber(ballNo);
    }

    public BallStatus play(Ball ball) {
        if(this.equals(ball)){
            return BallStatus.STRIKE;
        }

        if(ball.matchBallNo(ballNo)){
            return BallStatus.BALL;
        }

        return BallStatus.NOTHING;
    }

    private boolean matchBallNo(int ballNo) {
        return this.ballNo == ballNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Ball ball = (Ball) o;
        return position == ball.position && ballNo == ball.ballNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, ballNo);
    }
}
