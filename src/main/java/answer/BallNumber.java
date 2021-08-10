package answer;

public class BallNumber {
    public static final int MIN_NO = 1;
    public static final int MAX_NO = 9;

    private int no;

    /**
     * 생성될 때 1 ~9라는 보장이 됨
     * @param no
     */
    public BallNumber(int no) {
        if(no < MIN_NO || no > MAX_NO) {
            throw new IllegalArgumentException("sss");
        }
        this.no = no;
    }

    //로직이 추가될 수 있다.
}
