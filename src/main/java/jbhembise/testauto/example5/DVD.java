package jbhembise.testauto.example5;

public class DVD extends AbstractMedia {

    private int duration;

    public DVD(String name, int duration) {
        super(name);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}
