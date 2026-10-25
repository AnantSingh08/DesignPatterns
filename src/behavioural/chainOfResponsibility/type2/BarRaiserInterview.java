package behavioural.chainOfResponsibility.type2;

import java.util.Scanner;

public class BarRaiserInterview extends InterviewHandler {
    @Override
    protected void hire(String candidate) {
        System.out.println("BarRaiserInterview round for "+candidate);

        int score = new Scanner(System.in).nextInt();

        if(score>=80) {
            System.out.println(candidate + " passed in " + this.getClass().getSimpleName());
            System.out.println();
            callNext(candidate);
            return;
        }

        System.out.println(candidate + " failed in " + this.getClass().getSimpleName());
    }
}
