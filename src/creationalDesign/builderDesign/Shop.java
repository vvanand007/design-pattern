package creationalDesign.builderDesign;

public class Shop{
    public static void main(String[] args) {
//        Phone phone = new Phone("Android", 2, "Qualcomm", 5.5, 3100);
        Phone phone = new PhoneBuilder().setOs("Android").setProcessor("Qualcomm").getPhone();
        System.out.println(phone);
    }
}
