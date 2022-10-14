public class IncrementPrecisionInteger713 {


    public static int[] plusOne(int[] array) {
        int len =array.length;
        boolean allnines=true;

        for(int i=0;i<len;i++)
        {
            if (array[i]!=9){
                allnines=false;
                break;
            }
        }
        int[] result;
        if (allnines==true){
            result= new int[len+1];
        }
        else
        {
            result= new int[len];
        }

        int sum=array[len-1]+1;
        int carry=sum/10;
        result[result.length - 1] = sum % 10;

        int ptr1=len-2;
        int ptr2=result.length-2;

        while(ptr1>=0)
        {
            sum=array[ptr1]+carry;
            carry=sum/10;
            result[ptr2] = sum % 10;
            ptr1--;
            ptr2--;

        }
        if (allnines==true )

            result[0]=1;

        return result;

    }
    public static void main(String args[]) {

        // String str="-0";
        int array1[] = {1, 2, 3};
        int res[] = plusOne(array1);
        for(int num: res)
        System.out.print(num);

    }
}
