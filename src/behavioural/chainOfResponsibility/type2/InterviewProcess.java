package behavioural.chainOfResponsibility.type2;

public class InterviewProcess {
    private final InterviewHandler chain;

    public InterviewProcess() {
        this.chain = new TechnicalInterview();
        this.chain.setNext(new BarRaiserInterview())
                .setNext(new BehaviouralInterview());
    }

    public void start(String candidate) {
        chain.hire(candidate);
    }
}
