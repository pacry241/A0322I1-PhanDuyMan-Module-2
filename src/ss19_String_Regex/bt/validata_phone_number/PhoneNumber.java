package ss19_String_Regex.bt.validata_phone_number;

public class PhoneNumber {
    public static void main(String[] args) {
        String regex = "^[(]\\d{2}[)][-][(]0\\d{9}[)]$";
        System.out.println("(84)-(0978489648)".matches(regex));
        System.out.println("(a8)-(22222222)".matches(regex));

    }
}
