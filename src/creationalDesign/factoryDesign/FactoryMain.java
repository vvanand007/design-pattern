package creationalDesign.factoryDesign;

import creationalDesign.factoryDesign.os.OS;
import creationalDesign.factoryDesign.os.OSFactory;

public class FactoryMain {
    public static void main(String[] args) {
        OSFactory osFactory = new OSFactory();
        OS os = osFactory.getInstance("ios");
        os.spec();
    }
}
