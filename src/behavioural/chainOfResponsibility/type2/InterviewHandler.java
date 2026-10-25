package behavioural.chainOfResponsibility.type2;

public abstract class InterviewHandler {

    protected  InterviewHandler next;

    protected InterviewHandler setNext(InterviewHandler next) {
        this.next = next;
        return next;
    }

    protected void callNext(String candidate) {
        if(next != null) {
            next.hire(candidate);
        } else {
            System.out.println(candidate + " passed all interview rounds");
        }
    }

    protected abstract void hire(String candidate);
}
