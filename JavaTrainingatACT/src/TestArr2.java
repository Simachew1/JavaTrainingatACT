import java.util.Arrays;
import java.util.Scanner;

public class TestArr2 {
    public static void main(String t[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter names of 10 persons ?");
        String []Name  = new String[10];
        for (int i=0;i<Name.length; i++){
            Name[i]= input.nextLine();
            System.out.println("Please insert an other name");
        };
        System.out.println(Arrays.toString(Name));
        double lNumber= Math.round(Math.random()*10);
        System.out.println("Congratulations! The selected name is:" + Name[(int)lNumber]);
        //System.out.println(rand);
    }
}
