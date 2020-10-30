

public class armstrong

{


     public static void main(String []args)

     {

         int num= 375,a,rem,b=0;

         a=num;


        while(a!= 0)

        {

            rem=a%10;

            b+= Math.pow(rem,3);

            a/= 10;

        }

        if(b==num)

            System.out.println(num + " is an Armstrong number.");

        else

            System.out.println(num + " is not an Armstrong number.");

      }

}



      Output:
      375 is not an Armstrong number.