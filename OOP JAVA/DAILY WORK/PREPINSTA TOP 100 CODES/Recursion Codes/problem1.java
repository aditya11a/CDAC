public class problem1
{
    public static void main(String[] args) 
    {
        int num=5;
        int power=3;
        power(num,power);
        System.out.println(num+" raied to "+power+" is = "+power(num, power));

    }
    static int power (int num,int power)
    {
        if(power==0)
        {
            return 1;
        }
        else
        {
            return num*power(num, power-1);
        }
    }
}

 