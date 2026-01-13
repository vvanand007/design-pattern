package creationalDesign.factoryDesign.os;

public class OSFactory {
    public OS getInstance(String osType) {
        if(osType.equals("android")) {
            return new Android();
        } else if(osType.equals("ios")) {
            return new Ios();
        } else {
            return new Windows();
        }
    }
}
