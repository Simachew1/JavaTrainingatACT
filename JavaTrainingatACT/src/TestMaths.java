import java.util.Scanner;
public class TestMaths {
    public static void main(String[] args) {
         /*
        int a=7;
        int b=2;
        int c=1;

        //Addition operator
        System.out.println("a+b ="+(a + b));
        //Subtraction operator
        System.out.println("a-b ="+(a - b));
        //Multiplication operator
        System.out.println("a*b ="+(a * b));
        //Division operator
        System.out.println ((double)a/b); //3.5 to get the fraction numbers
        //System.out.println(a/c-b);//9 Folows BODMAS rule
        int x= a-=b; //a= a-b
        System.out.println(x);//5
        //Assignment operation
        System.out.println(a*=b);//10
        //Relational operation
        System.out.println(3==5);//false
        System.out.println(3!=5);//True

         */
        /*
      //Logical operators
        boolean isAdult= true;
        boolean hasPosition= false;
        boolean hasCar;
        hasCar= isAdult && hasPosition;
        System.out.println(hasCar);//false
        hasCar = isAdult || hasPosition;
        System.out.println(hasCar);//True
        hasCar=!isAdult||hasPosition;
        System.out.println(hasCar);//false
        //Increments
        int num= 5;

        num++;
        System.out.println(num);//6
        /*
        int num2=5;
        System.out.println(num2--);//5
        System.out.println(num2);//4
        System.out.println(--num2);//3
        System.out.println(++num2);//4

        */
        /*
//Exercise
        boolean CrimeRecord= true;
        float salary = 70_000;
        boolean hasGoodSalary=salary>=70_000; //true
        boolean socialRecord= true;
        float saving= 600_000;
        boolean hasGoodSaving= saving>500_000;
        boolean hasLoan= (!CrimeRecord&&socialRecord) ||(hasGoodSalary&&hasGoodSaving);
        System.out.println(hasLoan);//false

        boolean hasLoan1= CrimeRecord&&socialRecord&&hasGoodSalary||hasGoodSaving;
        System.out.println(hasLoan1);//true

         */
            //Insert input from the user!
            Scanner sc=new Scanner(System.in);
            System.out.println("Have you good social record?");
            boolean socialRecord= sc.nextBoolean();
            System.out.println("Have you crime record?");
            boolean crimeRecord= sc.nextBoolean();
            System.out.println("How much your salary?");
            double salary=sc.nextDouble();
            boolean hasGoodSalary = salary>70_000;
            System.out.println("How much your saving?");
            float saving= sc.nextFloat();
            //float saving =sc.nextFloat();
            boolean hasGoodSaving= saving>500_000;


        }
    }



