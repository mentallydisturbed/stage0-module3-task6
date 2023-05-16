package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        long check = (long) numberToBeRounded;
        float comp = (float)check;
        comp += 0.5f;

        if(numberToBeRounded >= comp) check++;
        System.out.println(check);
    }
//
//    public static void main(String[] args) {
//        new FloatTypeCasting().roundNumber(3.3f);
//        new FloatTypeCasting().roundNumber(3.8f);
//    }
}
