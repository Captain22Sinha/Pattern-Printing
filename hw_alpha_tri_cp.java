import java.util.Scanner;

public class hw_alpha_tri_cp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=n-i ; j++){
                System.out.print(" " + " ");
            }
            for(int j=1 ; j<=i ; j++){
                System.out.print((char)(j+64)+ " ");
            }
            System.out.println();
        }
    }
}