import java.util.Scanner;

public class onethree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of school : ");
        int s = sc.nextInt();
        System.out.print("Enter number of  classroom in each school : ");
        int cr = sc.nextInt();
        System.out.print("Enter number of student in each class : ");
        int c = sc.nextInt();
        int i ,j , k;
        int a [][][] = new int[s][cr][c];

        // data 
        for(k = 0 ; k<s; k++){
            System.out.println("Enter marks for School" + (k+1) + " : ");
            for(i=0; i<cr; i++){
            System.out.println("Classroom" + (i+1) + " : ");

                for(j=0; j<c; j++){
                    System.out.println("Sudent" + (j+1) +" : " );
                    a[k][i][j] = sc.nextInt();
                }
            }
        }
      
        // for print value
        System.out.println("\nStudent Marks:");
        for(k = 0 ; k<s; k++){
            System.out.println(" School" + (k+1) + " : ");
            for(i=0; i<cr; i++){
            System.out.println("Classroom" + (i+1) + " : ");
                for(j=0; j<c; j++){
                    System.out.println("Student" + (j+1) +" : " + a[k][i][j]);

                }
                System.out.println();

            }
        }


    }
}
