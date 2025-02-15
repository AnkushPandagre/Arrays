import java.util.Scanner;

public class oneTwoDArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of classes :");
        int r = sc.nextInt();
        System.out.print("ENter the NUmber of stuent in Each class");
        int c = sc.nextInt();
        int i , j;
        int a[][] = new int[r][c];
      for(i= 0; i < r; i++){
        System.out.print("Enter the marks of the marks of the student of each class"+ (i+1) + " : ");
        for(j=0; j<c; j++){
            a[i] [j] = sc.nextInt();
        }
    }
    System.out.print("Details of the student");
    for(i=0; i<r; i++){
        for(j=0; j<c; j++){
            System.out.println("Result of the student of  class "+ (i+1) + " : "+ a[i][j]);
        }
        System.out.println();
    }

    }
}
