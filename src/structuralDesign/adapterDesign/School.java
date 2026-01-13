package structuralDesign.adapterDesign;

public class School {
    public static void main(String[] args) {
        Assignment assignment = new Assignment();
        Pen pen = new PenAdapter();
        assignment.setPen(pen);
        assignment.writeAssignment("I am a bit tired today");
    }
}
