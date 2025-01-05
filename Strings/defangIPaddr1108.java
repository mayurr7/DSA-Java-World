package Strings;

public class defangIPaddr1108 {

    public static void main(String[] args) {
        String adreess = "1.1.1.1";
        System.out.println(defangIPaddr(adreess));
    }
    public static String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
}