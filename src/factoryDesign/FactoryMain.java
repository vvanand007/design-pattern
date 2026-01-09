package factoryDesign;

import factoryDesign.os.OS;
import factoryDesign.os.OSFactory;

public class FactoryMain {
    public static void main(String[] args) {
        OSFactory osFactory = new OSFactory();
        OS os = osFactory.getInstance("ios");
        os.spec();
    }
}
