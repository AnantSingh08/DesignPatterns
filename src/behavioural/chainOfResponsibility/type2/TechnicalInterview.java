package behavioural.chainOfResponsibility.type2;

import java.util.Scanner;

public class TechnicalInterview extends InterviewHandler {
    @Override
    protected void hire(String candidate) {
        System.out.println("Technical round for "+candidate);

        int score = new Scanner(System.in).nextInt();

        if(score>=70) {
            System.out.println(candidate + " passed in " + this.getClass().getSimpleName());
            System.out.println();
            callNext(candidate);
            return;
        }

        System.out.println(candidate + " failed in " + this.getClass().getSimpleName());
    }
}
