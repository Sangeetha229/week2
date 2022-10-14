package week1;

public class substring112 {


    public static  boolean substring_func1(String s1, String s2){

        if (s1.equals("") || s2.equals(""))
            return false;
        if (s2.length() < 1)
            return true;

        int s1len=s1.length();
        int s2len=s2.length();

        for(int i=0;i<s1len-s2len;i++){

            int j;

            for(j=0;j<s2len;j++){

                if (s1.charAt(i + j) != s2.charAt(j))
                    break;
            }

            if(j==s2len)
                return true;
        }
            return  false;
    }

    public static void main(String[] args) {
        String s1 = "laboratory";
        String s2 = "rat";
        //String s1="cat";
        //String s2="meow";
        boolean result = substring_func1(s1, s2);

        if (result)
            System.out.println("True-present");
        else
            System.out.println("False-Not present");

    }


}
