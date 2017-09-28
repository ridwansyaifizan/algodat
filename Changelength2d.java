    package Nomor3;
import java.util.Scanner;
public class Changelength2d {
    public static void main(String[] args) {
        int x[][] = new int[2][2];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < x.length; i++){
            for (int j = 0; j < x.length; j++){
                x[i][j] = i;
                x[i][j] = j;
                System.out.print(x[i][j]+" ");
        }
            System.out.println(" ");
    }
        System.out.println("setelah dirubah");
        x = new int[3][3];
        for(int i = 0; i < x.length; i++){
            for (int j = 0; j < x.length; j++){
                x[i][j] = i;
                x[i][j] = j;
                System.out.print(x[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
