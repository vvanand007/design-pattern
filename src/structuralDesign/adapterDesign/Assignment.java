package structuralDesign.adapterDesign;

public class Assignment {
    private Pen pen;

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public void writeAssignment(String assignment) {
        pen.write(assignment);
    }
}
