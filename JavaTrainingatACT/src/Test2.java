import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
/* int a=3;
int b=a;
b=100;

String Buffer name= new StringBuffer("hanna");
StringBuffer name2=name; //hanna
nam.append ('A');  // hannaA
       String name = "hana";
        System.out.println(name.toUpperCase()); // HANNA
        System.out.println(name); //hanna the uppercasee is not stored, no variable assigned!

            */

        /*
        ----------------------------------------
        int [] numberS= new int [5]; //the size is 5, indexes are  0 1 2,3,4
        //System.out.println(numberS);  // shows memory address
        numberS[0] =2;
        numberS[1] =4;
        numberS[2] =6;
        numberS[3] =8;
        numberS[4] =10;
        //numberS[5] =2; // ArrayIndexOutOfBoundsException ,Index 5 out of bounds for length 5
         */

        /*
        ......................................................
        int [] numberS= {20,40,60,80,100};
        System.out.println(numberS[4]); // 100,
        System.out.println(numberS[5]); // ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
         //for (int i=0;i<numberS.length;i++);
        //System.out.println(numberS[i]); //20,40,60,80,100
         */

        //int [] numberS={2,4,6,8,10};
        //int [] [] numberS2=new int[2][4]; // multi dimensional array, array of arrays
        //System.out.println(Arrays.deepToString(numberS2));// [[0, 0, 0, 0], [0, 0, 0, 0]]
        /*
        int[] a={1,3,5,7,9};
        int[] b={2,4,6,8,10};
        int[]total=new int[a.length+b.length];
        int Length= a.length+b.length;
        System.arraycopy(a,0,total,0,a.length); //[1, 3, 5, 7, 9, 0, 0, 0, 0, 0]
        System.arraycopy(b,0,total,5,b.length); //[0, 0, 0, 0, 0, 2, 4, 6, 8, 10]
        System.out.println(Arrays.toString(total)); // [1, 3, 5, 7, 9, 2, 4, 6, 8, 10]
          */

        int[] a={4,5,6,7,8};  //5,6,7
        int[] b={12,13,14,15}; //12,13
        int[] c={5,4,3,2,1}; //3,2,1
        int[] d={20,25,26};//20,25
        int[]total= new int [10];   // T=0,1,2,3,4,5,6,7,8,9
        System.arraycopy(a,1,total,0,3); //[5, 6, 7, 0, 0, 0, 0, 0, 0, 0]
        System.arraycopy(b,0,total,3,2); //[5, 6, 7, 12, 13, 0, 0, 0, 0, 0]
        System.arraycopy(c,2,total,5,3);//[5, 6, 7, 12, 13, 3, 2, 1, 0, 0]
        System.arraycopy(d,0,total,8,2);//[5, 6, 7, 12, 13, 3, 2, 1, 20, 25]
        System.out.println(Arrays.toString(total)); // [5, 6, 7, 12, 13, 3, 2, 1, 20, 25]
        /*
        int mArray[][] =new int[3][2];
        System.out.println(Arrays.deepToString(mArray));//[[0, 0], [0, 0], [0, 0]]
         */
   /*
        int [][][] mArray =new int[4][2][3];
        System.out.println(Arrays.deepToString(mArray));// [[[0, 0, 0], [0, 0, 0]], [[0, 0, 0], [0, 0, 0]], [[0, 0, 0], [0, 0, 0]], [[0, 0, 0], [0, 0, 0]]]
     */
        int [][][]mArray= new int [2][2][5];
        int []total1={2,5,6,5,4};
        //System.out.println(Arrays.deepToString(mArray));// [[[0, 0, 0, 0, 0], [0, 0, 0, 0, 0]], [[0, 0, 0, 0, 0], [0, 0, 0, 0, 0]]]
        //System.out.println(Arrays.toString(mArray[0][0]));// [0, 0, 0, 0, 0]
        // To copy total1 in the thirdplace of mArray
        System.out.println(Arrays.deepToString(mArray));
        System.out.println(Arrays.toString(mArray[0][0]));
        //System.arraycopy(total1,0,mArray[0][1],0,5);
        //System.out.println(Arrays.toString(mArray));
    }

}

