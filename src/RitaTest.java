import java.sql.SQLOutput;

public class RitaTest {
    public static void checkOddNumbers(int a){
        if(a%2==0)
        {
            System.out.println("Even Number");
        }else {
            System.out.println("Odd Numbers");
        }
        System.out.println("Bye!");
    }
    public static void sumAverageInt(int a){
        int i;
        int sum = 0, contor=0;
        float average=0;

        for(i= 1; i<= a; i++){
            sum = sum + i;
            contor++;
        }
        average=(float)sum/contor;
        System.out.println("The Sum is: "+sum);
        System.out.println("The average is:"+average);
    }
    public static boolean uniqueCharacters(String str){
        for (int i = 0; i < str.length(); i++)
            for (int j = i + 1; j < str.length(); j++)
                if (str.charAt(i) == str.charAt(j))
                    return false;
        return true;

    }
    public static void sumProductMinMax(int a, int b, int c){
        int sum = 0, prod=1, min, max;

        sum=a+b+c;
        prod=a*b*c;

        min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        max = a;
        if (b >max) {
            max= b;
        }
        if (c >max) {
            max = c;
        }
        System.out.println("Sum is: "+sum);
        System.out.println("Prd is: "+prod);
        System.out.println("Min is: "+min);
        System.out.println("Max is: "+max);
    }

    public static void main(String[] args) {
       RitaTest obj=new RitaTest();
       checkOddNumbers(10);
       checkOddNumbers(5);
       sumAverageInt(100);
       String input="kmf5";
       if(obj.uniqueCharacters(input))
           System.out.println("True");
       else
           System.out.println("False");
        sumProductMinMax(10,15,20);
    }
}
