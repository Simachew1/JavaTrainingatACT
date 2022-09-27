//Java Program to demonstrate the use of If else-if ladder.
//It is a program of grading system for fail, D grade, C grade, B grade, A grade and A+.

import java.util.Scanner;  // Input from keyboard
public class TestGrade {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in); // to scan the input from keyboard
        System.out.println("Enter your mark");
               /*
               Method                     description
               ------                      ----------
               int nextInt()              Used to scan the next tiken of the input as integer
               byte nextByte()            used to scan the next tiken of the input as byte
               String netxLine()          Advances this scanner past the current line
               */
        int marks = sc.nextInt();
        if(marks<50){
            System.out.println("fail");
        }
        else if(marks>=50 && marks<60){
            System.out.println("Grade: D");
        }
        else if(marks>=60 && marks<70){
            System.out.println("Grade: C");
        }
        else if(marks>=70 && marks<80){
            System.out.println("Grade: B");
        }
        else if(marks>=80 && marks<90){
            System.out.println("Grade: A");
        }else if(marks>=90 && marks<100){
            System.out.println("Grade: A+");
        }else{
            System.out.println("Invalid!");

        }
             /*
                  // multidimensional array , row and column
               int a[][] ={{1,2,3,4},{10,20,30,40}};
               System.out.println(a[1][1]);//20
               System.out.println(a[0][1]);//2
               System.out.println(a[1][0]);//10
               System.out.println(a[0][3]);//4

               */

    }
}
