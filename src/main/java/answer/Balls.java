package answer;

import java.util.ArrayList;
import java.util.List;

/**
 * 이것도 방법이지만 ..
 * play라는 메소드가 변경가능성이 있으면 인터페이스로 호출 ㄱㄱ
 * 다른 방식으로 play할때 의미가 있음
 */
public class Balls implements Playable{

    private final List<Ball> answers;

    public Balls(List<Integer> answers) {
        this.answers = mapBall(answers);
    }

    //인스턴스 변수에 의존안해서 static
    private static List<Ball> mapBall(List<Integer> answers) {
        List<Ball> balls = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            balls.add(new Ball(i + 1, answers.get(i)));
        }
        return balls;
    }

    //핵심
    public PlayResult play(List<Integer> balls){
        Balls userBalls = new Balls(balls);
        PlayResult result = new PlayResult();
        for (Ball answer : answers){
            BallStatus status = userBalls.play(answer);
            result.report(status);
        }
        return result;
    }

    public BallStatus play(Ball userBall) {
        return answers.stream()
            .map(answer -> answer.play(userBall))
            .filter(BallStatus::isNotNothing)
            .findFirst()
            .orElse(BallStatus.NOTHING);
    }
}