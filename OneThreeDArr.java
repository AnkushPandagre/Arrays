import java.util.Scanner;

public class OneThreeDArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. Of School : ");
        int b = sc.nextInt();
        System.out.print("Enter No. Of  classes in each school : ");
        int r = sc.nextInt();
        System.out.println("Enter no of student in each Class : ");
        int c = sc.nextInt();

        int a[][][] = new int [b][r][c];
        int k, i , j;
       
        for( k= 0 ; k<b; k++){
            for(i = 0 ; i<r; i++){
                System.out.print("Enter Marks of the Student of " + (k+1)+ "class" + (i+1) + ":");
                for(j=0 ; j<c; j++){
                 a[k][i][j] = sc.nextInt();
                }
            }
        }
        System.out.println("Details of the student are : ");
        for( k= 0 ; k<b; k++){
            for(i = 0 ; i<r; i++){
                for(j=0 ; j<c; j++){
                   System.out.println(a[k][i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("---------------------");
        }

    }
}
