public class evenDigitSum
{

    public static int getEvenDigitSum(int number)
    {
        int same = number;
        int sum = 0;

        if(number <0)
        {
            return -1;
        }

        while (same > 0)
        {
            int remainder =  same % 10;
            if(remainder % 2 == 0)
            {
                sum += remainder;
            }
            same /= 10;
        }

        return sum;
    }
}
