import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code using the existing class ConstantsAndUtilities
        for (String s : Arrays.asList(ConstantsAndUtilities.A_CONSTANT_TTT,
                ConstantsAndUtilities.B_CONSTANT_QQQ, ConstantsAndUtilities.getMagicString(),
                ConstantsAndUtilities.convertStringToAnotherString("aa"))) {
            System.out.println(s);
        }
    }

}

// Don't change this class
class ConstantsAndUtilities {

    public static final String A_CONSTANT_TTT = "1234";

    public static final String B_CONSTANT_QQQ = "7890";

    public static String getMagicString() {
        return A_CONSTANT_TTT + B_CONSTANT_QQQ;
    }

    public static String convertStringToAnotherString(String s) {
        return A_CONSTANT_TTT + s;
    }
}