// write the array to store the marks of the student of 5 also explain how to display the arrray
import java.util.Scanner;

class OneDrray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;

          System.out.print("Enter the no of Student:");
          n = sc.nextInt();
          int a[] = new int[n];

          System.out.print("Enter the Marks of the Student"+ n +" : ");
            for (i = 0; i<n; i++){
                a[i] = sc.nextInt();
            }
            for(i = 0; i<=n-1; i++){
                System.out.println("Marks of the stuent " + (i+1) + " = " + a[i]);
            }
        }
    
}