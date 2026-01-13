package structuralDesign.adapterDesign;

public class PenAdapter implements Pen{
    PilotPen pp = new PilotPen();
    @Override
    public void write(String assignment) {
        pp.mark(assignment);
    }
}
