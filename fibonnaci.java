


public class fibonnaci

{

     public static void main(String []args)

     {

       int a=10,i,tr1=0,tr2=1,sum=0;

        System.out.print("First " + a + " terms: ");


        for (i=1;i<=a;i++)

        {

            System.out.print(tr1+ " + ");

            sum=tr1+tr2;

            tr1 = tr2;

            tr2 = sum;

        }        
     
     }

}
      

         Output:
       First 10 terms: 0 + 1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 + 34 + 