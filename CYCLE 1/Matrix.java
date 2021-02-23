import java.util.Scanner;

public class Matrix
{
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int r1, r2, c1, c2;
 System.out.println("Enter the number of rows in the first matrix : ");
 r1 = sc.nextInt();
 System.out.println("Enter the number of columns in the first matrix : ");
 c1 = sc.nextInt();
 System.out.println("Enter the number of rows in the second matrix : ");
 r2 = sc.nextInt();
 System.out.println("Enter the number of columns in the second matrix : ");
 c2 = sc.nextInt();
 if (c1 != r2) {
 System.out.println("The matrices cannot be multiplied!");
 } else {
int mat1[][] = new int[r1][c1];
 int mat2[][] = new int[r2][c2];
 System.out.println("Enter the elements of the first matrix row wise : ");
 int i, j;
 for (i = 0; i < r1; ++i) {
 for (j = 0; j < c1; ++j) {
 mat1[i][j] = sc.nextInt();
 }
 }
 System.out.println("Enter the elements of the second matrix row wise : ");
 for (i = 0; i < r2; ++i) {
 for (j = 0; j < c2; ++j) {
 mat2[i][j] = sc.nextInt();
 }
 }
 int multiply[][] = new int[r1][c2];
 for (i = 0; i < r1; ++i) {
 for (j = 0; j < c2; ++j) {
 for (int k = 0; k < c1; ++k) {
 multiply[i][j] += mat1[i][k] * mat2[k][j];
 }
 }
 }
 System.out.println("The resulting product matrix is : ");
 for (i = 0; i < r1; ++i) {
 for (j = 0; j < c2; ++j) {
 System.out.print(multiply[i][j] + "\t ");
 }
System.out.print("\n");
 }
 }
  sc.close();
 }
}