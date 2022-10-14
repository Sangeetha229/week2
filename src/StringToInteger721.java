public class StringToInteger721 {


    public static void main(String args[]) {

        // String str="-0";
        String str = "-1234";
        int res = method1(str);
        System.out.println(res);

    }


    public static int method1(String str) {
        int var = 0;
        int sign = 1;
        int result = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '-') {

                sign = -1;
            } else if ((str.charAt(i) >= 0) && (str.charAt(i) <= '9')) {

                result = result * 10 + Character.getNumericValue(str.charAt(i));
            }

        }
        return (result * sign);
    }
}

