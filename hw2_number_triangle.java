import java.util.Scanner;

public class hw2_number_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}
