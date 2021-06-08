import java.util.Scanner;
import java.io.*;

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
        System.out.println("Prod is: "+prod);
        System.out.println("Min is: "+min);
        System.out.println("Max is: "+max);
    }
    public static void reverseNumber(){
        int number=0;
        int reversenum =0;
        System.out.println("Input your number and press enter: ");
        Scanner in = new Scanner(System.in);
        number = in.nextInt();
        while( number != 0 )
        {
            reversenum = reversenum * 10;
            reversenum = reversenum + number%10;
            number = number/10;
        }

        System.out.println("Reverse number is: "+reversenum);
    }
    public static void countVowelsDigits(String str){
        int vowels = 0, digits = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                vowels++;
            if (ch >= '0' && ch <= '9')
                digits++;
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Digits: " + digits);
    }
    public static void insertElementInArray(){
        int n, pos, x;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n+1];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.print("Enter the position where you want to insert element:");
        pos = s.nextInt();
        System.out.print("Enter the element you want to insert:");
        x = s.nextInt();
        for(int i = (n-1); i >= (pos-1); i--)
        {
            a[i+1] = a[i];
        }
        a[pos-1] = x;
        System.out.print("After inserting:");
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.print(a[n]);
    }
    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        System.out.println("\nThe sorted array is: ");
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
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
        reverseNumber();
        countVowelsDigits("Rita1234");
        insertElementInArray();
        int arr[]={5, 9, 18, 7, 4, 3, 21, 30, 17, 15, 100};
        bubbleSort(arr);
    }
}
