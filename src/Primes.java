public class Primes
    //Вввод чисел от 2 до 100 и проверка каждого числа
{
    public static void main(String[] args)
    {
        for (int i=2;i<=100;i++)
        {
            if(isPrime(i))
                System.out.print(i+" ");
        }
    }
    //Проверка числа
    public static boolean isPrime(int n)
    {
        if (n<=1)
            return false;
        else if (n <=3)
            return true;
        else if (n%2==0 || n %3 ==0)
            return false;
        int m = 5;
        while (m*m <=n)
        {
            if (n % m ==0 || n % (m+2) == 0)
                return false;
            m=m+6;
        }
        return true;
    }
}
