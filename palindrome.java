


public class palindrome

{

     public static void main(String []args)
        {

            int num=1881,ri=0,rem,original;

            original=num;

           for( ;num !=0;num/=10 )

            {

              rem=num % 10;

              ri=ri*10+rem;

            }

            if(original==ri)

            System.out.println(original+ " is a palindrome.");

            else

            System.out.println(original+ " is not a palindrome.");

         }

}
 
             
          Output:
           1881 is a palindrome.