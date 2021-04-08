import java.util.Scanner;
public class Palindrome {
    //Ввод текста из командной строки
    public static void main(String[] args)
    {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];}
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите текст: ");
            String s=scan.next();
            isPalindrome(s);

    }
    //Метод изменения символов в строке
    public static String reverseString(String s){
        String r = "";
        for (int i = s.length() - 1; i >= 0; --i)
            r += s.charAt(i);
        return r;


    }
    //Проверка на полидром
    public static Boolean isPalindrome(String s) {
        if(s.equals(reverseString(s))){
            System.out.println("Полиндром");
        }else{
            System.out.println("Не полиндром");
        }
        return s.equals(reverseString(s));

    }
}
