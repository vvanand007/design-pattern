package factoryDesign.os;

public class Windows implements OS{
    @Override
    public void spec() {
        System.out.println("Windows is a product of Microsoft.");
    }
}
