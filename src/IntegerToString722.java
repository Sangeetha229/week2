
// import java.util.*;
//    public class IntergertoString {
//
//        public static void main(String args[]) {
//            int num = 45;
//
//            String res = method1(num);
//            System.out.println(res);
//
//        }
//
//
//        public static String method1(int num) {
//
//            if (num == 0)
//                return "0";
//            int sign=1;
//            if (num < 0) {
//
//                sign = -1;
//                num = Math.abs(num);
//            }
//
//
//            StringBuilder str = new StringBuilder();
//
//            //int result[]=new int[5];
//
//            System.out.println(num);
//            if (sign == -1) {
//
//                str.append("-");
//            }
//            while(num>0){
//            //for (int i=0;i<result.length;i++){
//                int res=num%10;
//                num=num/10;
//                str=str.append(res);
//                //result[i]=res;
//            }
//start of comment
//
//            for (int i=0;i<result.length-1;i++){
//                System.out.print(result[i]);
//            }
//
//            if (sign == -1) {
//
//                str.append("-");
//            }
//
//            for (int i=0;i<result.length-1;i++){
//
//                str=str.append(result[i]);
//            }
//end of comment
//            return str.toString();
//        }
//
//    }

import java.util.*;

public class IntegerToString722 {


    public static void main(String args[]) {
        int num = -45;

        String res = method1(num);
        System.out.println(res);

    }


    public static String method1(int num) {

        if (num == 0)
            return "0";
        int sign = 1;
        if (num < 0) {

            sign = -1;
            num = Math.abs(num);
        }


        StringBuilder str = new StringBuilder();


        if (sign == -1) {

            str.append("-");
        }
        // str.reverse();
        str.append(num);

        return str.toString();
    }

}
